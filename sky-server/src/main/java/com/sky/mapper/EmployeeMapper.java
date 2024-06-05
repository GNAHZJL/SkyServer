package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 插入
     * @param “对象”
     * @return
     */
    @Insert("insert into employee(name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user,status) " +
            "values " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})")
    void insert(Employee employee);

    /**
     * 分页查询
     * @param “对象
     * ”
     * @return
     */

    Page<Employee>  pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 修改属性
     * @param “对象
     * ”
     * @return
     */
    void update(Employee employee);

    /**
     * id查信息
     * @param “id
     * ”
     * @return
     */
    @Select("select * from employee where id=#{id}")
    Employee getById(Long id);
}
