package com.fums.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DataReviewExample() {
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

        public Criteria andFormIsNull() {
            addCriterion("form is null");
            return (Criteria) this;
        }

        public Criteria andFormIsNotNull() {
            addCriterion("form is not null");
            return (Criteria) this;
        }

        public Criteria andFormEqualTo(String value) {
            addCriterion("form =", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotEqualTo(String value) {
            addCriterion("form <>", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThan(String value) {
            addCriterion("form >", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormGreaterThanOrEqualTo(String value) {
            addCriterion("form >=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThan(String value) {
            addCriterion("form <", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLessThanOrEqualTo(String value) {
            addCriterion("form <=", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormLike(String value) {
            addCriterion("form like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotLike(String value) {
            addCriterion("form not like", value, "form");
            return (Criteria) this;
        }

        public Criteria andFormIn(List<String> values) {
            addCriterion("form in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotIn(List<String> values) {
            addCriterion("form not in", values, "form");
            return (Criteria) this;
        }

        public Criteria andFormBetween(String value1, String value2) {
            addCriterion("form between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andFormNotBetween(String value1, String value2) {
            addCriterion("form not between", value1, value2, "form");
            return (Criteria) this;
        }

        public Criteria andDataItemIsNull() {
            addCriterion("data_item is null");
            return (Criteria) this;
        }

        public Criteria andDataItemIsNotNull() {
            addCriterion("data_item is not null");
            return (Criteria) this;
        }

        public Criteria andDataItemEqualTo(String value) {
            addCriterion("data_item =", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemNotEqualTo(String value) {
            addCriterion("data_item <>", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemGreaterThan(String value) {
            addCriterion("data_item >", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemGreaterThanOrEqualTo(String value) {
            addCriterion("data_item >=", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemLessThan(String value) {
            addCriterion("data_item <", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemLessThanOrEqualTo(String value) {
            addCriterion("data_item <=", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemLike(String value) {
            addCriterion("data_item like", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemNotLike(String value) {
            addCriterion("data_item not like", value, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemIn(List<String> values) {
            addCriterion("data_item in", values, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemNotIn(List<String> values) {
            addCriterion("data_item not in", values, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemBetween(String value1, String value2) {
            addCriterion("data_item between", value1, value2, "dataItem");
            return (Criteria) this;
        }

        public Criteria andDataItemNotBetween(String value1, String value2) {
            addCriterion("data_item not between", value1, value2, "dataItem");
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

        public Criteria andPatientIsNull() {
            addCriterion("patient is null");
            return (Criteria) this;
        }

        public Criteria andPatientIsNotNull() {
            addCriterion("patient is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEqualTo(String value) {
            addCriterion("patient =", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotEqualTo(String value) {
            addCriterion("patient <>", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThan(String value) {
            addCriterion("patient >", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientGreaterThanOrEqualTo(String value) {
            addCriterion("patient >=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThan(String value) {
            addCriterion("patient <", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLessThanOrEqualTo(String value) {
            addCriterion("patient <=", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientLike(String value) {
            addCriterion("patient like", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotLike(String value) {
            addCriterion("patient not like", value, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientIn(List<String> values) {
            addCriterion("patient in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotIn(List<String> values) {
            addCriterion("patient not in", values, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientBetween(String value1, String value2) {
            addCriterion("patient between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andPatientNotBetween(String value1, String value2) {
            addCriterion("patient not between", value1, value2, "patient");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("`value` is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("`value` is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("`value` =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("`value` <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("`value` >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("`value` >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("`value` <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("`value` <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("`value` like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("`value` not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("`value` in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("`value` not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("`value` between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("`value` not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andSkepticIsNull() {
            addCriterion("skeptic is null");
            return (Criteria) this;
        }

        public Criteria andSkepticIsNotNull() {
            addCriterion("skeptic is not null");
            return (Criteria) this;
        }

        public Criteria andSkepticEqualTo(String value) {
            addCriterion("skeptic =", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticNotEqualTo(String value) {
            addCriterion("skeptic <>", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticGreaterThan(String value) {
            addCriterion("skeptic >", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticGreaterThanOrEqualTo(String value) {
            addCriterion("skeptic >=", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticLessThan(String value) {
            addCriterion("skeptic <", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticLessThanOrEqualTo(String value) {
            addCriterion("skeptic <=", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticLike(String value) {
            addCriterion("skeptic like", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticNotLike(String value) {
            addCriterion("skeptic not like", value, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticIn(List<String> values) {
            addCriterion("skeptic in", values, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticNotIn(List<String> values) {
            addCriterion("skeptic not in", values, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticBetween(String value1, String value2) {
            addCriterion("skeptic between", value1, value2, "skeptic");
            return (Criteria) this;
        }

        public Criteria andSkepticNotBetween(String value1, String value2) {
            addCriterion("skeptic not between", value1, value2, "skeptic");
            return (Criteria) this;
        }

        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }

        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(String value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(String value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(String value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(String value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(String value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(String value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLike(String value) {
            addCriterion("review like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotLike(String value) {
            addCriterion("review not like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewIn(List<String> values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<String> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(String value1, String value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(String value1, String value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewStateIsNull() {
            addCriterion("review_state is null");
            return (Criteria) this;
        }

        public Criteria andReviewStateIsNotNull() {
            addCriterion("review_state is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStateEqualTo(Integer value) {
            addCriterion("review_state =", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateNotEqualTo(Integer value) {
            addCriterion("review_state <>", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateGreaterThan(Integer value) {
            addCriterion("review_state >", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_state >=", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateLessThan(Integer value) {
            addCriterion("review_state <", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateLessThanOrEqualTo(Integer value) {
            addCriterion("review_state <=", value, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateIn(List<Integer> values) {
            addCriterion("review_state in", values, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateNotIn(List<Integer> values) {
            addCriterion("review_state not in", values, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateBetween(Integer value1, Integer value2) {
            addCriterion("review_state between", value1, value2, "reviewState");
            return (Criteria) this;
        }

        public Criteria andReviewStateNotBetween(Integer value1, Integer value2) {
            addCriterion("review_state not between", value1, value2, "reviewState");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIsNull() {
            addCriterion("proposal_time is null");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIsNotNull() {
            addCriterion("proposal_time is not null");
            return (Criteria) this;
        }

        public Criteria andProposalTimeEqualTo(Date value) {
            addCriterion("proposal_time =", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotEqualTo(Date value) {
            addCriterion("proposal_time <>", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeGreaterThan(Date value) {
            addCriterion("proposal_time >", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proposal_time >=", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeLessThan(Date value) {
            addCriterion("proposal_time <", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeLessThanOrEqualTo(Date value) {
            addCriterion("proposal_time <=", value, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeIn(List<Date> values) {
            addCriterion("proposal_time in", values, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotIn(List<Date> values) {
            addCriterion("proposal_time not in", values, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeBetween(Date value1, Date value2) {
            addCriterion("proposal_time between", value1, value2, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andProposalTimeNotBetween(Date value1, Date value2) {
            addCriterion("proposal_time not between", value1, value2, "proposalTime");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterionForJDBCDate("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterionForJDBCDate("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterionForJDBCDate("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterionForJDBCDate("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date not between", value1, value2, "reviewDate");
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