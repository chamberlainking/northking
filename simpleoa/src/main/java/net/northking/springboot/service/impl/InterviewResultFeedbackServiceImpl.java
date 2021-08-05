package net.northking.springboot.service.impl;

import net.northking.springboot.dao.InterviewResultFeedbackDao;
import net.northking.springboot.entities.InterviewResultFeedback;
import net.northking.springboot.service.InterviewResultFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewResultFeedbackServiceImpl implements InterviewResultFeedbackService {
    @Autowired InterviewResultFeedbackDao interviewResultFeedbackDao;
    @Override
    public List<InterviewResultFeedback> findResultByUserId(String username) {
        return interviewResultFeedbackDao.selectByUserId(username);
    }
}
