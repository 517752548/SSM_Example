package com.fotoable.jkens.dao;

import com.fotoable.jkens.pojo.Bag;
import com.fotoable.jkens.pojo.BagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BagMapper {
    long countByExample(BagExample example);

    int deleteByExample(BagExample example);

    int insert(Bag record);

    int insertSelective(Bag record);

    List<Bag> selectByExample(BagExample example);

    int updateByExampleSelective(@Param("record") Bag record, @Param("example") BagExample example);

    int updateByExample(@Param("record") Bag record, @Param("example") BagExample example);
}