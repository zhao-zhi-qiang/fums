package com.fums.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FollowPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FollowPatientExample() {
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

        public Criteria andHospitalDepartmentIdIsNull() {
            addCriterion("hospital_department_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdIsNotNull() {
            addCriterion("hospital_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdEqualTo(Integer value) {
            addCriterion("hospital_department_id =", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdNotEqualTo(Integer value) {
            addCriterion("hospital_department_id <>", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdGreaterThan(Integer value) {
            addCriterion("hospital_department_id >", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_id >=", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdLessThan(Integer value) {
            addCriterion("hospital_department_id <", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_id <=", value, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdIn(List<Integer> values) {
            addCriterion("hospital_department_id in", values, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdNotIn(List<Integer> values) {
            addCriterion("hospital_department_id not in", values, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_id between", value1, value2, "hospitalDepartmentId");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_id not between", value1, value2, "hospitalDepartmentId");
            return (Criteria) this;
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpIsNull() {
            addCriterion("date_of_next_follow_up is null");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpIsNotNull() {
            addCriterion("date_of_next_follow_up is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up =", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up <>", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up >", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up >=", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpLessThan(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up <", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_next_follow_up <=", value, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_next_follow_up in", values, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_next_follow_up not in", values, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_next_follow_up between", value1, value2, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDateOfNextFollowUpNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_next_follow_up not between", value1, value2, "dateOfNextFollowUp");
            return (Criteria) this;
        }

        public Criteria andDelStateIsNull() {
            addCriterion("del_state is null");
            return (Criteria) this;
        }

        public Criteria andDelStateIsNotNull() {
            addCriterion("del_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelStateEqualTo(Integer value) {
            addCriterion("del_state =", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotEqualTo(Integer value) {
            addCriterion("del_state <>", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThan(Integer value) {
            addCriterion("del_state >", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_state >=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThan(Integer value) {
            addCriterion("del_state <", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThanOrEqualTo(Integer value) {
            addCriterion("del_state <=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateIn(List<Integer> values) {
            addCriterion("del_state in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotIn(List<Integer> values) {
            addCriterion("del_state not in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateBetween(Integer value1, Integer value2) {
            addCriterion("del_state between", value1, value2, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotBetween(Integer value1, Integer value2) {
            addCriterion("del_state not between", value1, value2, "delState");
            return (Criteria) this;
        }

        public Criteria andSetOfDateIsNull() {
            addCriterion("set_of_date is null");
            return (Criteria) this;
        }

        public Criteria andSetOfDateIsNotNull() {
            addCriterion("set_of_date is not null");
            return (Criteria) this;
        }

        public Criteria andSetOfDateEqualTo(Date value) {
            addCriterionForJDBCDate("set_of_date =", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("set_of_date <>", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateGreaterThan(Date value) {
            addCriterionForJDBCDate("set_of_date >", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("set_of_date >=", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateLessThan(Date value) {
            addCriterionForJDBCDate("set_of_date <", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("set_of_date <=", value, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateIn(List<Date> values) {
            addCriterionForJDBCDate("set_of_date in", values, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("set_of_date not in", values, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("set_of_date between", value1, value2, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andSetOfDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("set_of_date not between", value1, value2, "setOfDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateIsNull() {
            addCriterion("follow_up_setdate is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateIsNotNull() {
            addCriterion("follow_up_setdate is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateEqualTo(Integer value) {
            addCriterion("follow_up_setdate =", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateNotEqualTo(Integer value) {
            addCriterion("follow_up_setdate <>", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateGreaterThan(Integer value) {
            addCriterion("follow_up_setdate >", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_setdate >=", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateLessThan(Integer value) {
            addCriterion("follow_up_setdate <", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_setdate <=", value, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateIn(List<Integer> values) {
            addCriterion("follow_up_setdate in", values, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateNotIn(List<Integer> values) {
            addCriterion("follow_up_setdate not in", values, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_setdate between", value1, value2, "followUpSetdate");
            return (Criteria) this;
        }

        public Criteria andFollowUpSetdateNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_setdate not between", value1, value2, "followUpSetdate");
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