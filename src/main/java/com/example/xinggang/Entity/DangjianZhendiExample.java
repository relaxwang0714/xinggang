package com.example.xinggang.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DangjianZhendiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DangjianZhendiExample() {
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

        public Criteria andDangjianFacilityIsNull() {
            addCriterion("dangjian_facility is null");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityIsNotNull() {
            addCriterion("dangjian_facility is not null");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityEqualTo(String value) {
            addCriterion("dangjian_facility =", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityNotEqualTo(String value) {
            addCriterion("dangjian_facility <>", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityGreaterThan(String value) {
            addCriterion("dangjian_facility >", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("dangjian_facility >=", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityLessThan(String value) {
            addCriterion("dangjian_facility <", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityLessThanOrEqualTo(String value) {
            addCriterion("dangjian_facility <=", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityLike(String value) {
            addCriterion("dangjian_facility like", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityNotLike(String value) {
            addCriterion("dangjian_facility not like", value, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityIn(List<String> values) {
            addCriterion("dangjian_facility in", values, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityNotIn(List<String> values) {
            addCriterion("dangjian_facility not in", values, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityBetween(String value1, String value2) {
            addCriterion("dangjian_facility between", value1, value2, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andDangjianFacilityNotBetween(String value1, String value2) {
            addCriterion("dangjian_facility not between", value1, value2, "dangjianFacility");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleIsNull() {
            addCriterion("response_people is null");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleIsNotNull() {
            addCriterion("response_people is not null");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleEqualTo(String value) {
            addCriterion("response_people =", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleNotEqualTo(String value) {
            addCriterion("response_people <>", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleGreaterThan(String value) {
            addCriterion("response_people >", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("response_people >=", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleLessThan(String value) {
            addCriterion("response_people <", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleLessThanOrEqualTo(String value) {
            addCriterion("response_people <=", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleLike(String value) {
            addCriterion("response_people like", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleNotLike(String value) {
            addCriterion("response_people not like", value, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleIn(List<String> values) {
            addCriterion("response_people in", values, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleNotIn(List<String> values) {
            addCriterion("response_people not in", values, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleBetween(String value1, String value2) {
            addCriterion("response_people between", value1, value2, "responsePeople");
            return (Criteria) this;
        }

        public Criteria andResponsePeopleNotBetween(String value1, String value2) {
            addCriterion("response_people not between", value1, value2, "responsePeople");
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

        public Criteria andShpIsNull() {
            addCriterion("shp is null");
            return (Criteria) this;
        }

        public Criteria andShpIsNotNull() {
            addCriterion("shp is not null");
            return (Criteria) this;
        }

        public Criteria andShpEqualTo(String value) {
            addCriterion("shp =", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpNotEqualTo(String value) {
            addCriterion("shp <>", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpGreaterThan(String value) {
            addCriterion("shp >", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpGreaterThanOrEqualTo(String value) {
            addCriterion("shp >=", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpLessThan(String value) {
            addCriterion("shp <", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpLessThanOrEqualTo(String value) {
            addCriterion("shp <=", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpLike(String value) {
            addCriterion("shp like", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpNotLike(String value) {
            addCriterion("shp not like", value, "shp");
            return (Criteria) this;
        }

        public Criteria andShpIn(List<String> values) {
            addCriterion("shp in", values, "shp");
            return (Criteria) this;
        }

        public Criteria andShpNotIn(List<String> values) {
            addCriterion("shp not in", values, "shp");
            return (Criteria) this;
        }

        public Criteria andShpBetween(String value1, String value2) {
            addCriterion("shp between", value1, value2, "shp");
            return (Criteria) this;
        }

        public Criteria andShpNotBetween(String value1, String value2) {
            addCriterion("shp not between", value1, value2, "shp");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
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