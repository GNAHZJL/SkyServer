package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 添加员工
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 查询员工
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用
     * @param  status, id
     * @return
     */
    void startOrStop(Integer status, Long id);

    /**
     * id查询员工信息
     * @param   id
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param   employeeDTO
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
