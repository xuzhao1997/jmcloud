package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SysFuncMenu;
import org.springframework.stereotype.Repository;

/**
 * @Author lxy
 * @Description :系统菜单dao
 * @Date  2019/6/27 10:20
 * @Param 
 * @return 
 **/
@Repository
public interface FuncMenuDao extends BaseMapper<SysFuncMenu> {
}
