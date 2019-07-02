package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysOrganization;
import org.springframework.stereotype.Repository;
/**
 * @Author lxy
 * @Description :组织机构dao
 * @Date  2019/6/27 10:12
 * @Param 
 * @return 
 **/
@Repository
public interface OrganizationDao extends BaseMapper<SysOrganization> {
}
