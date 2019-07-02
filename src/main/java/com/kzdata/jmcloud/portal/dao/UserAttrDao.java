package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysUserAttr;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 系统用户扩展属性dao
 * @Date  2019/6/27 10:34
 * @Param 
 * @return 
 **/
@Repository
public interface UserAttrDao extends BaseMapper<SysUserAttr> {
}
