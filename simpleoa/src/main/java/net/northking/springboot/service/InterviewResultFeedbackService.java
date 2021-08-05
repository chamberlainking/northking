package net.northking.springboot.service;

import net.northking.springboot.entities.InterviewResultFeedback;

import java.util.List;

public interface InterviewResultFeedbackService {
    /**
     * 根据用户id查询访谈结果详情
     * @param userIdList
     * @return
     */
    List<InterviewResultFeedback> findResultByUserId(String username);
}
