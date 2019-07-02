package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysDepart;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 部门dao
 * @Date  2019/6/27 10:13
 * @Param
 * @return
 **/
@Repository
public interface DepartDao extends BaseMapper<SysDepart> {
}
