package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yc.tims.po.TimsEmp;

@Mapper
public interface TimsEmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(TimsEmp record);

    int insertSelective(TimsEmp record);

    TimsEmp selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(TimsEmp record);

    int updateByPrimaryKey(TimsEmp record);
    
    @Select("SELECT e.* ,ur.role_id from tims_emp  e , user_role ur where e.emp_id = ur.user_id and e.emp_name =#{name} and e.emp_password=#{password}")
    TimsEmp isLogin(@Param("name")String name,@Param("password")String password);
}