package com.xue.dao;

import com.xue.bean.Student;
import com.xue.bean.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDAO {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //多对多的查询 查询啦啦啦 都有哪些角色
      List<Student> selectStudentBynsname(String sName);
}