package com.fums.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FollowUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FollowUpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFollowUpIdIsNull() {
            addCriterion("follow_up_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdIsNotNull() {
            addCriterion("follow_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdEqualTo(Integer value) {
            addCriterion("follow_up_id =", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotEqualTo(Integer value) {
            addCriterion("follow_up_id <>", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdGreaterThan(Integer value) {
            addCriterion("follow_up_id >", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_id >=", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdLessThan(Integer value) {
            addCriterion("follow_up_id <", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_id <=", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdIn(List<Integer> values) {
            addCriterion("follow_up_id in", values, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotIn(List<Integer> values) {
            addCriterion("follow_up_id not in", values, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_id between", value1, value2, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_id not between", value1, value2, "followUpId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeIsNull() {
            addCriterion("hospital_department_child_code is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeIsNotNull() {
            addCriterion("hospital_department_child_code is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeEqualTo(Integer value) {
            addCriterion("hospital_department_child_code =", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeNotEqualTo(Integer value) {
            addCriterion("hospital_department_child_code <>", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeGreaterThan(Integer value) {
            addCriterion("hospital_department_child_code >", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_child_code >=", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeLessThan(Integer value) {
            addCriterion("hospital_department_child_code <", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_child_code <=", value, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeIn(List<Integer> values) {
            addCriterion("hospital_department_child_code in", values, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeNotIn(List<Integer> values) {
            addCriterion("hospital_department_child_code not in", values, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_child_code between", value1, value2, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentChildCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_child_code not between", value1, value2, "hospitalDepartmentChildCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalIsNull() {
            addCriterion("follow_up_principal is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalIsNotNull() {
            addCriterion("follow_up_principal is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalEqualTo(String value) {
            addCriterion("follow_up_principal =", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalNotEqualTo(String value) {
            addCriterion("follow_up_principal <>", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalGreaterThan(String value) {
            addCriterion("follow_up_principal >", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_principal >=", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalLessThan(String value) {
            addCriterion("follow_up_principal <", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalLessThanOrEqualTo(String value) {
            addCriterion("follow_up_principal <=", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalLike(String value) {
            addCriterion("follow_up_principal like", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalNotLike(String value) {
            addCriterion("follow_up_principal not like", value, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalIn(List<String> values) {
            addCriterion("follow_up_principal in", values, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalNotIn(List<String> values) {
            addCriterion("follow_up_principal not in", values, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalBetween(String value1, String value2) {
            addCriterion("follow_up_principal between", value1, value2, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpPrincipalNotBetween(String value1, String value2) {
            addCriterion("follow_up_principal not between", value1, value2, "followUpPrincipal");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelIsNull() {
            addCriterion("follow_up_level is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelIsNotNull() {
            addCriterion("follow_up_level is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelEqualTo(Integer value) {
            addCriterion("follow_up_level =", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelNotEqualTo(Integer value) {
            addCriterion("follow_up_level <>", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelGreaterThan(Integer value) {
            addCriterion("follow_up_level >", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_level >=", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelLessThan(Integer value) {
            addCriterion("follow_up_level <", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_level <=", value, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelIn(List<Integer> values) {
            addCriterion("follow_up_level in", values, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelNotIn(List<Integer> values) {
            addCriterion("follow_up_level not in", values, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_level between", value1, value2, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_level not between", value1, value2, "followUpLevel");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameIsNull() {
            addCriterion("follow_up_name is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameIsNotNull() {
            addCriterion("follow_up_name is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameEqualTo(String value) {
            addCriterion("follow_up_name =", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameNotEqualTo(String value) {
            addCriterion("follow_up_name <>", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameGreaterThan(String value) {
            addCriterion("follow_up_name >", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_name >=", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameLessThan(String value) {
            addCriterion("follow_up_name <", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameLessThanOrEqualTo(String value) {
            addCriterion("follow_up_name <=", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameLike(String value) {
            addCriterion("follow_up_name like", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameNotLike(String value) {
            addCriterion("follow_up_name not like", value, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameIn(List<String> values) {
            addCriterion("follow_up_name in", values, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameNotIn(List<String> values) {
            addCriterion("follow_up_name not in", values, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameBetween(String value1, String value2) {
            addCriterion("follow_up_name between", value1, value2, "followUpName");
            return (Criteria) this;
        }

        public Criteria andFollowUpNameNotBetween(String value1, String value2) {
            addCriterion("follow_up_name not between", value1, value2, "followUpName");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeIsNull() {
            addCriterion("follow_up_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeIsNotNull() {
            addCriterion("follow_up_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_create_time =", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_create_time <>", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("follow_up_create_time >", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_create_time >=", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("follow_up_create_time <", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_create_time <=", value, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_create_time in", values, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_create_time not in", values, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_create_time between", value1, value2, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_create_time not between", value1, value2, "followUpCreateTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneIsNull() {
            addCriterion("follow_up_phone is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneIsNotNull() {
            addCriterion("follow_up_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneEqualTo(String value) {
            addCriterion("follow_up_phone =", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneNotEqualTo(String value) {
            addCriterion("follow_up_phone <>", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneGreaterThan(String value) {
            addCriterion("follow_up_phone >", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_phone >=", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneLessThan(String value) {
            addCriterion("follow_up_phone <", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneLessThanOrEqualTo(String value) {
            addCriterion("follow_up_phone <=", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneLike(String value) {
            addCriterion("follow_up_phone like", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneNotLike(String value) {
            addCriterion("follow_up_phone not like", value, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneIn(List<String> values) {
            addCriterion("follow_up_phone in", values, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneNotIn(List<String> values) {
            addCriterion("follow_up_phone not in", values, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneBetween(String value1, String value2) {
            addCriterion("follow_up_phone between", value1, value2, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpPhoneNotBetween(String value1, String value2) {
            addCriterion("follow_up_phone not between", value1, value2, "followUpPhone");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIsNull() {
            addCriterion("follow_up_status is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIsNotNull() {
            addCriterion("follow_up_status is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusEqualTo(Integer value) {
            addCriterion("follow_up_status =", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotEqualTo(Integer value) {
            addCriterion("follow_up_status <>", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusGreaterThan(Integer value) {
            addCriterion("follow_up_status >", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_status >=", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusLessThan(Integer value) {
            addCriterion("follow_up_status <", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_status <=", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIn(List<Integer> values) {
            addCriterion("follow_up_status in", values, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotIn(List<Integer> values) {
            addCriterion("follow_up_status not in", values, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_status between", value1, value2, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_status not between", value1, value2, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeIsNull() {
            addCriterion("follow_up_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeIsNotNull() {
            addCriterion("follow_up_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_start_time =", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_start_time <>", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("follow_up_start_time >", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_start_time >=", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("follow_up_start_time <", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_start_time <=", value, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_start_time in", values, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_start_time not in", values, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_start_time between", value1, value2, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_start_time not between", value1, value2, "followUpStartTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeIsNull() {
            addCriterion("follow_up_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeIsNotNull() {
            addCriterion("follow_up_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_end_time =", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_end_time <>", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("follow_up_end_time >", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_end_time >=", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("follow_up_end_time <", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_end_time <=", value, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_end_time in", values, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_end_time not in", values, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_end_time between", value1, value2, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_end_time not between", value1, value2, "followUpEndTime");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeIsNull() {
            addCriterion("follow_up_code is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeIsNotNull() {
            addCriterion("follow_up_code is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeEqualTo(String value) {
            addCriterion("follow_up_code =", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeNotEqualTo(String value) {
            addCriterion("follow_up_code <>", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeGreaterThan(String value) {
            addCriterion("follow_up_code >", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_code >=", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeLessThan(String value) {
            addCriterion("follow_up_code <", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeLessThanOrEqualTo(String value) {
            addCriterion("follow_up_code <=", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeLike(String value) {
            addCriterion("follow_up_code like", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeNotLike(String value) {
            addCriterion("follow_up_code not like", value, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeIn(List<String> values) {
            addCriterion("follow_up_code in", values, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeNotIn(List<String> values) {
            addCriterion("follow_up_code not in", values, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeBetween(String value1, String value2) {
            addCriterion("follow_up_code between", value1, value2, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpCodeNotBetween(String value1, String value2) {
            addCriterion("follow_up_code not between", value1, value2, "followUpCode");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberIsNull() {
            addCriterion("follow_up_patient_number is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberIsNotNull() {
            addCriterion("follow_up_patient_number is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberEqualTo(Integer value) {
            addCriterion("follow_up_patient_number =", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberNotEqualTo(Integer value) {
            addCriterion("follow_up_patient_number <>", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberGreaterThan(Integer value) {
            addCriterion("follow_up_patient_number >", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_patient_number >=", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberLessThan(Integer value) {
            addCriterion("follow_up_patient_number <", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_patient_number <=", value, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberIn(List<Integer> values) {
            addCriterion("follow_up_patient_number in", values, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberNotIn(List<Integer> values) {
            addCriterion("follow_up_patient_number not in", values, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_patient_number between", value1, value2, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpPatientNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_patient_number not between", value1, value2, "followUpPatientNumber");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupIsNull() {
            addCriterion("follow_up_control_group is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupIsNotNull() {
            addCriterion("follow_up_control_group is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupEqualTo(String value) {
            addCriterion("follow_up_control_group =", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupNotEqualTo(String value) {
            addCriterion("follow_up_control_group <>", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupGreaterThan(String value) {
            addCriterion("follow_up_control_group >", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_control_group >=", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupLessThan(String value) {
            addCriterion("follow_up_control_group <", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupLessThanOrEqualTo(String value) {
            addCriterion("follow_up_control_group <=", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupLike(String value) {
            addCriterion("follow_up_control_group like", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupNotLike(String value) {
            addCriterion("follow_up_control_group not like", value, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupIn(List<String> values) {
            addCriterion("follow_up_control_group in", values, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupNotIn(List<String> values) {
            addCriterion("follow_up_control_group not in", values, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupBetween(String value1, String value2) {
            addCriterion("follow_up_control_group between", value1, value2, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpControlGroupNotBetween(String value1, String value2) {
            addCriterion("follow_up_control_group not between", value1, value2, "followUpControlGroup");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropIsNull() {
            addCriterion("follow_up_backdrop is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropIsNotNull() {
            addCriterion("follow_up_backdrop is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropEqualTo(String value) {
            addCriterion("follow_up_backdrop =", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropNotEqualTo(String value) {
            addCriterion("follow_up_backdrop <>", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropGreaterThan(String value) {
            addCriterion("follow_up_backdrop >", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_backdrop >=", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropLessThan(String value) {
            addCriterion("follow_up_backdrop <", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropLessThanOrEqualTo(String value) {
            addCriterion("follow_up_backdrop <=", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropLike(String value) {
            addCriterion("follow_up_backdrop like", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropNotLike(String value) {
            addCriterion("follow_up_backdrop not like", value, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropIn(List<String> values) {
            addCriterion("follow_up_backdrop in", values, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropNotIn(List<String> values) {
            addCriterion("follow_up_backdrop not in", values, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropBetween(String value1, String value2) {
            addCriterion("follow_up_backdrop between", value1, value2, "followUpBackdrop");
            return (Criteria) this;
        }

        public Criteria andFollowUpBackdropNotBetween(String value1, String value2) {
            addCriterion("follow_up_backdrop not between", value1, value2, "followUpBackdrop");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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