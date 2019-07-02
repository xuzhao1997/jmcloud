package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysPrivDataRel;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 数据权限关联dao
 * @Date  2019/6/27 10:24
 * @Param 
 * @return 
 **/
@Repository
public interface PrivDataRelDao extends BaseMapper<SysPrivDataRel> {
}
