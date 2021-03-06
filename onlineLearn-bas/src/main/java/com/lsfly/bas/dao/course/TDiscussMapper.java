package com.lsfly.bas.dao.course;

import com.lsfly.bas.model.course.TDiscuss;
import com.lsfly.bas.model.course.TDiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TDiscussMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    long countByExample(TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int deleteByExample(TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int insert(TDiscuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int insertSelective(TDiscuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    List<TDiscuss> selectByExampleWithBLOBsWithRowbounds(TDiscussExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    List<TDiscuss> selectByExampleWithBLOBs(TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    List<TDiscuss> selectByExampleWithRowbounds(TDiscussExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    List<TDiscuss> selectByExample(TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    TDiscuss selectByPrimaryKey(String uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TDiscuss record, @Param("example") TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TDiscuss record, @Param("example") TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TDiscuss record, @Param("example") TDiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TDiscuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TDiscuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_discuss
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TDiscuss record);
}