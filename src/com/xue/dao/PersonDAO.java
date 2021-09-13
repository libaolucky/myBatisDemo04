package com.xue.dao;

import com.xue.bean.Person;
import com.xue.bean.PersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDAO {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    // 1 对 1   作业3：写出 人和 身份证的 1 对 1  查询。
    Person selectPersonByCard(String pName);

}