package com.fums.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalDepartmentExample() {
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

        public Criteria andHospitalDepartmentNameIsNull() {
            addCriterion("hospital_department_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameIsNotNull() {
            addCriterion("hospital_department_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameEqualTo(String value) {
            addCriterion("hospital_department_name =", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameNotEqualTo(String value) {
            addCriterion("hospital_department_name <>", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameGreaterThan(String value) {
            addCriterion("hospital_department_name >", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_name >=", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameLessThan(String value) {
            addCriterion("hospital_department_name <", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_name <=", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameLike(String value) {
            addCriterion("hospital_department_name like", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameNotLike(String value) {
            addCriterion("hospital_department_name not like", value, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameIn(List<String> values) {
            addCriterion("hospital_department_name in", values, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameNotIn(List<String> values) {
            addCriterion("hospital_department_name not in", values, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameBetween(String value1, String value2) {
            addCriterion("hospital_department_name between", value1, value2, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("hospital_department_name not between", value1, value2, "hospitalDepartmentName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateIsNull() {
            addCriterion("hospital_department_state is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateIsNotNull() {
            addCriterion("hospital_department_state is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateEqualTo(Integer value) {
            addCriterion("hospital_department_state =", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateNotEqualTo(Integer value) {
            addCriterion("hospital_department_state <>", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateGreaterThan(Integer value) {
            addCriterion("hospital_department_state >", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_state >=", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateLessThan(Integer value) {
            addCriterion("hospital_department_state <", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_department_state <=", value, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateIn(List<Integer> values) {
            addCriterion("hospital_department_state in", values, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateNotIn(List<Integer> values) {
            addCriterion("hospital_department_state not in", values, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_state between", value1, value2, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_department_state not between", value1, value2, "hospitalDepartmentState");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeIsNull() {
            addCriterion("hospital_department_code is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeIsNotNull() {
            addCriterion("hospital_department_code is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeEqualTo(String value) {
            addCriterion("hospital_department_code =", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeNotEqualTo(String value) {
            addCriterion("hospital_department_code <>", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeGreaterThan(String value) {
            addCriterion("hospital_department_code >", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_code >=", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeLessThan(String value) {
            addCriterion("hospital_department_code <", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_code <=", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeLike(String value) {
            addCriterion("hospital_department_code like", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeNotLike(String value) {
            addCriterion("hospital_department_code not like", value, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeIn(List<String> values) {
            addCriterion("hospital_department_code in", values, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeNotIn(List<String> values) {
            addCriterion("hospital_department_code not in", values, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeBetween(String value1, String value2) {
            addCriterion("hospital_department_code between", value1, value2, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("hospital_department_code not between", value1, value2, "hospitalDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeIsNull() {
            addCriterion("hospital_uthority_code is null");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeIsNotNull() {
            addCriterion("hospital_uthority_code is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeEqualTo(String value) {
            addCriterion("hospital_uthority_code =", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeNotEqualTo(String value) {
            addCriterion("hospital_uthority_code <>", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeGreaterThan(String value) {
            addCriterion("hospital_uthority_code >", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_uthority_code >=", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeLessThan(String value) {
            addCriterion("hospital_uthority_code <", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeLessThanOrEqualTo(String value) {
            addCriterion("hospital_uthority_code <=", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeLike(String value) {
            addCriterion("hospital_uthority_code like", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeNotLike(String value) {
            addCriterion("hospital_uthority_code not like", value, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeIn(List<String> values) {
            addCriterion("hospital_uthority_code in", values, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeNotIn(List<String> values) {
            addCriterion("hospital_uthority_code not in", values, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeBetween(String value1, String value2) {
            addCriterion("hospital_uthority_code between", value1, value2, "hospitalUthorityCode");
            return (Criteria) this;
        }

        public Criteria andHospitalUthorityCodeNotBetween(String value1, String value2) {
            addCriterion("hospital_uthority_code not between", value1, value2, "hospitalUthorityCode");
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