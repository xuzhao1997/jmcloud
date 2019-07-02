package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysUserInterrelated;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 系统工号关联关系dao
 * @Date  2019/6/27 10:37
 * @Param 
 * @return 
 **/
@Repository
public interface UserInterrelatedDao extends BaseMapper<SysUserInterrelated> {
}
