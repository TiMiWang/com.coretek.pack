package com.coretek.pack.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.coretek.pack.model.LogInfo;
import com.coretek.pack.model.LogInfoExample;

public interface IlogInfoService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int countByExample(LogInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int deleteByExample(LogInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int insert(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int insertSelective(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    List<LogInfo> selectByExample(LogInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    LogInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LogInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LogInfo record);
}