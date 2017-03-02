package com.bjike.goddess.user.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.SerAPI;
import com.bjike.goddess.user.dto.DepartmentDTO;
import com.bjike.goddess.user.entity.Department;
import com.bjike.goddess.user.bo.DepartmentBO;
import com.bjike.goddess.user.bo.DepartmentTreeBO;

import java.util.List;

/**
 * 部门业务接口
 *
 * @Author: [liguiqin]
 * @Date: [2016-12-28 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public interface DepartmentAPI extends SerAPI<Department, DepartmentDTO> {
    default List<DepartmentTreeBO> treeData(String id) throws SerException {
        return null;
    }

    default DepartmentBO saveDepartment(Department entity) throws SerException{
        return null;
    }

}
