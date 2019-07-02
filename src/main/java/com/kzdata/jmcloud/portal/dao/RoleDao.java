package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysRole;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 系统角色dao
 * @Date  2019/6/27 10:32
 * @Param 
 * @return 
 **/
@Repository
public interface RoleDao extends BaseMapper<SysRole> {
}
