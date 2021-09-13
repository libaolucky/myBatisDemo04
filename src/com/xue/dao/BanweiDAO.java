package com.xue.dao;

import com.xue.bean.Banwei;
import com.xue.bean.BanweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanweiDAO {
    long countByExample(BanweiExample example);

    int deleteByExample(BanweiExample example);

    int deleteByPrimaryKey(Integer banid);

    int insert(Banwei record);

    int insertSelective(Banwei record);

    List<Banwei> selectByExample(BanweiExample example);

    Banwei selectByPrimaryKey(Integer banid);

    int updateByExampleSelective(@Param("record") Banwei record, @Param("example") BanweiExample example);

    int updateByExample(@Param("record") Banwei record, @Param("example") BanweiExample example);

    int updateByPrimaryKeySelective(Banwei record);

    int updateByPrimaryKey(Banwei record);
}