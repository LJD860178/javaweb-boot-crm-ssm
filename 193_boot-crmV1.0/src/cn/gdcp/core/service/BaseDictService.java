package cn.gdcp.core.service;

import java.util.List;

import cn.gdcp.core.po.BaseDict;

public interface BaseDictService {
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
