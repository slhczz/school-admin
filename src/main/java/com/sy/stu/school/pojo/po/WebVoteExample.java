package com.sy.stu.school.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebVoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebVoteExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andColorsIsNull() {
            addCriterion("colors is null");
            return (Criteria) this;
        }

        public Criteria andColorsIsNotNull() {
            addCriterion("colors is not null");
            return (Criteria) this;
        }

        public Criteria andColorsEqualTo(String value) {
            addCriterion("colors =", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsNotEqualTo(String value) {
            addCriterion("colors <>", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsGreaterThan(String value) {
            addCriterion("colors >", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsGreaterThanOrEqualTo(String value) {
            addCriterion("colors >=", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsLessThan(String value) {
            addCriterion("colors <", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsLessThanOrEqualTo(String value) {
            addCriterion("colors <=", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsLike(String value) {
            addCriterion("colors like", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsNotLike(String value) {
            addCriterion("colors not like", value, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsIn(List<String> values) {
            addCriterion("colors in", values, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsNotIn(List<String> values) {
            addCriterion("colors not in", values, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsBetween(String value1, String value2) {
            addCriterion("colors between", value1, value2, "colors");
            return (Criteria) this;
        }

        public Criteria andColorsNotBetween(String value1, String value2) {
            addCriterion("colors not between", value1, value2, "colors");
            return (Criteria) this;
        }

        public Criteria andItem1IsNull() {
            addCriterion("item1 is null");
            return (Criteria) this;
        }

        public Criteria andItem1IsNotNull() {
            addCriterion("item1 is not null");
            return (Criteria) this;
        }

        public Criteria andItem1EqualTo(String value) {
            addCriterion("item1 =", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotEqualTo(String value) {
            addCriterion("item1 <>", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThan(String value) {
            addCriterion("item1 >", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThanOrEqualTo(String value) {
            addCriterion("item1 >=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThan(String value) {
            addCriterion("item1 <", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThanOrEqualTo(String value) {
            addCriterion("item1 <=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Like(String value) {
            addCriterion("item1 like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotLike(String value) {
            addCriterion("item1 not like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1In(List<String> values) {
            addCriterion("item1 in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotIn(List<String> values) {
            addCriterion("item1 not in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Between(String value1, String value2) {
            addCriterion("item1 between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotBetween(String value1, String value2) {
            addCriterion("item1 not between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem2IsNull() {
            addCriterion("item2 is null");
            return (Criteria) this;
        }

        public Criteria andItem2IsNotNull() {
            addCriterion("item2 is not null");
            return (Criteria) this;
        }

        public Criteria andItem2EqualTo(String value) {
            addCriterion("item2 =", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotEqualTo(String value) {
            addCriterion("item2 <>", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThan(String value) {
            addCriterion("item2 >", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThanOrEqualTo(String value) {
            addCriterion("item2 >=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThan(String value) {
            addCriterion("item2 <", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThanOrEqualTo(String value) {
            addCriterion("item2 <=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Like(String value) {
            addCriterion("item2 like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotLike(String value) {
            addCriterion("item2 not like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2In(List<String> values) {
            addCriterion("item2 in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotIn(List<String> values) {
            addCriterion("item2 not in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Between(String value1, String value2) {
            addCriterion("item2 between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotBetween(String value1, String value2) {
            addCriterion("item2 not between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem3IsNull() {
            addCriterion("item3 is null");
            return (Criteria) this;
        }

        public Criteria andItem3IsNotNull() {
            addCriterion("item3 is not null");
            return (Criteria) this;
        }

        public Criteria andItem3EqualTo(String value) {
            addCriterion("item3 =", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotEqualTo(String value) {
            addCriterion("item3 <>", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThan(String value) {
            addCriterion("item3 >", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThanOrEqualTo(String value) {
            addCriterion("item3 >=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThan(String value) {
            addCriterion("item3 <", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThanOrEqualTo(String value) {
            addCriterion("item3 <=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Like(String value) {
            addCriterion("item3 like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotLike(String value) {
            addCriterion("item3 not like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3In(List<String> values) {
            addCriterion("item3 in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotIn(List<String> values) {
            addCriterion("item3 not in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Between(String value1, String value2) {
            addCriterion("item3 between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotBetween(String value1, String value2) {
            addCriterion("item3 not between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem4IsNull() {
            addCriterion("item4 is null");
            return (Criteria) this;
        }

        public Criteria andItem4IsNotNull() {
            addCriterion("item4 is not null");
            return (Criteria) this;
        }

        public Criteria andItem4EqualTo(String value) {
            addCriterion("item4 =", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotEqualTo(String value) {
            addCriterion("item4 <>", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThan(String value) {
            addCriterion("item4 >", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThanOrEqualTo(String value) {
            addCriterion("item4 >=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThan(String value) {
            addCriterion("item4 <", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThanOrEqualTo(String value) {
            addCriterion("item4 <=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Like(String value) {
            addCriterion("item4 like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotLike(String value) {
            addCriterion("item4 not like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4In(List<String> values) {
            addCriterion("item4 in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotIn(List<String> values) {
            addCriterion("item4 not in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Between(String value1, String value2) {
            addCriterion("item4 between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotBetween(String value1, String value2) {
            addCriterion("item4 not between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem5IsNull() {
            addCriterion("item5 is null");
            return (Criteria) this;
        }

        public Criteria andItem5IsNotNull() {
            addCriterion("item5 is not null");
            return (Criteria) this;
        }

        public Criteria andItem5EqualTo(String value) {
            addCriterion("item5 =", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotEqualTo(String value) {
            addCriterion("item5 <>", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThan(String value) {
            addCriterion("item5 >", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThanOrEqualTo(String value) {
            addCriterion("item5 >=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThan(String value) {
            addCriterion("item5 <", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThanOrEqualTo(String value) {
            addCriterion("item5 <=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5Like(String value) {
            addCriterion("item5 like", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotLike(String value) {
            addCriterion("item5 not like", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5In(List<String> values) {
            addCriterion("item5 in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotIn(List<String> values) {
            addCriterion("item5 not in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5Between(String value1, String value2) {
            addCriterion("item5 between", value1, value2, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotBetween(String value1, String value2) {
            addCriterion("item5 not between", value1, value2, "item5");
            return (Criteria) this;
        }

        public Criteria andItem6IsNull() {
            addCriterion("item6 is null");
            return (Criteria) this;
        }

        public Criteria andItem6IsNotNull() {
            addCriterion("item6 is not null");
            return (Criteria) this;
        }

        public Criteria andItem6EqualTo(String value) {
            addCriterion("item6 =", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotEqualTo(String value) {
            addCriterion("item6 <>", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6GreaterThan(String value) {
            addCriterion("item6 >", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6GreaterThanOrEqualTo(String value) {
            addCriterion("item6 >=", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6LessThan(String value) {
            addCriterion("item6 <", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6LessThanOrEqualTo(String value) {
            addCriterion("item6 <=", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6Like(String value) {
            addCriterion("item6 like", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotLike(String value) {
            addCriterion("item6 not like", value, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6In(List<String> values) {
            addCriterion("item6 in", values, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotIn(List<String> values) {
            addCriterion("item6 not in", values, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6Between(String value1, String value2) {
            addCriterion("item6 between", value1, value2, "item6");
            return (Criteria) this;
        }

        public Criteria andItem6NotBetween(String value1, String value2) {
            addCriterion("item6 not between", value1, value2, "item6");
            return (Criteria) this;
        }

        public Criteria andItem7IsNull() {
            addCriterion("item7 is null");
            return (Criteria) this;
        }

        public Criteria andItem7IsNotNull() {
            addCriterion("item7 is not null");
            return (Criteria) this;
        }

        public Criteria andItem7EqualTo(String value) {
            addCriterion("item7 =", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7NotEqualTo(String value) {
            addCriterion("item7 <>", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7GreaterThan(String value) {
            addCriterion("item7 >", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7GreaterThanOrEqualTo(String value) {
            addCriterion("item7 >=", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7LessThan(String value) {
            addCriterion("item7 <", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7LessThanOrEqualTo(String value) {
            addCriterion("item7 <=", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7Like(String value) {
            addCriterion("item7 like", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7NotLike(String value) {
            addCriterion("item7 not like", value, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7In(List<String> values) {
            addCriterion("item7 in", values, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7NotIn(List<String> values) {
            addCriterion("item7 not in", values, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7Between(String value1, String value2) {
            addCriterion("item7 between", value1, value2, "item7");
            return (Criteria) this;
        }

        public Criteria andItem7NotBetween(String value1, String value2) {
            addCriterion("item7 not between", value1, value2, "item7");
            return (Criteria) this;
        }

        public Criteria andItem8IsNull() {
            addCriterion("item8 is null");
            return (Criteria) this;
        }

        public Criteria andItem8IsNotNull() {
            addCriterion("item8 is not null");
            return (Criteria) this;
        }

        public Criteria andItem8EqualTo(String value) {
            addCriterion("item8 =", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8NotEqualTo(String value) {
            addCriterion("item8 <>", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8GreaterThan(String value) {
            addCriterion("item8 >", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8GreaterThanOrEqualTo(String value) {
            addCriterion("item8 >=", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8LessThan(String value) {
            addCriterion("item8 <", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8LessThanOrEqualTo(String value) {
            addCriterion("item8 <=", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8Like(String value) {
            addCriterion("item8 like", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8NotLike(String value) {
            addCriterion("item8 not like", value, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8In(List<String> values) {
            addCriterion("item8 in", values, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8NotIn(List<String> values) {
            addCriterion("item8 not in", values, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8Between(String value1, String value2) {
            addCriterion("item8 between", value1, value2, "item8");
            return (Criteria) this;
        }

        public Criteria andItem8NotBetween(String value1, String value2) {
            addCriterion("item8 not between", value1, value2, "item8");
            return (Criteria) this;
        }

        public Criteria andItem9IsNull() {
            addCriterion("item9 is null");
            return (Criteria) this;
        }

        public Criteria andItem9IsNotNull() {
            addCriterion("item9 is not null");
            return (Criteria) this;
        }

        public Criteria andItem9EqualTo(String value) {
            addCriterion("item9 =", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9NotEqualTo(String value) {
            addCriterion("item9 <>", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9GreaterThan(String value) {
            addCriterion("item9 >", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9GreaterThanOrEqualTo(String value) {
            addCriterion("item9 >=", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9LessThan(String value) {
            addCriterion("item9 <", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9LessThanOrEqualTo(String value) {
            addCriterion("item9 <=", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9Like(String value) {
            addCriterion("item9 like", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9NotLike(String value) {
            addCriterion("item9 not like", value, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9In(List<String> values) {
            addCriterion("item9 in", values, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9NotIn(List<String> values) {
            addCriterion("item9 not in", values, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9Between(String value1, String value2) {
            addCriterion("item9 between", value1, value2, "item9");
            return (Criteria) this;
        }

        public Criteria andItem9NotBetween(String value1, String value2) {
            addCriterion("item9 not between", value1, value2, "item9");
            return (Criteria) this;
        }

        public Criteria andItem10IsNull() {
            addCriterion("item10 is null");
            return (Criteria) this;
        }

        public Criteria andItem10IsNotNull() {
            addCriterion("item10 is not null");
            return (Criteria) this;
        }

        public Criteria andItem10EqualTo(String value) {
            addCriterion("item10 =", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10NotEqualTo(String value) {
            addCriterion("item10 <>", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10GreaterThan(String value) {
            addCriterion("item10 >", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10GreaterThanOrEqualTo(String value) {
            addCriterion("item10 >=", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10LessThan(String value) {
            addCriterion("item10 <", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10LessThanOrEqualTo(String value) {
            addCriterion("item10 <=", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10Like(String value) {
            addCriterion("item10 like", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10NotLike(String value) {
            addCriterion("item10 not like", value, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10In(List<String> values) {
            addCriterion("item10 in", values, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10NotIn(List<String> values) {
            addCriterion("item10 not in", values, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10Between(String value1, String value2) {
            addCriterion("item10 between", value1, value2, "item10");
            return (Criteria) this;
        }

        public Criteria andItem10NotBetween(String value1, String value2) {
            addCriterion("item10 not between", value1, value2, "item10");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andPs1IsNull() {
            addCriterion("ps1 is null");
            return (Criteria) this;
        }

        public Criteria andPs1IsNotNull() {
            addCriterion("ps1 is not null");
            return (Criteria) this;
        }

        public Criteria andPs1EqualTo(String value) {
            addCriterion("ps1 =", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1NotEqualTo(String value) {
            addCriterion("ps1 <>", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1GreaterThan(String value) {
            addCriterion("ps1 >", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1GreaterThanOrEqualTo(String value) {
            addCriterion("ps1 >=", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1LessThan(String value) {
            addCriterion("ps1 <", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1LessThanOrEqualTo(String value) {
            addCriterion("ps1 <=", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1Like(String value) {
            addCriterion("ps1 like", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1NotLike(String value) {
            addCriterion("ps1 not like", value, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1In(List<String> values) {
            addCriterion("ps1 in", values, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1NotIn(List<String> values) {
            addCriterion("ps1 not in", values, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1Between(String value1, String value2) {
            addCriterion("ps1 between", value1, value2, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs1NotBetween(String value1, String value2) {
            addCriterion("ps1 not between", value1, value2, "ps1");
            return (Criteria) this;
        }

        public Criteria andPs2IsNull() {
            addCriterion("ps2 is null");
            return (Criteria) this;
        }

        public Criteria andPs2IsNotNull() {
            addCriterion("ps2 is not null");
            return (Criteria) this;
        }

        public Criteria andPs2EqualTo(String value) {
            addCriterion("ps2 =", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2NotEqualTo(String value) {
            addCriterion("ps2 <>", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2GreaterThan(String value) {
            addCriterion("ps2 >", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2GreaterThanOrEqualTo(String value) {
            addCriterion("ps2 >=", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2LessThan(String value) {
            addCriterion("ps2 <", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2LessThanOrEqualTo(String value) {
            addCriterion("ps2 <=", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2Like(String value) {
            addCriterion("ps2 like", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2NotLike(String value) {
            addCriterion("ps2 not like", value, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2In(List<String> values) {
            addCriterion("ps2 in", values, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2NotIn(List<String> values) {
            addCriterion("ps2 not in", values, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2Between(String value1, String value2) {
            addCriterion("ps2 between", value1, value2, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs2NotBetween(String value1, String value2) {
            addCriterion("ps2 not between", value1, value2, "ps2");
            return (Criteria) this;
        }

        public Criteria andPs3IsNull() {
            addCriterion("ps3 is null");
            return (Criteria) this;
        }

        public Criteria andPs3IsNotNull() {
            addCriterion("ps3 is not null");
            return (Criteria) this;
        }

        public Criteria andPs3EqualTo(String value) {
            addCriterion("ps3 =", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3NotEqualTo(String value) {
            addCriterion("ps3 <>", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3GreaterThan(String value) {
            addCriterion("ps3 >", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3GreaterThanOrEqualTo(String value) {
            addCriterion("ps3 >=", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3LessThan(String value) {
            addCriterion("ps3 <", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3LessThanOrEqualTo(String value) {
            addCriterion("ps3 <=", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3Like(String value) {
            addCriterion("ps3 like", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3NotLike(String value) {
            addCriterion("ps3 not like", value, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3In(List<String> values) {
            addCriterion("ps3 in", values, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3NotIn(List<String> values) {
            addCriterion("ps3 not in", values, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3Between(String value1, String value2) {
            addCriterion("ps3 between", value1, value2, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs3NotBetween(String value1, String value2) {
            addCriterion("ps3 not between", value1, value2, "ps3");
            return (Criteria) this;
        }

        public Criteria andPs4IsNull() {
            addCriterion("ps4 is null");
            return (Criteria) this;
        }

        public Criteria andPs4IsNotNull() {
            addCriterion("ps4 is not null");
            return (Criteria) this;
        }

        public Criteria andPs4EqualTo(String value) {
            addCriterion("ps4 =", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4NotEqualTo(String value) {
            addCriterion("ps4 <>", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4GreaterThan(String value) {
            addCriterion("ps4 >", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4GreaterThanOrEqualTo(String value) {
            addCriterion("ps4 >=", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4LessThan(String value) {
            addCriterion("ps4 <", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4LessThanOrEqualTo(String value) {
            addCriterion("ps4 <=", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4Like(String value) {
            addCriterion("ps4 like", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4NotLike(String value) {
            addCriterion("ps4 not like", value, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4In(List<String> values) {
            addCriterion("ps4 in", values, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4NotIn(List<String> values) {
            addCriterion("ps4 not in", values, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4Between(String value1, String value2) {
            addCriterion("ps4 between", value1, value2, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs4NotBetween(String value1, String value2) {
            addCriterion("ps4 not between", value1, value2, "ps4");
            return (Criteria) this;
        }

        public Criteria andPs5IsNull() {
            addCriterion("ps5 is null");
            return (Criteria) this;
        }

        public Criteria andPs5IsNotNull() {
            addCriterion("ps5 is not null");
            return (Criteria) this;
        }

        public Criteria andPs5EqualTo(String value) {
            addCriterion("ps5 =", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5NotEqualTo(String value) {
            addCriterion("ps5 <>", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5GreaterThan(String value) {
            addCriterion("ps5 >", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5GreaterThanOrEqualTo(String value) {
            addCriterion("ps5 >=", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5LessThan(String value) {
            addCriterion("ps5 <", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5LessThanOrEqualTo(String value) {
            addCriterion("ps5 <=", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5Like(String value) {
            addCriterion("ps5 like", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5NotLike(String value) {
            addCriterion("ps5 not like", value, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5In(List<String> values) {
            addCriterion("ps5 in", values, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5NotIn(List<String> values) {
            addCriterion("ps5 not in", values, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5Between(String value1, String value2) {
            addCriterion("ps5 between", value1, value2, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs5NotBetween(String value1, String value2) {
            addCriterion("ps5 not between", value1, value2, "ps5");
            return (Criteria) this;
        }

        public Criteria andPs6IsNull() {
            addCriterion("ps6 is null");
            return (Criteria) this;
        }

        public Criteria andPs6IsNotNull() {
            addCriterion("ps6 is not null");
            return (Criteria) this;
        }

        public Criteria andPs6EqualTo(String value) {
            addCriterion("ps6 =", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6NotEqualTo(String value) {
            addCriterion("ps6 <>", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6GreaterThan(String value) {
            addCriterion("ps6 >", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6GreaterThanOrEqualTo(String value) {
            addCriterion("ps6 >=", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6LessThan(String value) {
            addCriterion("ps6 <", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6LessThanOrEqualTo(String value) {
            addCriterion("ps6 <=", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6Like(String value) {
            addCriterion("ps6 like", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6NotLike(String value) {
            addCriterion("ps6 not like", value, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6In(List<String> values) {
            addCriterion("ps6 in", values, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6NotIn(List<String> values) {
            addCriterion("ps6 not in", values, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6Between(String value1, String value2) {
            addCriterion("ps6 between", value1, value2, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs6NotBetween(String value1, String value2) {
            addCriterion("ps6 not between", value1, value2, "ps6");
            return (Criteria) this;
        }

        public Criteria andPs7IsNull() {
            addCriterion("ps7 is null");
            return (Criteria) this;
        }

        public Criteria andPs7IsNotNull() {
            addCriterion("ps7 is not null");
            return (Criteria) this;
        }

        public Criteria andPs7EqualTo(String value) {
            addCriterion("ps7 =", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7NotEqualTo(String value) {
            addCriterion("ps7 <>", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7GreaterThan(String value) {
            addCriterion("ps7 >", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7GreaterThanOrEqualTo(String value) {
            addCriterion("ps7 >=", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7LessThan(String value) {
            addCriterion("ps7 <", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7LessThanOrEqualTo(String value) {
            addCriterion("ps7 <=", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7Like(String value) {
            addCriterion("ps7 like", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7NotLike(String value) {
            addCriterion("ps7 not like", value, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7In(List<String> values) {
            addCriterion("ps7 in", values, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7NotIn(List<String> values) {
            addCriterion("ps7 not in", values, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7Between(String value1, String value2) {
            addCriterion("ps7 between", value1, value2, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs7NotBetween(String value1, String value2) {
            addCriterion("ps7 not between", value1, value2, "ps7");
            return (Criteria) this;
        }

        public Criteria andPs8IsNull() {
            addCriterion("ps8 is null");
            return (Criteria) this;
        }

        public Criteria andPs8IsNotNull() {
            addCriterion("ps8 is not null");
            return (Criteria) this;
        }

        public Criteria andPs8EqualTo(String value) {
            addCriterion("ps8 =", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8NotEqualTo(String value) {
            addCriterion("ps8 <>", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8GreaterThan(String value) {
            addCriterion("ps8 >", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8GreaterThanOrEqualTo(String value) {
            addCriterion("ps8 >=", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8LessThan(String value) {
            addCriterion("ps8 <", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8LessThanOrEqualTo(String value) {
            addCriterion("ps8 <=", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8Like(String value) {
            addCriterion("ps8 like", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8NotLike(String value) {
            addCriterion("ps8 not like", value, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8In(List<String> values) {
            addCriterion("ps8 in", values, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8NotIn(List<String> values) {
            addCriterion("ps8 not in", values, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8Between(String value1, String value2) {
            addCriterion("ps8 between", value1, value2, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs8NotBetween(String value1, String value2) {
            addCriterion("ps8 not between", value1, value2, "ps8");
            return (Criteria) this;
        }

        public Criteria andPs9IsNull() {
            addCriterion("ps9 is null");
            return (Criteria) this;
        }

        public Criteria andPs9IsNotNull() {
            addCriterion("ps9 is not null");
            return (Criteria) this;
        }

        public Criteria andPs9EqualTo(String value) {
            addCriterion("ps9 =", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9NotEqualTo(String value) {
            addCriterion("ps9 <>", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9GreaterThan(String value) {
            addCriterion("ps9 >", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9GreaterThanOrEqualTo(String value) {
            addCriterion("ps9 >=", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9LessThan(String value) {
            addCriterion("ps9 <", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9LessThanOrEqualTo(String value) {
            addCriterion("ps9 <=", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9Like(String value) {
            addCriterion("ps9 like", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9NotLike(String value) {
            addCriterion("ps9 not like", value, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9In(List<String> values) {
            addCriterion("ps9 in", values, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9NotIn(List<String> values) {
            addCriterion("ps9 not in", values, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9Between(String value1, String value2) {
            addCriterion("ps9 between", value1, value2, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs9NotBetween(String value1, String value2) {
            addCriterion("ps9 not between", value1, value2, "ps9");
            return (Criteria) this;
        }

        public Criteria andPs10IsNull() {
            addCriterion("ps10 is null");
            return (Criteria) this;
        }

        public Criteria andPs10IsNotNull() {
            addCriterion("ps10 is not null");
            return (Criteria) this;
        }

        public Criteria andPs10EqualTo(String value) {
            addCriterion("ps10 =", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10NotEqualTo(String value) {
            addCriterion("ps10 <>", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10GreaterThan(String value) {
            addCriterion("ps10 >", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10GreaterThanOrEqualTo(String value) {
            addCriterion("ps10 >=", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10LessThan(String value) {
            addCriterion("ps10 <", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10LessThanOrEqualTo(String value) {
            addCriterion("ps10 <=", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10Like(String value) {
            addCriterion("ps10 like", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10NotLike(String value) {
            addCriterion("ps10 not like", value, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10In(List<String> values) {
            addCriterion("ps10 in", values, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10NotIn(List<String> values) {
            addCriterion("ps10 not in", values, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10Between(String value1, String value2) {
            addCriterion("ps10 between", value1, value2, "ps10");
            return (Criteria) this;
        }

        public Criteria andPs10NotBetween(String value1, String value2) {
            addCriterion("ps10 not between", value1, value2, "ps10");
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