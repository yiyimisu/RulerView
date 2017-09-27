package com.scorpioneal.rulerview;

/**
 * Created by Fubao-A71 on 2017/9/26.
 */

import java.io.Serializable;

/**
 * Created by 扬天 QQ:981260193 on 2017/9/13.
 * 级类考核表
 */
public class TestAssess  {

    private int id;

    private String code;  //级别编号
    private String parentId;  //父ID
    private String content;  //内容
    private Double weight;  //权重
    private Integer sort;  //顺序
    private Integer level;  //等级
    private String mark;  //题标
    private Integer category;  //类别标准，0级类，非级类
    private String assessMethod;  //评价方法
    private String questionType;  //题型
    private String versionId;  //版本ID
    private String aspect;  //方向：保育、保健、管理
    private long modifyTime;  //修改时间
    private long createTime;  //创建时间
    private String label;//级类名称
    private String c1;//级类名称
    private String c2;//级类名称
    private String m1;//级类名称
    private String m2;//级类名称
    private String w1;//级类名称
    private String w2;//级类名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getAssessMethod() {
        return assessMethod;
    }

    public void setAssessMethod(String assessMethod) {
        this.assessMethod = assessMethod;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getW1() {
        return w1;
    }

    public void setW1(String w1) {
        this.w1 = w1;
    }

    public String getW2() {
        return w2;
    }

    public void setW2(String w2) {
        this.w2 = w2;
    }


}
