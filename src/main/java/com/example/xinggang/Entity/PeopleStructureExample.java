package com.example.xinggang.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeopleStructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeopleStructureExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andZeroEighteenIsNull() {
            addCriterion("zero_eighteen is null");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenIsNotNull() {
            addCriterion("zero_eighteen is not null");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenEqualTo(Integer value) {
            addCriterion("zero_eighteen =", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenNotEqualTo(Integer value) {
            addCriterion("zero_eighteen <>", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenGreaterThan(Integer value) {
            addCriterion("zero_eighteen >", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenGreaterThanOrEqualTo(Integer value) {
            addCriterion("zero_eighteen >=", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenLessThan(Integer value) {
            addCriterion("zero_eighteen <", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenLessThanOrEqualTo(Integer value) {
            addCriterion("zero_eighteen <=", value, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenIn(List<Integer> values) {
            addCriterion("zero_eighteen in", values, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenNotIn(List<Integer> values) {
            addCriterion("zero_eighteen not in", values, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenBetween(Integer value1, Integer value2) {
            addCriterion("zero_eighteen between", value1, value2, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andZeroEighteenNotBetween(Integer value1, Integer value2) {
            addCriterion("zero_eighteen not between", value1, value2, "zeroEighteen");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveIsNull() {
            addCriterion("nighteen_thirtyfive is null");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveIsNotNull() {
            addCriterion("nighteen_thirtyfive is not null");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveEqualTo(Integer value) {
            addCriterion("nighteen_thirtyfive =", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveNotEqualTo(Integer value) {
            addCriterion("nighteen_thirtyfive <>", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveGreaterThan(Integer value) {
            addCriterion("nighteen_thirtyfive >", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("nighteen_thirtyfive >=", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveLessThan(Integer value) {
            addCriterion("nighteen_thirtyfive <", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveLessThanOrEqualTo(Integer value) {
            addCriterion("nighteen_thirtyfive <=", value, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveIn(List<Integer> values) {
            addCriterion("nighteen_thirtyfive in", values, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveNotIn(List<Integer> values) {
            addCriterion("nighteen_thirtyfive not in", values, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveBetween(Integer value1, Integer value2) {
            addCriterion("nighteen_thirtyfive between", value1, value2, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andNighteenThirtyfiveNotBetween(Integer value1, Integer value2) {
            addCriterion("nighteen_thirtyfive not between", value1, value2, "nighteenThirtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveIsNull() {
            addCriterion("thirtyfive_sixtyfive is null");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveIsNotNull() {
            addCriterion("thirtyfive_sixtyfive is not null");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveEqualTo(Integer value) {
            addCriterion("thirtyfive_sixtyfive =", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveNotEqualTo(Integer value) {
            addCriterion("thirtyfive_sixtyfive <>", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveGreaterThan(Integer value) {
            addCriterion("thirtyfive_sixtyfive >", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirtyfive_sixtyfive >=", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveLessThan(Integer value) {
            addCriterion("thirtyfive_sixtyfive <", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveLessThanOrEqualTo(Integer value) {
            addCriterion("thirtyfive_sixtyfive <=", value, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveIn(List<Integer> values) {
            addCriterion("thirtyfive_sixtyfive in", values, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveNotIn(List<Integer> values) {
            addCriterion("thirtyfive_sixtyfive not in", values, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveBetween(Integer value1, Integer value2) {
            addCriterion("thirtyfive_sixtyfive between", value1, value2, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andThirtyfiveSixtyfiveNotBetween(Integer value1, Integer value2) {
            addCriterion("thirtyfive_sixtyfive not between", value1, value2, "thirtyfiveSixtyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveIsNull() {
            addCriterion("sixtyfive_eightyfive is null");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveIsNotNull() {
            addCriterion("sixtyfive_eightyfive is not null");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveEqualTo(Integer value) {
            addCriterion("sixtyfive_eightyfive =", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveNotEqualTo(Integer value) {
            addCriterion("sixtyfive_eightyfive <>", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveGreaterThan(Integer value) {
            addCriterion("sixtyfive_eightyfive >", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("sixtyfive_eightyfive >=", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveLessThan(Integer value) {
            addCriterion("sixtyfive_eightyfive <", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveLessThanOrEqualTo(Integer value) {
            addCriterion("sixtyfive_eightyfive <=", value, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveIn(List<Integer> values) {
            addCriterion("sixtyfive_eightyfive in", values, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveNotIn(List<Integer> values) {
            addCriterion("sixtyfive_eightyfive not in", values, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveBetween(Integer value1, Integer value2) {
            addCriterion("sixtyfive_eightyfive between", value1, value2, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andSixtyfiveEightyfiveNotBetween(Integer value1, Integer value2) {
            addCriterion("sixtyfive_eightyfive not between", value1, value2, "sixtyfiveEightyfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveIsNull() {
            addCriterion("over_eightfive is null");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveIsNotNull() {
            addCriterion("over_eightfive is not null");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveEqualTo(Integer value) {
            addCriterion("over_eightfive =", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveNotEqualTo(Integer value) {
            addCriterion("over_eightfive <>", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveGreaterThan(Integer value) {
            addCriterion("over_eightfive >", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_eightfive >=", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveLessThan(Integer value) {
            addCriterion("over_eightfive <", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveLessThanOrEqualTo(Integer value) {
            addCriterion("over_eightfive <=", value, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveIn(List<Integer> values) {
            addCriterion("over_eightfive in", values, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveNotIn(List<Integer> values) {
            addCriterion("over_eightfive not in", values, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveBetween(Integer value1, Integer value2) {
            addCriterion("over_eightfive between", value1, value2, "overEightfive");
            return (Criteria) this;
        }

        public Criteria andOverEightfiveNotBetween(Integer value1, Integer value2) {
            addCriterion("over_eightfive not between", value1, value2, "overEightfive");
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