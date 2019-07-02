package com.kzdata.jmcloud.common.util.security;

import com.kzdata.jmcloud.common.enums.ResultCode;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JWT工具类
 * 单利模式
 * 使用HS512加密算法
 * @author zhouqi
 * @date 2019-06-06 12:38
 * @version v1.0.0
 * @Description
 *  单例（饿汉）模式
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-06 12:38     zhouqi          v1.0.0           Created
 *
 */
public class JWTUtil {


    private static JWTUtil instance = new JWTUtil();

    private JWTUtil() { }

    public static JWTUtil getInstance() {
        return instance;
    }


    /**
     * 生成JWT TOKEN
     * @param userId 需要保存的用户ID，字符串类型，也可以保存其他的想要保存的东西
     * @param secret 密钥，加密算法需要，对称加密
     * @param exp    过期时间，单位分钟
     * @return  生成的JWT TOKEN
     */
    public String generateToken(String userId, int exp, String secret) {

        HashMap<String, Object> map = new HashMap<>();
        //也可以放置一些其他的参数
        map.put("uid", userId);

        long endTime = System.currentTimeMillis() + 1000 * 60 * exp;

        String token = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(endTime))// 1000 hour
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        return token;

    }


    /**
     * 验证JWT TOKEN
     * @param token     要验证的TOKEN
     * @param secret    密钥，解密需要，对称解密
     * @return
     *      TOKEN验证成功返回JWTResult对象
     * @throws ExpiredJwtException  TOKEN过期抛错
     * @throws SignatureException   签名验证失败抛错
     */
    public JWTResult checkToken(String token, String secret) throws ExpiredJwtException, SignatureException {

        try {
            // parse the token.
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            return new JWTResult(true, body.get("uid").toString(), ResultCode.SUCCESS.getMsg(), ResultCode.SUCCESS.getCode());

        } catch (ExpiredJwtException e) {       //若TOKEN过期则直接抛错
            return new JWTResult(false, null,ResultCode.TOKEN_TIME_OUT.getMsg(), ResultCode.TOKEN_TIME_OUT.getCode());
        } catch (SignatureException e) {        //若签名验证失败则直接抛错
            return new JWTResult(false, null,ResultCode.NO_AUTH_CODE.getMsg(), ResultCode.NO_AUTH_CODE.getCode());
        }catch (Exception e) {
            return new JWTResult(false, null,ResultCode.NO_AUTH_CODE.getMsg(), ResultCode.NO_AUTH_CODE.getCode());
        }

    }


    /**
     * TOKEN解析内容封装
     *
     */
    public static class JWTResult {

        /**
         * TOKEN状态
         * 仅当TOKEN可用一切正常时为true
         * 其它情况均为false
         */
        private boolean status;

        /**
         * 用户ID
         */
        private String uid;

        /**
         * 错误信息，当status==false时该属性值有效
         */
        private String msg;

        /**
         * 错误状态吗
         *  status == true  code == 0
         *  status == false code != 0
         */
        private int code;

        public JWTResult() {
            super();
        }

        public JWTResult(boolean status, String uid, String msg, int code) {
            super();
            this.status = status;
            this.uid = uid;
            this.msg = msg;
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }


}
