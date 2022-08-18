package com.example.xinggang.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangyuanHuodongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DangyuanHuodongExample() {
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

        public Criteria andDangyuanActivityNameIsNull() {
            addCriterion("dangyuan_activity_name is null");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameIsNotNull() {
            addCriterion("dangyuan_activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameEqualTo(String value) {
            addCriterion("dangyuan_activity_name =", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameNotEqualTo(String value) {
            addCriterion("dangyuan_activity_name <>", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameGreaterThan(String value) {
            addCriterion("dangyuan_activity_name >", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("dangyuan_activity_name >=", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameLessThan(String value) {
            addCriterion("dangyuan_activity_name <", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameLessThanOrEqualTo(String value) {
            addCriterion("dangyuan_activity_name <=", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameLike(String value) {
            addCriterion("dangyuan_activity_name like", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameNotLike(String value) {
            addCriterion("dangyuan_activity_name not like", value, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameIn(List<String> values) {
            addCriterion("dangyuan_activity_name in", values, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameNotIn(List<String> values) {
            addCriterion("dangyuan_activity_name not in", values, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameBetween(String value1, String value2) {
            addCriterion("dangyuan_activity_name between", value1, value2, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andDangyuanActivityNameNotBetween(String value1, String value2) {
            addCriterion("dangyuan_activity_name not between", value1, value2, "dangyuanActivityName");
            return (Criteria) this;
        }

        public Criteria andMp4UrlIsNull() {
            addCriterion("mp4_url is null");
            return (Criteria) this;
        }

        public Criteria andMp4UrlIsNotNull() {
            addCriterion("mp4_url is not null");
            return (Criteria) this;
        }

        public Criteria andMp4UrlEqualTo(String value) {
            addCriterion("mp4_url =", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlNotEqualTo(String value) {
            addCriterion("mp4_url <>", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlGreaterThan(String value) {
            addCriterion("mp4_url >", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlGreaterThanOrEqualTo(String value) {
            addCriterion("mp4_url >=", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlLessThan(String value) {
            addCriterion("mp4_url <", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlLessThanOrEqualTo(String value) {
            addCriterion("mp4_url <=", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlLike(String value) {
            addCriterion("mp4_url like", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlNotLike(String value) {
            addCriterion("mp4_url not like", value, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlIn(List<String> values) {
            addCriterion("mp4_url in", values, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlNotIn(List<String> values) {
            addCriterion("mp4_url not in", values, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlBetween(String value1, String value2) {
            addCriterion("mp4_url between", value1, value2, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andMp4UrlNotBetween(String value1, String value2) {
            addCriterion("mp4_url not between", value1, value2, "mp4Url");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Integer value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Integer value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Integer value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Integer value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Integer> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Integer> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
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