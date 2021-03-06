package com.lsfly.bas.dao.system.ext;

import com.lsfly.bas.model.system.ext.SysUserList;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 如果需要写sql语句，不要再SysUserMapper写，自己建一个ext文件和ext的xml文件，
 * 比如ExtSysUserMapper.java和ExtSysUserMapper.xml
 */
public interface ExtSysUserMapper {

    List<SysUserList> list(SysUserList sysUserList, RowBounds rowBounds);
    List<SysUserList> list(SysUserList sysUserList);

}