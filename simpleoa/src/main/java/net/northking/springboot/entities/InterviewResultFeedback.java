package net.northking.springboot.entities;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
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
    @ExcelProperty(index = 0)
    private String name;

    /**
     * 学历
     */
    @ExcelProperty(index = 1)
    private String education;

    /**
     * 电话
     */
    @ExcelProperty(index = 2)
    private String phone;

    /**
     * 期望薪资
     */
    @ExcelProperty(index = 3)
    private String expectedSalary;

    /**
     * 推荐时间
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty(index = 4)
    private String recommendedTime;

    /**
     * 初筛面试时间
     */
    @ExcelProperty(index = 5)
    private String preliminaryScreeningInterviewTime;

    /**
     * 初筛反馈
     */
    @ExcelProperty(index = 6)
    private String primaryScreeningFeedback;

    /**
     * 初步评价薪资
     */
    @ExcelProperty(index = 7)
    private String preliminaryEvaluationSalary;

    /**
     * 是否直录
     */
    @ExcelProperty(index = 8)
    private String directEmployment;

    /**
     * 客户名称
     */
    @ExcelProperty(index = 9)
    private String customerName;

    /**
     * 推荐岗位
     */
    @ExcelProperty(index = 10)
    private String pecommendedPosition;

    /**
     * 客户面试时间
     */
    @ExcelProperty(index = 11)
    private String customerInterviewTime;

    /**
     * 是否到场面试
     */
    @ExcelProperty(index = 12)
    private String onSiteInterview;

    /**
     * 客户反馈
     */
    @ExcelProperty(index = 13)
    private String customeFeedback;

    /**
     * 是否录用
     */
    @ExcelProperty(index = 14)
    private String hire;

    /**
     * 录用薪资
     */
    @ExcelProperty(index = 15)
    private String employmentSalary;

    /**
     * 预计入职时间
     */
    @ExcelProperty(index = 16)
    private String estimatedEntryTime;

    /**
     * 是否入职
     */
    @ExcelProperty(index = 17)
    private String employment;

    /**
     * 实际入职实际
     */
    @ExcelProperty(index = 18)
    private String actualEntryTime;

    /**
     * 薪资偏差
     */
    @ExcelProperty(index = 19)
    private String salaryDeviation;

    /**
     * 是否归档
     */
    @ExcelProperty(index = 20)
    private String archive;

    /**
     * 推荐HR
     */
    @ExcelProperty(index = 21)
    private String recommendedHr;

    /**
     * 备注
     */
    @ExcelProperty(index = 22)
    private String remarks;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}