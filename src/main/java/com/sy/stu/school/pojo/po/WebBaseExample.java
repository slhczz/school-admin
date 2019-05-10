package com.sy.stu.school.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class WebBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebBaseExample() {
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

        public Criteria andWebnameIsNull() {
            addCriterion("webname is null");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNotNull() {
            addCriterion("webname is not null");
            return (Criteria) this;
        }

        public Criteria andWebnameEqualTo(String value) {
            addCriterion("webname =", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotEqualTo(String value) {
            addCriterion("webname <>", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThan(String value) {
            addCriterion("webname >", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("webname >=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThan(String value) {
            addCriterion("webname <", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThanOrEqualTo(String value) {
            addCriterion("webname <=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLike(String value) {
            addCriterion("webname like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotLike(String value) {
            addCriterion("webname not like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameIn(List<String> values) {
            addCriterion("webname in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotIn(List<String> values) {
            addCriterion("webname not in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameBetween(String value1, String value2) {
            addCriterion("webname between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotBetween(String value1, String value2) {
            addCriterion("webname not between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebkeyIsNull() {
            addCriterion("webkey is null");
            return (Criteria) this;
        }

        public Criteria andWebkeyIsNotNull() {
            addCriterion("webkey is not null");
            return (Criteria) this;
        }

        public Criteria andWebkeyEqualTo(String value) {
            addCriterion("webkey =", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyNotEqualTo(String value) {
            addCriterion("webkey <>", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyGreaterThan(String value) {
            addCriterion("webkey >", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyGreaterThanOrEqualTo(String value) {
            addCriterion("webkey >=", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyLessThan(String value) {
            addCriterion("webkey <", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyLessThanOrEqualTo(String value) {
            addCriterion("webkey <=", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyLike(String value) {
            addCriterion("webkey like", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyNotLike(String value) {
            addCriterion("webkey not like", value, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyIn(List<String> values) {
            addCriterion("webkey in", values, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyNotIn(List<String> values) {
            addCriterion("webkey not in", values, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyBetween(String value1, String value2) {
            addCriterion("webkey between", value1, value2, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebkeyNotBetween(String value1, String value2) {
            addCriterion("webkey not between", value1, value2, "webkey");
            return (Criteria) this;
        }

        public Criteria andWebbaIsNull() {
            addCriterion("webba is null");
            return (Criteria) this;
        }

        public Criteria andWebbaIsNotNull() {
            addCriterion("webba is not null");
            return (Criteria) this;
        }

        public Criteria andWebbaEqualTo(String value) {
            addCriterion("webba =", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaNotEqualTo(String value) {
            addCriterion("webba <>", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaGreaterThan(String value) {
            addCriterion("webba >", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaGreaterThanOrEqualTo(String value) {
            addCriterion("webba >=", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaLessThan(String value) {
            addCriterion("webba <", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaLessThanOrEqualTo(String value) {
            addCriterion("webba <=", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaLike(String value) {
            addCriterion("webba like", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaNotLike(String value) {
            addCriterion("webba not like", value, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaIn(List<String> values) {
            addCriterion("webba in", values, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaNotIn(List<String> values) {
            addCriterion("webba not in", values, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaBetween(String value1, String value2) {
            addCriterion("webba between", value1, value2, "webba");
            return (Criteria) this;
        }

        public Criteria andWebbaNotBetween(String value1, String value2) {
            addCriterion("webba not between", value1, value2, "webba");
            return (Criteria) this;
        }

        public Criteria andWebjsIsNull() {
            addCriterion("webjs is null");
            return (Criteria) this;
        }

        public Criteria andWebjsIsNotNull() {
            addCriterion("webjs is not null");
            return (Criteria) this;
        }

        public Criteria andWebjsEqualTo(String value) {
            addCriterion("webjs =", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsNotEqualTo(String value) {
            addCriterion("webjs <>", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsGreaterThan(String value) {
            addCriterion("webjs >", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsGreaterThanOrEqualTo(String value) {
            addCriterion("webjs >=", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsLessThan(String value) {
            addCriterion("webjs <", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsLessThanOrEqualTo(String value) {
            addCriterion("webjs <=", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsLike(String value) {
            addCriterion("webjs like", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsNotLike(String value) {
            addCriterion("webjs not like", value, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsIn(List<String> values) {
            addCriterion("webjs in", values, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsNotIn(List<String> values) {
            addCriterion("webjs not in", values, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsBetween(String value1, String value2) {
            addCriterion("webjs between", value1, value2, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebjsNotBetween(String value1, String value2) {
            addCriterion("webjs not between", value1, value2, "webjs");
            return (Criteria) this;
        }

        public Criteria andWebphoneIsNull() {
            addCriterion("webphone is null");
            return (Criteria) this;
        }

        public Criteria andWebphoneIsNotNull() {
            addCriterion("webphone is not null");
            return (Criteria) this;
        }

        public Criteria andWebphoneEqualTo(String value) {
            addCriterion("webphone =", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneNotEqualTo(String value) {
            addCriterion("webphone <>", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneGreaterThan(String value) {
            addCriterion("webphone >", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneGreaterThanOrEqualTo(String value) {
            addCriterion("webphone >=", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneLessThan(String value) {
            addCriterion("webphone <", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneLessThanOrEqualTo(String value) {
            addCriterion("webphone <=", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneLike(String value) {
            addCriterion("webphone like", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneNotLike(String value) {
            addCriterion("webphone not like", value, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneIn(List<String> values) {
            addCriterion("webphone in", values, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneNotIn(List<String> values) {
            addCriterion("webphone not in", values, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneBetween(String value1, String value2) {
            addCriterion("webphone between", value1, value2, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebphoneNotBetween(String value1, String value2) {
            addCriterion("webphone not between", value1, value2, "webphone");
            return (Criteria) this;
        }

        public Criteria andWebfaxIsNull() {
            addCriterion("webfax is null");
            return (Criteria) this;
        }

        public Criteria andWebfaxIsNotNull() {
            addCriterion("webfax is not null");
            return (Criteria) this;
        }

        public Criteria andWebfaxEqualTo(String value) {
            addCriterion("webfax =", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxNotEqualTo(String value) {
            addCriterion("webfax <>", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxGreaterThan(String value) {
            addCriterion("webfax >", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxGreaterThanOrEqualTo(String value) {
            addCriterion("webfax >=", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxLessThan(String value) {
            addCriterion("webfax <", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxLessThanOrEqualTo(String value) {
            addCriterion("webfax <=", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxLike(String value) {
            addCriterion("webfax like", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxNotLike(String value) {
            addCriterion("webfax not like", value, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxIn(List<String> values) {
            addCriterion("webfax in", values, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxNotIn(List<String> values) {
            addCriterion("webfax not in", values, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxBetween(String value1, String value2) {
            addCriterion("webfax between", value1, value2, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebfaxNotBetween(String value1, String value2) {
            addCriterion("webfax not between", value1, value2, "webfax");
            return (Criteria) this;
        }

        public Criteria andWebemailIsNull() {
            addCriterion("webemail is null");
            return (Criteria) this;
        }

        public Criteria andWebemailIsNotNull() {
            addCriterion("webemail is not null");
            return (Criteria) this;
        }

        public Criteria andWebemailEqualTo(String value) {
            addCriterion("webemail =", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotEqualTo(String value) {
            addCriterion("webemail <>", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailGreaterThan(String value) {
            addCriterion("webemail >", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailGreaterThanOrEqualTo(String value) {
            addCriterion("webemail >=", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLessThan(String value) {
            addCriterion("webemail <", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLessThanOrEqualTo(String value) {
            addCriterion("webemail <=", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLike(String value) {
            addCriterion("webemail like", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotLike(String value) {
            addCriterion("webemail not like", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailIn(List<String> values) {
            addCriterion("webemail in", values, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotIn(List<String> values) {
            addCriterion("webemail not in", values, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailBetween(String value1, String value2) {
            addCriterion("webemail between", value1, value2, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotBetween(String value1, String value2) {
            addCriterion("webemail not between", value1, value2, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebbqIsNull() {
            addCriterion("webbq is null");
            return (Criteria) this;
        }

        public Criteria andWebbqIsNotNull() {
            addCriterion("webbq is not null");
            return (Criteria) this;
        }

        public Criteria andWebbqEqualTo(String value) {
            addCriterion("webbq =", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqNotEqualTo(String value) {
            addCriterion("webbq <>", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqGreaterThan(String value) {
            addCriterion("webbq >", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqGreaterThanOrEqualTo(String value) {
            addCriterion("webbq >=", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqLessThan(String value) {
            addCriterion("webbq <", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqLessThanOrEqualTo(String value) {
            addCriterion("webbq <=", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqLike(String value) {
            addCriterion("webbq like", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqNotLike(String value) {
            addCriterion("webbq not like", value, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqIn(List<String> values) {
            addCriterion("webbq in", values, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqNotIn(List<String> values) {
            addCriterion("webbq not in", values, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqBetween(String value1, String value2) {
            addCriterion("webbq between", value1, value2, "webbq");
            return (Criteria) this;
        }

        public Criteria andWebbqNotBetween(String value1, String value2) {
            addCriterion("webbq not between", value1, value2, "webbq");
            return (Criteria) this;
        }

        public Criteria andLxfsIsNull() {
            addCriterion("lxfs is null");
            return (Criteria) this;
        }

        public Criteria andLxfsIsNotNull() {
            addCriterion("lxfs is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsEqualTo(String value) {
            addCriterion("lxfs =", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotEqualTo(String value) {
            addCriterion("lxfs <>", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsGreaterThan(String value) {
            addCriterion("lxfs >", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsGreaterThanOrEqualTo(String value) {
            addCriterion("lxfs >=", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLessThan(String value) {
            addCriterion("lxfs <", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLessThanOrEqualTo(String value) {
            addCriterion("lxfs <=", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsLike(String value) {
            addCriterion("lxfs like", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotLike(String value) {
            addCriterion("lxfs not like", value, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsIn(List<String> values) {
            addCriterion("lxfs in", values, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotIn(List<String> values) {
            addCriterion("lxfs not in", values, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsBetween(String value1, String value2) {
            addCriterion("lxfs between", value1, value2, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxfsNotBetween(String value1, String value2) {
            addCriterion("lxfs not between", value1, value2, "lxfs");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNull() {
            addCriterion("lxdz is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("lxdz is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("lxdz =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("lxdz <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("lxdz >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("lxdz >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("lxdz <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("lxdz <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("lxdz like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("lxdz not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("lxdz in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("lxdz not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("lxdz between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("lxdz not between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("config is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("config is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(Integer value) {
            addCriterion("config =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(Integer value) {
            addCriterion("config <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(Integer value) {
            addCriterion("config >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(Integer value) {
            addCriterion("config >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(Integer value) {
            addCriterion("config <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(Integer value) {
            addCriterion("config <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<Integer> values) {
            addCriterion("config in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<Integer> values) {
            addCriterion("config not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(Integer value1, Integer value2) {
            addCriterion("config between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(Integer value1, Integer value2) {
            addCriterion("config not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andCopysIsNull() {
            addCriterion("copys is null");
            return (Criteria) this;
        }

        public Criteria andCopysIsNotNull() {
            addCriterion("copys is not null");
            return (Criteria) this;
        }

        public Criteria andCopysEqualTo(Integer value) {
            addCriterion("copys =", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysNotEqualTo(Integer value) {
            addCriterion("copys <>", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysGreaterThan(Integer value) {
            addCriterion("copys >", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysGreaterThanOrEqualTo(Integer value) {
            addCriterion("copys >=", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysLessThan(Integer value) {
            addCriterion("copys <", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysLessThanOrEqualTo(Integer value) {
            addCriterion("copys <=", value, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysIn(List<Integer> values) {
            addCriterion("copys in", values, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysNotIn(List<Integer> values) {
            addCriterion("copys not in", values, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysBetween(Integer value1, Integer value2) {
            addCriterion("copys between", value1, value2, "copys");
            return (Criteria) this;
        }

        public Criteria andCopysNotBetween(Integer value1, Integer value2) {
            addCriterion("copys not between", value1, value2, "copys");
            return (Criteria) this;
        }

        public Criteria andWebqqIsNull() {
            addCriterion("webqq is null");
            return (Criteria) this;
        }

        public Criteria andWebqqIsNotNull() {
            addCriterion("webqq is not null");
            return (Criteria) this;
        }

        public Criteria andWebqqEqualTo(String value) {
            addCriterion("webqq =", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqNotEqualTo(String value) {
            addCriterion("webqq <>", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqGreaterThan(String value) {
            addCriterion("webqq >", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqGreaterThanOrEqualTo(String value) {
            addCriterion("webqq >=", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqLessThan(String value) {
            addCriterion("webqq <", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqLessThanOrEqualTo(String value) {
            addCriterion("webqq <=", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqLike(String value) {
            addCriterion("webqq like", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqNotLike(String value) {
            addCriterion("webqq not like", value, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqIn(List<String> values) {
            addCriterion("webqq in", values, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqNotIn(List<String> values) {
            addCriterion("webqq not in", values, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqBetween(String value1, String value2) {
            addCriterion("webqq between", value1, value2, "webqq");
            return (Criteria) this;
        }

        public Criteria andWebqqNotBetween(String value1, String value2) {
            addCriterion("webqq not between", value1, value2, "webqq");
            return (Criteria) this;
        }

        public Criteria andParentsIsNull() {
            addCriterion("parents is null");
            return (Criteria) this;
        }

        public Criteria andParentsIsNotNull() {
            addCriterion("parents is not null");
            return (Criteria) this;
        }

        public Criteria andParentsEqualTo(Integer value) {
            addCriterion("parents =", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotEqualTo(Integer value) {
            addCriterion("parents <>", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsGreaterThan(Integer value) {
            addCriterion("parents >", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("parents >=", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsLessThan(Integer value) {
            addCriterion("parents <", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsLessThanOrEqualTo(Integer value) {
            addCriterion("parents <=", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsIn(List<Integer> values) {
            addCriterion("parents in", values, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotIn(List<Integer> values) {
            addCriterion("parents not in", values, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsBetween(Integer value1, Integer value2) {
            addCriterion("parents between", value1, value2, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotBetween(Integer value1, Integer value2) {
            addCriterion("parents not between", value1, value2, "parents");
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