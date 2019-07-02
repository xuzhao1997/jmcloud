package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysInfo;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description : 平台子系统信息dao
 * @Date  2019/6/27 10:22
 * @Param 
 * @return 
 **/
@Repository
public interface InfoDao extends BaseMapper<SysInfo> {
}
