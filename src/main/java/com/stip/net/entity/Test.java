package com.stip.net.entity;

import com.stip.mybatis.generator.plugin.BaseModel;
import java.io.Serializable;

public class Test extends BaseModel<Integer> implements Serializable {
    private Integer testId;

    private String test;

    private String test1;

    private static final long serialVersionUID = 1L;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", testId=").append(testId);
        sb.append(", test=").append(test);
        sb.append(", test1=").append(test1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Test other = (Test) that;
        return (this.getTestId() == null ? other.getTestId() == null : this.getTestId().equals(other.getTestId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTestId() == null) ? 0 : getTestId().hashCode());
        return result;
    }
}