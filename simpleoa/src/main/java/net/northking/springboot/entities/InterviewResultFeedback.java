package net.northking.springboot.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * interview_result_feedback
 * @author 
 */
@Data
public class InterviewResultFeedback implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 学历
     */
    private String education;

    /**
     * 电话
     */
    private String phone;

    /**
     * 期望薪资
     */
    private String expectedSalary;

    /**
     * 推荐时间
     */
    private String recommendedTime;

    /**
     * 初筛面试时间
     */
    private String preliminaryScreeningInterviewTime;

    /**
     * 初筛反馈
     */
    private String primaryScreeningFeedback;

    /**
     * 初步评价薪资
     */
    private String preliminaryEvaluationSalary;

    /**
     * 是否直录
     */
    private String directEmployment;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 推荐岗位
     */
    private String pecommendedPosition;

    /**
     * 客户面试时间
     */
    private String customerInterviewTime;

    /**
     * 是否到场面试
     */
    private String onSiteInterview;

    /**
     * 客户反馈
     */
    private String customeFeedback;

    /**
     * 是否录用
     */
    private String hire;

    /**
     * 录用薪资
     */
    private String employmentSalary;

    /**
     * 预计入职时间
     */
    private String estimatedEntryTime;

    /**
     * 是否入职
     */
    private String employment;

    /**
     * 实际入职实际
     */
    private String actualEntryTime;

    /**
     * 薪资偏差
     */
    private String salaryDeviation;

    /**
     * 是否归档
     */
    private String archive;

    /**
     * 推荐HR
     */
    private String recommendedHr;

    /**
     * 备注
     */
    private String remarks;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}