package com.coretek.pack.service;

import com.coretek.pack.model.logInfo;
import com.coretek.pack.model.logInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IlogInfoService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int countByExample(logInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int deleteByExample(logInfoExample example);

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
    int insert(logInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int insertSelective(logInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    List<logInfo> selectByExample(logInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    logInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") logInfo record, @Param("example") logInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") logInfo record, @Param("example") logInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(logInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(logInfo record);
}