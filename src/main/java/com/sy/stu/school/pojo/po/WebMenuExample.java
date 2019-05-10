package com.sy.stu.school.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebMenuExample() {
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

        public Criteria andMenuIsNull() {
            addCriterion("menu is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsNotNull() {
            addCriterion("menu is not null");
            return (Criteria) this;
        }

        public Criteria andMenuEqualTo(String value) {
            addCriterion("menu =", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotEqualTo(String value) {
            addCriterion("menu <>", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThan(String value) {
            addCriterion("menu >", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuGreaterThanOrEqualTo(String value) {
            addCriterion("menu >=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThan(String value) {
            addCriterion("menu <", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLessThanOrEqualTo(String value) {
            addCriterion("menu <=", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuLike(String value) {
            addCriterion("menu like", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotLike(String value) {
            addCriterion("menu not like", value, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuIn(List<String> values) {
            addCriterion("menu in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotIn(List<String> values) {
            addCriterion("menu not in", values, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuBetween(String value1, String value2) {
            addCriterion("menu between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuNotBetween(String value1, String value2) {
            addCriterion("menu not between", value1, value2, "menu");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andShowfileIsNull() {
            addCriterion("showfile is null");
            return (Criteria) this;
        }

        public Criteria andShowfileIsNotNull() {
            addCriterion("showfile is not null");
            return (Criteria) this;
        }

        public Criteria andShowfileEqualTo(String value) {
            addCriterion("showfile =", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotEqualTo(String value) {
            addCriterion("showfile <>", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileGreaterThan(String value) {
            addCriterion("showfile >", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileGreaterThanOrEqualTo(String value) {
            addCriterion("showfile >=", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLessThan(String value) {
            addCriterion("showfile <", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLessThanOrEqualTo(String value) {
            addCriterion("showfile <=", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLike(String value) {
            addCriterion("showfile like", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotLike(String value) {
            addCriterion("showfile not like", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileIn(List<String> values) {
            addCriterion("showfile in", values, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotIn(List<String> values) {
            addCriterion("showfile not in", values, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileBetween(String value1, String value2) {
            addCriterion("showfile between", value1, value2, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotBetween(String value1, String value2) {
            addCriterion("showfile not between", value1, value2, "showfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileIsNull() {
            addCriterion("adminfile is null");
            return (Criteria) this;
        }

        public Criteria andAdminfileIsNotNull() {
            addCriterion("adminfile is not null");
            return (Criteria) this;
        }

        public Criteria andAdminfileEqualTo(String value) {
            addCriterion("adminfile =", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileNotEqualTo(String value) {
            addCriterion("adminfile <>", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileGreaterThan(String value) {
            addCriterion("adminfile >", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileGreaterThanOrEqualTo(String value) {
            addCriterion("adminfile >=", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileLessThan(String value) {
            addCriterion("adminfile <", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileLessThanOrEqualTo(String value) {
            addCriterion("adminfile <=", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileLike(String value) {
            addCriterion("adminfile like", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileNotLike(String value) {
            addCriterion("adminfile not like", value, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileIn(List<String> values) {
            addCriterion("adminfile in", values, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileNotIn(List<String> values) {
            addCriterion("adminfile not in", values, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileBetween(String value1, String value2) {
            addCriterion("adminfile between", value1, value2, "adminfile");
            return (Criteria) this;
        }

        public Criteria andAdminfileNotBetween(String value1, String value2) {
            addCriterion("adminfile not between", value1, value2, "adminfile");
            return (Criteria) this;
        }

        public Criteria andNewsParIsNull() {
            addCriterion("news_par is null");
            return (Criteria) this;
        }

        public Criteria andNewsParIsNotNull() {
            addCriterion("news_par is not null");
            return (Criteria) this;
        }

        public Criteria andNewsParEqualTo(Integer value) {
            addCriterion("news_par =", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParNotEqualTo(Integer value) {
            addCriterion("news_par <>", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParGreaterThan(Integer value) {
            addCriterion("news_par >", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_par >=", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParLessThan(Integer value) {
            addCriterion("news_par <", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParLessThanOrEqualTo(Integer value) {
            addCriterion("news_par <=", value, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParIn(List<Integer> values) {
            addCriterion("news_par in", values, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParNotIn(List<Integer> values) {
            addCriterion("news_par not in", values, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParBetween(Integer value1, Integer value2) {
            addCriterion("news_par between", value1, value2, "newsPar");
            return (Criteria) this;
        }

        public Criteria andNewsParNotBetween(Integer value1, Integer value2) {
            addCriterion("news_par not between", value1, value2, "newsPar");
            return (Criteria) this;
        }

        public Criteria andProHIsNull() {
            addCriterion("pro_h is null");
            return (Criteria) this;
        }

        public Criteria andProHIsNotNull() {
            addCriterion("pro_h is not null");
            return (Criteria) this;
        }

        public Criteria andProHEqualTo(Integer value) {
            addCriterion("pro_h =", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHNotEqualTo(Integer value) {
            addCriterion("pro_h <>", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHGreaterThan(Integer value) {
            addCriterion("pro_h >", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_h >=", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHLessThan(Integer value) {
            addCriterion("pro_h <", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHLessThanOrEqualTo(Integer value) {
            addCriterion("pro_h <=", value, "proH");
            return (Criteria) this;
        }

        public Criteria andProHIn(List<Integer> values) {
            addCriterion("pro_h in", values, "proH");
            return (Criteria) this;
        }

        public Criteria andProHNotIn(List<Integer> values) {
            addCriterion("pro_h not in", values, "proH");
            return (Criteria) this;
        }

        public Criteria andProHBetween(Integer value1, Integer value2) {
            addCriterion("pro_h between", value1, value2, "proH");
            return (Criteria) this;
        }

        public Criteria andProHNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_h not between", value1, value2, "proH");
            return (Criteria) this;
        }

        public Criteria andProWIsNull() {
            addCriterion("pro_w is null");
            return (Criteria) this;
        }

        public Criteria andProWIsNotNull() {
            addCriterion("pro_w is not null");
            return (Criteria) this;
        }

        public Criteria andProWEqualTo(Integer value) {
            addCriterion("pro_w =", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWNotEqualTo(Integer value) {
            addCriterion("pro_w <>", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWGreaterThan(Integer value) {
            addCriterion("pro_w >", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_w >=", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWLessThan(Integer value) {
            addCriterion("pro_w <", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWLessThanOrEqualTo(Integer value) {
            addCriterion("pro_w <=", value, "proW");
            return (Criteria) this;
        }

        public Criteria andProWIn(List<Integer> values) {
            addCriterion("pro_w in", values, "proW");
            return (Criteria) this;
        }

        public Criteria andProWNotIn(List<Integer> values) {
            addCriterion("pro_w not in", values, "proW");
            return (Criteria) this;
        }

        public Criteria andProWBetween(Integer value1, Integer value2) {
            addCriterion("pro_w between", value1, value2, "proW");
            return (Criteria) this;
        }

        public Criteria andProWNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_w not between", value1, value2, "proW");
            return (Criteria) this;
        }

        public Criteria andProParIsNull() {
            addCriterion("pro_par is null");
            return (Criteria) this;
        }

        public Criteria andProParIsNotNull() {
            addCriterion("pro_par is not null");
            return (Criteria) this;
        }

        public Criteria andProParEqualTo(Integer value) {
            addCriterion("pro_par =", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParNotEqualTo(Integer value) {
            addCriterion("pro_par <>", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParGreaterThan(Integer value) {
            addCriterion("pro_par >", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_par >=", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParLessThan(Integer value) {
            addCriterion("pro_par <", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParLessThanOrEqualTo(Integer value) {
            addCriterion("pro_par <=", value, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParIn(List<Integer> values) {
            addCriterion("pro_par in", values, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParNotIn(List<Integer> values) {
            addCriterion("pro_par not in", values, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParBetween(Integer value1, Integer value2) {
            addCriterion("pro_par between", value1, value2, "proPar");
            return (Criteria) this;
        }

        public Criteria andProParNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_par not between", value1, value2, "proPar");
            return (Criteria) this;
        }

        public Criteria andProRowIsNull() {
            addCriterion("pro_row is null");
            return (Criteria) this;
        }

        public Criteria andProRowIsNotNull() {
            addCriterion("pro_row is not null");
            return (Criteria) this;
        }

        public Criteria andProRowEqualTo(Integer value) {
            addCriterion("pro_row =", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowNotEqualTo(Integer value) {
            addCriterion("pro_row <>", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowGreaterThan(Integer value) {
            addCriterion("pro_row >", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_row >=", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowLessThan(Integer value) {
            addCriterion("pro_row <", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowLessThanOrEqualTo(Integer value) {
            addCriterion("pro_row <=", value, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowIn(List<Integer> values) {
            addCriterion("pro_row in", values, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowNotIn(List<Integer> values) {
            addCriterion("pro_row not in", values, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowBetween(Integer value1, Integer value2) {
            addCriterion("pro_row between", value1, value2, "proRow");
            return (Criteria) this;
        }

        public Criteria andProRowNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_row not between", value1, value2, "proRow");
            return (Criteria) this;
        }

        public Criteria andPicHIsNull() {
            addCriterion("pic_h is null");
            return (Criteria) this;
        }

        public Criteria andPicHIsNotNull() {
            addCriterion("pic_h is not null");
            return (Criteria) this;
        }

        public Criteria andPicHEqualTo(Integer value) {
            addCriterion("pic_h =", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHNotEqualTo(Integer value) {
            addCriterion("pic_h <>", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHGreaterThan(Integer value) {
            addCriterion("pic_h >", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_h >=", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHLessThan(Integer value) {
            addCriterion("pic_h <", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHLessThanOrEqualTo(Integer value) {
            addCriterion("pic_h <=", value, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHIn(List<Integer> values) {
            addCriterion("pic_h in", values, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHNotIn(List<Integer> values) {
            addCriterion("pic_h not in", values, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHBetween(Integer value1, Integer value2) {
            addCriterion("pic_h between", value1, value2, "picH");
            return (Criteria) this;
        }

        public Criteria andPicHNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_h not between", value1, value2, "picH");
            return (Criteria) this;
        }

        public Criteria andPicWIsNull() {
            addCriterion("pic_w is null");
            return (Criteria) this;
        }

        public Criteria andPicWIsNotNull() {
            addCriterion("pic_w is not null");
            return (Criteria) this;
        }

        public Criteria andPicWEqualTo(Integer value) {
            addCriterion("pic_w =", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWNotEqualTo(Integer value) {
            addCriterion("pic_w <>", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWGreaterThan(Integer value) {
            addCriterion("pic_w >", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_w >=", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWLessThan(Integer value) {
            addCriterion("pic_w <", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWLessThanOrEqualTo(Integer value) {
            addCriterion("pic_w <=", value, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWIn(List<Integer> values) {
            addCriterion("pic_w in", values, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWNotIn(List<Integer> values) {
            addCriterion("pic_w not in", values, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWBetween(Integer value1, Integer value2) {
            addCriterion("pic_w between", value1, value2, "picW");
            return (Criteria) this;
        }

        public Criteria andPicWNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_w not between", value1, value2, "picW");
            return (Criteria) this;
        }

        public Criteria andPicParIsNull() {
            addCriterion("pic_par is null");
            return (Criteria) this;
        }

        public Criteria andPicParIsNotNull() {
            addCriterion("pic_par is not null");
            return (Criteria) this;
        }

        public Criteria andPicParEqualTo(Integer value) {
            addCriterion("pic_par =", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParNotEqualTo(Integer value) {
            addCriterion("pic_par <>", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParGreaterThan(Integer value) {
            addCriterion("pic_par >", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_par >=", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParLessThan(Integer value) {
            addCriterion("pic_par <", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParLessThanOrEqualTo(Integer value) {
            addCriterion("pic_par <=", value, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParIn(List<Integer> values) {
            addCriterion("pic_par in", values, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParNotIn(List<Integer> values) {
            addCriterion("pic_par not in", values, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParBetween(Integer value1, Integer value2) {
            addCriterion("pic_par between", value1, value2, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicParNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_par not between", value1, value2, "picPar");
            return (Criteria) this;
        }

        public Criteria andPicRowIsNull() {
            addCriterion("pic_row is null");
            return (Criteria) this;
        }

        public Criteria andPicRowIsNotNull() {
            addCriterion("pic_row is not null");
            return (Criteria) this;
        }

        public Criteria andPicRowEqualTo(Integer value) {
            addCriterion("pic_row =", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowNotEqualTo(Integer value) {
            addCriterion("pic_row <>", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowGreaterThan(Integer value) {
            addCriterion("pic_row >", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_row >=", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowLessThan(Integer value) {
            addCriterion("pic_row <", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowLessThanOrEqualTo(Integer value) {
            addCriterion("pic_row <=", value, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowIn(List<Integer> values) {
            addCriterion("pic_row in", values, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowNotIn(List<Integer> values) {
            addCriterion("pic_row not in", values, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowBetween(Integer value1, Integer value2) {
            addCriterion("pic_row between", value1, value2, "picRow");
            return (Criteria) this;
        }

        public Criteria andPicRowNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_row not between", value1, value2, "picRow");
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

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("view not between", value1, value2, "view");
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

        public Criteria andOtherparIsNull() {
            addCriterion("otherpar is null");
            return (Criteria) this;
        }

        public Criteria andOtherparIsNotNull() {
            addCriterion("otherpar is not null");
            return (Criteria) this;
        }

        public Criteria andOtherparEqualTo(String value) {
            addCriterion("otherpar =", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparNotEqualTo(String value) {
            addCriterion("otherpar <>", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparGreaterThan(String value) {
            addCriterion("otherpar >", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparGreaterThanOrEqualTo(String value) {
            addCriterion("otherpar >=", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparLessThan(String value) {
            addCriterion("otherpar <", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparLessThanOrEqualTo(String value) {
            addCriterion("otherpar <=", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparLike(String value) {
            addCriterion("otherpar like", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparNotLike(String value) {
            addCriterion("otherpar not like", value, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparIn(List<String> values) {
            addCriterion("otherpar in", values, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparNotIn(List<String> values) {
            addCriterion("otherpar not in", values, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparBetween(String value1, String value2) {
            addCriterion("otherpar between", value1, value2, "otherpar");
            return (Criteria) this;
        }

        public Criteria andOtherparNotBetween(String value1, String value2) {
            addCriterion("otherpar not between", value1, value2, "otherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparIsNull() {
            addCriterion("picotherpar is null");
            return (Criteria) this;
        }

        public Criteria andPicotherparIsNotNull() {
            addCriterion("picotherpar is not null");
            return (Criteria) this;
        }

        public Criteria andPicotherparEqualTo(String value) {
            addCriterion("picotherpar =", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparNotEqualTo(String value) {
            addCriterion("picotherpar <>", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparGreaterThan(String value) {
            addCriterion("picotherpar >", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparGreaterThanOrEqualTo(String value) {
            addCriterion("picotherpar >=", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparLessThan(String value) {
            addCriterion("picotherpar <", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparLessThanOrEqualTo(String value) {
            addCriterion("picotherpar <=", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparLike(String value) {
            addCriterion("picotherpar like", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparNotLike(String value) {
            addCriterion("picotherpar not like", value, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparIn(List<String> values) {
            addCriterion("picotherpar in", values, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparNotIn(List<String> values) {
            addCriterion("picotherpar not in", values, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparBetween(String value1, String value2) {
            addCriterion("picotherpar between", value1, value2, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andPicotherparNotBetween(String value1, String value2) {
            addCriterion("picotherpar not between", value1, value2, "picotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparIsNull() {
            addCriterion("imgotherpar is null");
            return (Criteria) this;
        }

        public Criteria andImgotherparIsNotNull() {
            addCriterion("imgotherpar is not null");
            return (Criteria) this;
        }

        public Criteria andImgotherparEqualTo(String value) {
            addCriterion("imgotherpar =", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparNotEqualTo(String value) {
            addCriterion("imgotherpar <>", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparGreaterThan(String value) {
            addCriterion("imgotherpar >", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparGreaterThanOrEqualTo(String value) {
            addCriterion("imgotherpar >=", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparLessThan(String value) {
            addCriterion("imgotherpar <", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparLessThanOrEqualTo(String value) {
            addCriterion("imgotherpar <=", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparLike(String value) {
            addCriterion("imgotherpar like", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparNotLike(String value) {
            addCriterion("imgotherpar not like", value, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparIn(List<String> values) {
            addCriterion("imgotherpar in", values, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparNotIn(List<String> values) {
            addCriterion("imgotherpar not in", values, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparBetween(String value1, String value2) {
            addCriterion("imgotherpar between", value1, value2, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andImgotherparNotBetween(String value1, String value2) {
            addCriterion("imgotherpar not between", value1, value2, "imgotherpar");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(Integer value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(Integer value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(Integer value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(Integer value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<Integer> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<Integer> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(Integer value1, Integer value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("download not between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownParIsNull() {
            addCriterion("down_par is null");
            return (Criteria) this;
        }

        public Criteria andDownParIsNotNull() {
            addCriterion("down_par is not null");
            return (Criteria) this;
        }

        public Criteria andDownParEqualTo(Integer value) {
            addCriterion("down_par =", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParNotEqualTo(Integer value) {
            addCriterion("down_par <>", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParGreaterThan(Integer value) {
            addCriterion("down_par >", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_par >=", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParLessThan(Integer value) {
            addCriterion("down_par <", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParLessThanOrEqualTo(Integer value) {
            addCriterion("down_par <=", value, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParIn(List<Integer> values) {
            addCriterion("down_par in", values, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParNotIn(List<Integer> values) {
            addCriterion("down_par not in", values, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParBetween(Integer value1, Integer value2) {
            addCriterion("down_par between", value1, value2, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownParNotBetween(Integer value1, Integer value2) {
            addCriterion("down_par not between", value1, value2, "downPar");
            return (Criteria) this;
        }

        public Criteria andDownRowIsNull() {
            addCriterion("down_row is null");
            return (Criteria) this;
        }

        public Criteria andDownRowIsNotNull() {
            addCriterion("down_row is not null");
            return (Criteria) this;
        }

        public Criteria andDownRowEqualTo(Integer value) {
            addCriterion("down_row =", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowNotEqualTo(Integer value) {
            addCriterion("down_row <>", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowGreaterThan(Integer value) {
            addCriterion("down_row >", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_row >=", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowLessThan(Integer value) {
            addCriterion("down_row <", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowLessThanOrEqualTo(Integer value) {
            addCriterion("down_row <=", value, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowIn(List<Integer> values) {
            addCriterion("down_row in", values, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowNotIn(List<Integer> values) {
            addCriterion("down_row not in", values, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowBetween(Integer value1, Integer value2) {
            addCriterion("down_row between", value1, value2, "downRow");
            return (Criteria) this;
        }

        public Criteria andDownRowNotBetween(Integer value1, Integer value2) {
            addCriterion("down_row not between", value1, value2, "downRow");
            return (Criteria) this;
        }

        public Criteria andOrdIsNull() {
            addCriterion("ord is null");
            return (Criteria) this;
        }

        public Criteria andOrdIsNotNull() {
            addCriterion("ord is not null");
            return (Criteria) this;
        }

        public Criteria andOrdEqualTo(Integer value) {
            addCriterion("ord =", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotEqualTo(Integer value) {
            addCriterion("ord <>", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThan(Integer value) {
            addCriterion("ord >", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord >=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThan(Integer value) {
            addCriterion("ord <", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdLessThanOrEqualTo(Integer value) {
            addCriterion("ord <=", value, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdIn(List<Integer> values) {
            addCriterion("ord in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotIn(List<Integer> values) {
            addCriterion("ord not in", values, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdBetween(Integer value1, Integer value2) {
            addCriterion("ord between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("ord not between", value1, value2, "ord");
            return (Criteria) this;
        }

        public Criteria andMenuredirectIsNull() {
            addCriterion("menuredirect is null");
            return (Criteria) this;
        }

        public Criteria andMenuredirectIsNotNull() {
            addCriterion("menuredirect is not null");
            return (Criteria) this;
        }

        public Criteria andMenuredirectEqualTo(String value) {
            addCriterion("menuredirect =", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectNotEqualTo(String value) {
            addCriterion("menuredirect <>", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectGreaterThan(String value) {
            addCriterion("menuredirect >", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectGreaterThanOrEqualTo(String value) {
            addCriterion("menuredirect >=", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectLessThan(String value) {
            addCriterion("menuredirect <", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectLessThanOrEqualTo(String value) {
            addCriterion("menuredirect <=", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectLike(String value) {
            addCriterion("menuredirect like", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectNotLike(String value) {
            addCriterion("menuredirect not like", value, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectIn(List<String> values) {
            addCriterion("menuredirect in", values, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectNotIn(List<String> values) {
            addCriterion("menuredirect not in", values, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectBetween(String value1, String value2) {
            addCriterion("menuredirect between", value1, value2, "menuredirect");
            return (Criteria) this;
        }

        public Criteria andMenuredirectNotBetween(String value1, String value2) {
            addCriterion("menuredirect not between", value1, value2, "menuredirect");
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