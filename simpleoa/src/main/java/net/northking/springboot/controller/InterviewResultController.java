package net.northking.springboot.controller;

import com.alibaba.fastjson.JSON;
import net.northking.springboot.entities.InterviewResultFeedback;
import net.northking.springboot.service.InterviewResultFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("manage")
public class InterviewResultController {
    @Autowired
    private InterviewResultFeedbackService interviewResultFeedbackService;

    @RequestMapping("find")
    @ResponseBody
    public String findResult(HttpSession session, @RequestParam String name) {
        List<InterviewResultFeedback> resultFeedbacks = interviewResultFeedbackService.findResultByUserId(name);
        String resultList = JSON.toJSONString(resultFeedbacks);
        return resultList;
    }

    @ResponseBody
    @RequestMapping("insert")
    public String insertResult(InterviewResultFeedback interviewResultFeedback){
        try {
            interviewResultFeedbackService.insertResult(interviewResultFeedback);
            return "添加成功";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "添加失败";
    }
}
