package com.bjike.goddess.user.service.rbac;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.user.dto.rbac.UserRoleDTO;
import com.bjike.goddess.user.entity.rbac.UserRole;

import java.util.List;

/**
 * 用户角色业务接口
 *
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public interface UserRoleAPI extends Ser<UserRole, UserRoleDTO> {
    /**
     * 通过用户id查询该用户拥有的角色
     *
     * @param userId
     * @return
     * @throws SerException
     */
    List<UserRole> findByUserId(String userId) throws SerException;

}
