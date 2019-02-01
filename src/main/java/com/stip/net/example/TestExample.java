package com.stip.net.example;

import com.stip.mybatis.generator.plugin.BaseCriteria;
import com.stip.mybatis.generator.plugin.BaseModelExample;
import java.util.ArrayList;
import java.util.List;

public class TestExample extends BaseModelExample {
    protected List<Criteria> oredCriteria;

    public TestExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        super.clear();
        oredCriteria.clear();
    }

    protected abstract static class GeneratedCriteria extends BaseCriteria {

        public Criteria andTestIdIsNull() {
            addCriterion("test.test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test.test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test.test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test.test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test.test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test.test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test.test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test.test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test.test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test.test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test.test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test.test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIsNull() {
            addCriterion("test.test is null");
            return (Criteria) this;
        }

        public Criteria andTestIsNotNull() {
            addCriterion("test.test is not null");
            return (Criteria) this;
        }

        public Criteria andTestEqualTo(String value) {
            addCriterion("test.test =", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotEqualTo(String value) {
            addCriterion("test.test <>", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThan(String value) {
            addCriterion("test.test >", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThanOrEqualTo(String value) {
            addCriterion("test.test >=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThan(String value) {
            addCriterion("test.test <", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThanOrEqualTo(String value) {
            addCriterion("test.test <=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLike(String value) {
            addCriterion("test.test like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotLike(String value) {
            addCriterion("test.test not like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestIn(List<String> values) {
            addCriterion("test.test in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotIn(List<String> values) {
            addCriterion("test.test not in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestBetween(String value1, String value2) {
            addCriterion("test.test between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotBetween(String value1, String value2) {
            addCriterion("test.test not between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTest1IsNull() {
            addCriterion("test.test1 is null");
            return (Criteria) this;
        }

        public Criteria andTest1IsNotNull() {
            addCriterion("test.test1 is not null");
            return (Criteria) this;
        }

        public Criteria andTest1EqualTo(String value) {
            addCriterion("test.test1 =", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotEqualTo(String value) {
            addCriterion("test.test1 <>", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThan(String value) {
            addCriterion("test.test1 >", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThanOrEqualTo(String value) {
            addCriterion("test.test1 >=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThan(String value) {
            addCriterion("test.test1 <", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThanOrEqualTo(String value) {
            addCriterion("test.test1 <=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Like(String value) {
            addCriterion("test.test1 like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotLike(String value) {
            addCriterion("test.test1 not like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1In(List<String> values) {
            addCriterion("test.test1 in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotIn(List<String> values) {
            addCriterion("test.test1 not in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Between(String value1, String value2) {
            addCriterion("test.test1 between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotBetween(String value1, String value2) {
            addCriterion("test.test1 not between", value1, value2, "test1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}