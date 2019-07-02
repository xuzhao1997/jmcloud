package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysDataType;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 数据类型dao
 * @Date  2019/6/27 10:17
 * @Param 
 * @return 
 **/
@Repository
public interface DataTypeDao  extends BaseMapper<SysDataType> {
}
