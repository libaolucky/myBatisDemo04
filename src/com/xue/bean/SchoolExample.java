package com.xue.bean;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SchoolExample() {
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

        public Criteria andScidIsNull() {
            addCriterion("scid is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scid is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scid =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scid <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scid >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scid >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scid <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scid <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scid in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scid not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scid between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scid not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScnameIsNull() {
            addCriterion("scName is null");
            return (Criteria) this;
        }

        public Criteria andScnameIsNotNull() {
            addCriterion("scName is not null");
            return (Criteria) this;
        }

        public Criteria andScnameEqualTo(String value) {
            addCriterion("scName =", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotEqualTo(String value) {
            addCriterion("scName <>", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThan(String value) {
            addCriterion("scName >", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameGreaterThanOrEqualTo(String value) {
            addCriterion("scName >=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThan(String value) {
            addCriterion("scName <", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLessThanOrEqualTo(String value) {
            addCriterion("scName <=", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameLike(String value) {
            addCriterion("scName like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotLike(String value) {
            addCriterion("scName not like", value, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameIn(List<String> values) {
            addCriterion("scName in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotIn(List<String> values) {
            addCriterion("scName not in", values, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameBetween(String value1, String value2) {
            addCriterion("scName between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScnameNotBetween(String value1, String value2) {
            addCriterion("scName not between", value1, value2, "scname");
            return (Criteria) this;
        }

        public Criteria andScadressIsNull() {
            addCriterion("scAdress is null");
            return (Criteria) this;
        }

        public Criteria andScadressIsNotNull() {
            addCriterion("scAdress is not null");
            return (Criteria) this;
        }

        public Criteria andScadressEqualTo(String value) {
            addCriterion("scAdress =", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressNotEqualTo(String value) {
            addCriterion("scAdress <>", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressGreaterThan(String value) {
            addCriterion("scAdress >", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressGreaterThanOrEqualTo(String value) {
            addCriterion("scAdress >=", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressLessThan(String value) {
            addCriterion("scAdress <", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressLessThanOrEqualTo(String value) {
            addCriterion("scAdress <=", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressLike(String value) {
            addCriterion("scAdress like", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressNotLike(String value) {
            addCriterion("scAdress not like", value, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressIn(List<String> values) {
            addCriterion("scAdress in", values, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressNotIn(List<String> values) {
            addCriterion("scAdress not in", values, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressBetween(String value1, String value2) {
            addCriterion("scAdress between", value1, value2, "scadress");
            return (Criteria) this;
        }

        public Criteria andScadressNotBetween(String value1, String value2) {
            addCriterion("scAdress not between", value1, value2, "scadress");
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