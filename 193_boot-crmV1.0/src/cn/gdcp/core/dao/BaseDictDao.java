package cn.gdcp.core.dao;

import java.util.List;

import cn.gdcp.core.po.BaseDict;

public interface BaseDictDao {
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
