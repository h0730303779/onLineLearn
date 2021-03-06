package com.lsfly.bas.dao.system.ext;

import com.lsfly.bas.model.system.ext.SysDictList;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 如果需要写sql语句，不要再SysDictMapper写，自己建一个ext文件和ext的xml文件，
 * 比如ExtSysDictMapper.java和ExtSysDictMapper.xml
 */
public interface ExtSysDictMapper {

    List<SysDictList> list(SysDictList sysDictList, RowBounds rowBounds);

    //获取所有的数据字典，一对多
    List<SysDictList> listAndDetil();

}