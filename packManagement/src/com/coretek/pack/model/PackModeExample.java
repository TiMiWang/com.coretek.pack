package com.coretek.pack.model;

import java.util.ArrayList;
import java.util.List;

public class PackModeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public PackModeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathIsNull() {
            addCriterion("platform_local_path is null");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathIsNotNull() {
            addCriterion("platform_local_path is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathEqualTo(String value) {
            addCriterion("platform_local_path =", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathNotEqualTo(String value) {
            addCriterion("platform_local_path <>", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathGreaterThan(String value) {
            addCriterion("platform_local_path >", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathGreaterThanOrEqualTo(String value) {
            addCriterion("platform_local_path >=", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathLessThan(String value) {
            addCriterion("platform_local_path <", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathLessThanOrEqualTo(String value) {
            addCriterion("platform_local_path <=", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathLike(String value) {
            addCriterion("platform_local_path like", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathNotLike(String value) {
            addCriterion("platform_local_path not like", value, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathIn(List<String> values) {
            addCriterion("platform_local_path in", values, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathNotIn(List<String> values) {
            addCriterion("platform_local_path not in", values, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathBetween(String value1, String value2) {
            addCriterion("platform_local_path between", value1, value2, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andPlatformLocalPathNotBetween(String value1, String value2) {
            addCriterion("platform_local_path not between", value1, value2, "platformLocalPath");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckIsNull() {
            addCriterion("is_svn_check is null");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckIsNotNull() {
            addCriterion("is_svn_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckEqualTo(Integer value) {
            addCriterion("is_svn_check =", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckNotEqualTo(Integer value) {
            addCriterion("is_svn_check <>", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckGreaterThan(Integer value) {
            addCriterion("is_svn_check >", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_svn_check >=", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckLessThan(Integer value) {
            addCriterion("is_svn_check <", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckLessThanOrEqualTo(Integer value) {
            addCriterion("is_svn_check <=", value, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckIn(List<Integer> values) {
            addCriterion("is_svn_check in", values, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckNotIn(List<Integer> values) {
            addCriterion("is_svn_check not in", values, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckBetween(Integer value1, Integer value2) {
            addCriterion("is_svn_check between", value1, value2, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andIsSvnCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("is_svn_check not between", value1, value2, "isSvnCheck");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathIsNull() {
            addCriterion("svn_net_path is null");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathIsNotNull() {
            addCriterion("svn_net_path is not null");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathEqualTo(String value) {
            addCriterion("svn_net_path =", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathNotEqualTo(String value) {
            addCriterion("svn_net_path <>", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathGreaterThan(String value) {
            addCriterion("svn_net_path >", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathGreaterThanOrEqualTo(String value) {
            addCriterion("svn_net_path >=", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathLessThan(String value) {
            addCriterion("svn_net_path <", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathLessThanOrEqualTo(String value) {
            addCriterion("svn_net_path <=", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathLike(String value) {
            addCriterion("svn_net_path like", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathNotLike(String value) {
            addCriterion("svn_net_path not like", value, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathIn(List<String> values) {
            addCriterion("svn_net_path in", values, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathNotIn(List<String> values) {
            addCriterion("svn_net_path not in", values, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathBetween(String value1, String value2) {
            addCriterion("svn_net_path between", value1, value2, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andSvnNetPathNotBetween(String value1, String value2) {
            addCriterion("svn_net_path not between", value1, value2, "svnNetPath");
            return (Criteria) this;
        }

        public Criteria andVersionInfoIsNull() {
            addCriterion("version_info is null");
            return (Criteria) this;
        }

        public Criteria andVersionInfoIsNotNull() {
            addCriterion("version_info is not null");
            return (Criteria) this;
        }

        public Criteria andVersionInfoEqualTo(Integer value) {
            addCriterion("version_info =", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoNotEqualTo(Integer value) {
            addCriterion("version_info <>", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoGreaterThan(Integer value) {
            addCriterion("version_info >", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_info >=", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoLessThan(Integer value) {
            addCriterion("version_info <", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoLessThanOrEqualTo(Integer value) {
            addCriterion("version_info <=", value, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoIn(List<Integer> values) {
            addCriterion("version_info in", values, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoNotIn(List<Integer> values) {
            addCriterion("version_info not in", values, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoBetween(Integer value1, Integer value2) {
            addCriterion("version_info between", value1, value2, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andVersionInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("version_info not between", value1, value2, "versionInfo");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Integer value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Integer value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Integer value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Integer value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Integer value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Integer value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Integer> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Integer> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Integer value1, Integer value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Integer value1, Integer value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNull() {
            addCriterion("system_version is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNotNull() {
            addCriterion("system_version is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionEqualTo(String value) {
            addCriterion("system_version =", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotEqualTo(String value) {
            addCriterion("system_version <>", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThan(String value) {
            addCriterion("system_version >", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("system_version >=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThan(String value) {
            addCriterion("system_version <", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("system_version <=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLike(String value) {
            addCriterion("system_version like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotLike(String value) {
            addCriterion("system_version not like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIn(List<String> values) {
            addCriterion("system_version in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotIn(List<String> values) {
            addCriterion("system_version not in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionBetween(String value1, String value2) {
            addCriterion("system_version between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotBetween(String value1, String value2) {
            addCriterion("system_version not between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIsNull() {
            addCriterion("structure_type is null");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIsNotNull() {
            addCriterion("structure_type is not null");
            return (Criteria) this;
        }

        public Criteria andStructureTypeEqualTo(String value) {
            addCriterion("structure_type =", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotEqualTo(String value) {
            addCriterion("structure_type <>", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThan(String value) {
            addCriterion("structure_type >", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("structure_type >=", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThan(String value) {
            addCriterion("structure_type <", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThanOrEqualTo(String value) {
            addCriterion("structure_type <=", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLike(String value) {
            addCriterion("structure_type like", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotLike(String value) {
            addCriterion("structure_type not like", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIn(List<String> values) {
            addCriterion("structure_type in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotIn(List<String> values) {
            addCriterion("structure_type not in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeBetween(String value1, String value2) {
            addCriterion("structure_type between", value1, value2, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotBetween(String value1, String value2) {
            addCriterion("structure_type not between", value1, value2, "structureType");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyIsNull() {
            addCriterion("is_update_key is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyIsNotNull() {
            addCriterion("is_update_key is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyEqualTo(Integer value) {
            addCriterion("is_update_key =", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyNotEqualTo(Integer value) {
            addCriterion("is_update_key <>", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyGreaterThan(Integer value) {
            addCriterion("is_update_key >", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_update_key >=", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyLessThan(Integer value) {
            addCriterion("is_update_key <", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyLessThanOrEqualTo(Integer value) {
            addCriterion("is_update_key <=", value, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyIn(List<Integer> values) {
            addCriterion("is_update_key in", values, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyNotIn(List<Integer> values) {
            addCriterion("is_update_key not in", values, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyBetween(Integer value1, Integer value2) {
            addCriterion("is_update_key between", value1, value2, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_update_key not between", value1, value2, "isUpdateKey");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidIsNull() {
            addCriterion("is_update_uuid is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidIsNotNull() {
            addCriterion("is_update_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidEqualTo(Integer value) {
            addCriterion("is_update_uuid =", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidNotEqualTo(Integer value) {
            addCriterion("is_update_uuid <>", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidGreaterThan(Integer value) {
            addCriterion("is_update_uuid >", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_update_uuid >=", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidLessThan(Integer value) {
            addCriterion("is_update_uuid <", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidLessThanOrEqualTo(Integer value) {
            addCriterion("is_update_uuid <=", value, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidIn(List<Integer> values) {
            addCriterion("is_update_uuid in", values, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidNotIn(List<Integer> values) {
            addCriterion("is_update_uuid not in", values, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidBetween(Integer value1, Integer value2) {
            addCriterion("is_update_uuid between", value1, value2, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIsUpdateUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_update_uuid not between", value1, value2, "isUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pack_mode
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pack_mode
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}