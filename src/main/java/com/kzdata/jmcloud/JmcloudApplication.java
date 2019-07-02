package com.kzdata.jmcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 * @author zhouqi
 * @date 2019-06-24 18:00
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-24 18:00     zhouqi          v1.0.0           Created
 *
 */
@SpringBootApplication(scanBasePackages = "com.kzdata.jmcloud")
@MapperScan("com.kzdata.jmcloud.**.dao")
public class JmcloudApplication {


    public static void main(String[] args) {
        SpringApplication.run(JmcloudApplication.class, args);
    }


}
