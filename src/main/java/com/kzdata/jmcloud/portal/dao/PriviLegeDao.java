package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysPrivilege;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description :系统权限dao
 * @Date  2019/6/27 10:31
 * @Param 
 * @return 
 **/
@Repository
public interface PriviLegeDao extends BaseMapper<SysPrivilege> {
}
