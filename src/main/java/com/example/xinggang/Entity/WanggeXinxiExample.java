package com.example.xinggang.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WanggeXinxiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WanggeXinxiExample() {
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

        public Criteria andWanggeNameIsNull() {
            addCriterion("wangge_name is null");
            return (Criteria) this;
        }

        public Criteria andWanggeNameIsNotNull() {
            addCriterion("wangge_name is not null");
            return (Criteria) this;
        }

        public Criteria andWanggeNameEqualTo(String value) {
            addCriterion("wangge_name =", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameNotEqualTo(String value) {
            addCriterion("wangge_name <>", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameGreaterThan(String value) {
            addCriterion("wangge_name >", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameGreaterThanOrEqualTo(String value) {
            addCriterion("wangge_name >=", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameLessThan(String value) {
            addCriterion("wangge_name <", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameLessThanOrEqualTo(String value) {
            addCriterion("wangge_name <=", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameLike(String value) {
            addCriterion("wangge_name like", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameNotLike(String value) {
            addCriterion("wangge_name not like", value, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameIn(List<String> values) {
            addCriterion("wangge_name in", values, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameNotIn(List<String> values) {
            addCriterion("wangge_name not in", values, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameBetween(String value1, String value2) {
            addCriterion("wangge_name between", value1, value2, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggeNameNotBetween(String value1, String value2) {
            addCriterion("wangge_name not between", value1, value2, "wanggeName");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleIsNull() {
            addCriterion("wangge_people is null");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleIsNotNull() {
            addCriterion("wangge_people is not null");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleEqualTo(String value) {
            addCriterion("wangge_people =", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleNotEqualTo(String value) {
            addCriterion("wangge_people <>", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleGreaterThan(String value) {
            addCriterion("wangge_people >", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("wangge_people >=", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleLessThan(String value) {
            addCriterion("wangge_people <", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleLessThanOrEqualTo(String value) {
            addCriterion("wangge_people <=", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleLike(String value) {
            addCriterion("wangge_people like", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleNotLike(String value) {
            addCriterion("wangge_people not like", value, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleIn(List<String> values) {
            addCriterion("wangge_people in", values, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleNotIn(List<String> values) {
            addCriterion("wangge_people not in", values, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleBetween(String value1, String value2) {
            addCriterion("wangge_people between", value1, value2, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andWanggePeopleNotBetween(String value1, String value2) {
            addCriterion("wangge_people not between", value1, value2, "wanggePeople");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andZongshuIsNull() {
            addCriterion("zongshu is null");
            return (Criteria) this;
        }

        public Criteria andZongshuIsNotNull() {
            addCriterion("zongshu is not null");
            return (Criteria) this;
        }

        public Criteria andZongshuEqualTo(String value) {
            addCriterion("zongshu =", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuNotEqualTo(String value) {
            addCriterion("zongshu <>", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuGreaterThan(String value) {
            addCriterion("zongshu >", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuGreaterThanOrEqualTo(String value) {
            addCriterion("zongshu >=", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuLessThan(String value) {
            addCriterion("zongshu <", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuLessThanOrEqualTo(String value) {
            addCriterion("zongshu <=", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuLike(String value) {
            addCriterion("zongshu like", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuNotLike(String value) {
            addCriterion("zongshu not like", value, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuIn(List<String> values) {
            addCriterion("zongshu in", values, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuNotIn(List<String> values) {
            addCriterion("zongshu not in", values, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuBetween(String value1, String value2) {
            addCriterion("zongshu between", value1, value2, "zongshu");
            return (Criteria) this;
        }

        public Criteria andZongshuNotBetween(String value1, String value2) {
            addCriterion("zongshu not between", value1, value2, "zongshu");
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