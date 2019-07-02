package com.kzdata.jmcloud.portal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kzdata.jmcloud.portal.model.entity.SystemUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 用户Dao
 * @author zhouqi
 * @date 2019-06-25 10:26
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-25 10:26     zhouqi          v1.0.0           Created
 *
 */
@Repository
public interface UserDao  extends BaseMapper<SystemUser> {


}
