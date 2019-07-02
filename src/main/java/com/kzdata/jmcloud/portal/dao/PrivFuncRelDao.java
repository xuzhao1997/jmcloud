package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysPrivFuncRel;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 功能节点权限关联dao
 * @Date  2019/6/27 10:26
 * @Param
 * @return
 **/
@Repository
public interface PrivFuncRelDao extends BaseMapper<SysPrivFuncRel> {
}
