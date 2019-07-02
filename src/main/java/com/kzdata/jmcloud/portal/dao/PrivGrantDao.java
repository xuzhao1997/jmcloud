package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysPrivGrant;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 系统授权dao
 * @Date  2019/6/27 10:29
 * @Param
 * @return
 **/
@Repository
public interface PrivGrantDao extends BaseMapper<SysPrivGrant> {
}
