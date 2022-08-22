package com.example.xinggang.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RuoshiQuntiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RuoshiQuntiExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeIsNull() {
            addCriterion("dibao_type is null");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeIsNotNull() {
            addCriterion("dibao_type is not null");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeEqualTo(String value) {
            addCriterion("dibao_type =", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeNotEqualTo(String value) {
            addCriterion("dibao_type <>", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeGreaterThan(String value) {
            addCriterion("dibao_type >", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dibao_type >=", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeLessThan(String value) {
            addCriterion("dibao_type <", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeLessThanOrEqualTo(String value) {
            addCriterion("dibao_type <=", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeLike(String value) {
            addCriterion("dibao_type like", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeNotLike(String value) {
            addCriterion("dibao_type not like", value, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeIn(List<String> values) {
            addCriterion("dibao_type in", values, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeNotIn(List<String> values) {
            addCriterion("dibao_type not in", values, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeBetween(String value1, String value2) {
            addCriterion("dibao_type between", value1, value2, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andDibaoTypeNotBetween(String value1, String value2) {
            addCriterion("dibao_type not between", value1, value2, "dibaoType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeIsNull() {
            addCriterion("canji_type is null");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeIsNotNull() {
            addCriterion("canji_type is not null");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeEqualTo(String value) {
            addCriterion("canji_type =", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeNotEqualTo(String value) {
            addCriterion("canji_type <>", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeGreaterThan(String value) {
            addCriterion("canji_type >", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("canji_type >=", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeLessThan(String value) {
            addCriterion("canji_type <", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeLessThanOrEqualTo(String value) {
            addCriterion("canji_type <=", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeLike(String value) {
            addCriterion("canji_type like", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeNotLike(String value) {
            addCriterion("canji_type not like", value, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeIn(List<String> values) {
            addCriterion("canji_type in", values, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeNotIn(List<String> values) {
            addCriterion("canji_type not in", values, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeBetween(String value1, String value2) {
            addCriterion("canji_type between", value1, value2, "canjiType");
            return (Criteria) this;
        }

        public Criteria andCanjiTypeNotBetween(String value1, String value2) {
            addCriterion("canji_type not between", value1, value2, "canjiType");
            return (Criteria) this;
        }

        public Criteria andIsDibaoIsNull() {
            addCriterion("is_dibao is null");
            return (Criteria) this;
        }

        public Criteria andIsDibaoIsNotNull() {
            addCriterion("is_dibao is not null");
            return (Criteria) this;
        }

        public Criteria andIsDibaoEqualTo(Integer value) {
            addCriterion("is_dibao =", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoNotEqualTo(Integer value) {
            addCriterion("is_dibao <>", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoGreaterThan(Integer value) {
            addCriterion("is_dibao >", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_dibao >=", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoLessThan(Integer value) {
            addCriterion("is_dibao <", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoLessThanOrEqualTo(Integer value) {
            addCriterion("is_dibao <=", value, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoIn(List<Integer> values) {
            addCriterion("is_dibao in", values, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoNotIn(List<Integer> values) {
            addCriterion("is_dibao not in", values, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoBetween(Integer value1, Integer value2) {
            addCriterion("is_dibao between", value1, value2, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsDibaoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_dibao not between", value1, value2, "isDibao");
            return (Criteria) this;
        }

        public Criteria andIsCanjiIsNull() {
            addCriterion("is_canji is null");
            return (Criteria) this;
        }

        public Criteria andIsCanjiIsNotNull() {
            addCriterion("is_canji is not null");
            return (Criteria) this;
        }

        public Criteria andIsCanjiEqualTo(Integer value) {
            addCriterion("is_canji =", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiNotEqualTo(Integer value) {
            addCriterion("is_canji <>", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiGreaterThan(Integer value) {
            addCriterion("is_canji >", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_canji >=", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiLessThan(Integer value) {
            addCriterion("is_canji <", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiLessThanOrEqualTo(Integer value) {
            addCriterion("is_canji <=", value, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiIn(List<Integer> values) {
            addCriterion("is_canji in", values, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiNotIn(List<Integer> values) {
            addCriterion("is_canji not in", values, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiBetween(Integer value1, Integer value2) {
            addCriterion("is_canji between", value1, value2, "isCanji");
            return (Criteria) this;
        }

        public Criteria andIsCanjiNotBetween(Integer value1, Integer value2) {
            addCriterion("is_canji not between", value1, value2, "isCanji");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("village_id is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("village_id is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Integer value) {
            addCriterion("village_id =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Integer value) {
            addCriterion("village_id <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Integer value) {
            addCriterion("village_id >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("village_id >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Integer value) {
            addCriterion("village_id <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Integer value) {
            addCriterion("village_id <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Integer> values) {
            addCriterion("village_id in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Integer> values) {
            addCriterion("village_id not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Integer value1, Integer value2) {
            addCriterion("village_id between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("village_id not between", value1, value2, "villageId");
            return (Criteria) this;
        }
    }

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