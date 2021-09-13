package com.xue.dao;

import com.xue.bean.Clazz;
import com.xue.bean.ClazzExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ClazzDAO {
    long countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);

    Clazz selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);

    //作业1：  写出 学校--学生--班级 的  1 对多  对多的 查询
    List<Clazz> selectClazzBySchoolId(int cid);

    //作业2： 写出 学校--学生--班级 的   多条查询。
    List<Map> slectClazzByStudentBySchool(Map map);
}