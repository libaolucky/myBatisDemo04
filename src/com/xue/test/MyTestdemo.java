package com.xue.test;

import com.xue.bean.Clazz;
import com.xue.bean.Person;
import com.xue.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTestdemo {
    private SqlSession sqlSession;  //面试题： 讲一下 mybatis的执行流程
    private SqlSessionFactory sqlSessionFactory;
    @Before  //在进行@Test 注解之前，执行的方法， 提取重复的代码的
    public void before() throws Exception {
        //加载并读取xml
        String path="SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);
        // sql 连接的 工厂类
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession);
        //sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@66480dd7

    }

    //作业1：  写出 学校--学生--班级 的  1 对多  对多的 查询
    @Test
    public void test01(){
       List<Clazz> clazzes=sqlSession.selectList("com.xue.dao.ClazzDAO.selectClazzBySchoolId",3);
        for (Clazz clazz : clazzes) {
            System.out.println("clazz = " + clazz);
        }
        sqlSession.close();
    }

     //作业2： 写出 学校--学生--班级 的   多条查询。
     @Test
     public void test02(){
        Map map=new HashMap();
        map.put("cid",4);
        
       List<Map> mapList=sqlSession.selectList("com.xue.dao.ClazzDAO.slectClazzByStudentBySchool",map);
         for (Map map1 : mapList) {
             System.out.println("map1 = " + map1); 
         }
         sqlSession.close();
     }

    @Test //作业三:写出 人和 身份证的 1 对 1  查询。
    public void test03(){
        Person person=sqlSession.selectOne("com.xue.dao.PersonDAO.selectPersonByCard","土土");
        System.out.println("person = " + person);
        sqlSession.close();
    }
    //作业4：  写出   学生   学生班委    班委名称   他们 多对多的查询 根据名称查角色
    @Test
    public void test04(){
        List<Student> students=sqlSession.selectList("com.xue.dao.StudentDAO.selectStudentBynsname","玉玉");
        for (Student student : students) {
            System.out.println("student = " + student);
        }
        sqlSession.close();


    }

}
