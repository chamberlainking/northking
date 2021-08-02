package net.northking.springboot.dao;

import net.northking.springboot.entities.InterviewResultFeedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InterviewResultFeedbackDao {
    void insertResult(InterviewResultFeedback interviewResultFeedback);

    List<InterviewResultFeedback> selectByUserId(String username);
}
