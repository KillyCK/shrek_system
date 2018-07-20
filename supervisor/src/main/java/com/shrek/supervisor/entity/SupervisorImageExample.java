package com.shrek.supervisor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupervisorImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupervisorImageExample() {
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

        public Criteria andSupervisorImageIdIsNull() {
            addCriterion("supervisor_image_id is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdIsNotNull() {
            addCriterion("supervisor_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdEqualTo(Integer value) {
            addCriterion("supervisor_image_id =", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdNotEqualTo(Integer value) {
            addCriterion("supervisor_image_id <>", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdGreaterThan(Integer value) {
            addCriterion("supervisor_image_id >", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisor_image_id >=", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdLessThan(Integer value) {
            addCriterion("supervisor_image_id <", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("supervisor_image_id <=", value, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdIn(List<Integer> values) {
            addCriterion("supervisor_image_id in", values, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdNotIn(List<Integer> values) {
            addCriterion("supervisor_image_id not in", values, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_image_id between", value1, value2, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_image_id not between", value1, value2, "supervisorImageId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNull() {
            addCriterion("supervisor_id is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNotNull() {
            addCriterion("supervisor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdEqualTo(Integer value) {
            addCriterion("supervisor_id =", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotEqualTo(Integer value) {
            addCriterion("supervisor_id <>", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThan(Integer value) {
            addCriterion("supervisor_id >", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisor_id >=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThan(Integer value) {
            addCriterion("supervisor_id <", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThanOrEqualTo(Integer value) {
            addCriterion("supervisor_id <=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIn(List<Integer> values) {
            addCriterion("supervisor_id in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotIn(List<Integer> values) {
            addCriterion("supervisor_id not in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_id between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_id not between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andImagesTypeIsNull() {
            addCriterion("images_type is null");
            return (Criteria) this;
        }

        public Criteria andImagesTypeIsNotNull() {
            addCriterion("images_type is not null");
            return (Criteria) this;
        }

        public Criteria andImagesTypeEqualTo(Integer value) {
            addCriterion("images_type =", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeNotEqualTo(Integer value) {
            addCriterion("images_type <>", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeGreaterThan(Integer value) {
            addCriterion("images_type >", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("images_type >=", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeLessThan(Integer value) {
            addCriterion("images_type <", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("images_type <=", value, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeIn(List<Integer> values) {
            addCriterion("images_type in", values, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeNotIn(List<Integer> values) {
            addCriterion("images_type not in", values, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeBetween(Integer value1, Integer value2) {
            addCriterion("images_type between", value1, value2, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("images_type not between", value1, value2, "imagesType");
            return (Criteria) this;
        }

        public Criteria andImagesUrlIsNull() {
            addCriterion("images_url is null");
            return (Criteria) this;
        }

        public Criteria andImagesUrlIsNotNull() {
            addCriterion("images_url is not null");
            return (Criteria) this;
        }

        public Criteria andImagesUrlEqualTo(String value) {
            addCriterion("images_url =", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlNotEqualTo(String value) {
            addCriterion("images_url <>", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlGreaterThan(String value) {
            addCriterion("images_url >", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("images_url >=", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlLessThan(String value) {
            addCriterion("images_url <", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlLessThanOrEqualTo(String value) {
            addCriterion("images_url <=", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlLike(String value) {
            addCriterion("images_url like", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlNotLike(String value) {
            addCriterion("images_url not like", value, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlIn(List<String> values) {
            addCriterion("images_url in", values, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlNotIn(List<String> values) {
            addCriterion("images_url not in", values, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlBetween(String value1, String value2) {
            addCriterion("images_url between", value1, value2, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andImagesUrlNotBetween(String value1, String value2) {
            addCriterion("images_url not between", value1, value2, "imagesUrl");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Integer value) {
            addCriterion("display_order =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Integer value) {
            addCriterion("display_order <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Integer value) {
            addCriterion("display_order >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_order >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Integer value) {
            addCriterion("display_order <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("display_order <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Integer> values) {
            addCriterion("display_order in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Integer> values) {
            addCriterion("display_order not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("display_order between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("display_order not between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andImagesDescIsNull() {
            addCriterion("images_desc is null");
            return (Criteria) this;
        }

        public Criteria andImagesDescIsNotNull() {
            addCriterion("images_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImagesDescEqualTo(String value) {
            addCriterion("images_desc =", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescNotEqualTo(String value) {
            addCriterion("images_desc <>", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescGreaterThan(String value) {
            addCriterion("images_desc >", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescGreaterThanOrEqualTo(String value) {
            addCriterion("images_desc >=", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescLessThan(String value) {
            addCriterion("images_desc <", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescLessThanOrEqualTo(String value) {
            addCriterion("images_desc <=", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescLike(String value) {
            addCriterion("images_desc like", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescNotLike(String value) {
            addCriterion("images_desc not like", value, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescIn(List<String> values) {
            addCriterion("images_desc in", values, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescNotIn(List<String> values) {
            addCriterion("images_desc not in", values, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescBetween(String value1, String value2) {
            addCriterion("images_desc between", value1, value2, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andImagesDescNotBetween(String value1, String value2) {
            addCriterion("images_desc not between", value1, value2, "imagesDesc");
            return (Criteria) this;
        }

        public Criteria andInsertByIsNull() {
            addCriterion("insert_by is null");
            return (Criteria) this;
        }

        public Criteria andInsertByIsNotNull() {
            addCriterion("insert_by is not null");
            return (Criteria) this;
        }

        public Criteria andInsertByEqualTo(String value) {
            addCriterion("insert_by =", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotEqualTo(String value) {
            addCriterion("insert_by <>", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByGreaterThan(String value) {
            addCriterion("insert_by >", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByGreaterThanOrEqualTo(String value) {
            addCriterion("insert_by >=", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLessThan(String value) {
            addCriterion("insert_by <", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLessThanOrEqualTo(String value) {
            addCriterion("insert_by <=", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByLike(String value) {
            addCriterion("insert_by like", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotLike(String value) {
            addCriterion("insert_by not like", value, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByIn(List<String> values) {
            addCriterion("insert_by in", values, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotIn(List<String> values) {
            addCriterion("insert_by not in", values, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByBetween(String value1, String value2) {
            addCriterion("insert_by between", value1, value2, "insertBy");
            return (Criteria) this;
        }

        public Criteria andInsertByNotBetween(String value1, String value2) {
            addCriterion("insert_by not between", value1, value2, "insertBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
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