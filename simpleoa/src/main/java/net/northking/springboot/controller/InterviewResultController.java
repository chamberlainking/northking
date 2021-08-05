package net.northking.springboot.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import net.northking.springboot.dao.InterviewResultFeedbackDao;
import net.northking.springboot.easyexcel.UploadDataListener;
import net.northking.springboot.entities.InterviewResultFeedback;
import net.northking.springboot.service.InterviewResultFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("manage")
public class InterviewResultController {
    @Autowired
    private InterviewResultFeedbackService interviewResultFeedbackService;
    @Autowired
    private InterviewResultFeedbackDao interviewResultFeedbackDao;

    @RequestMapping("find")
    @ResponseBody
    public PageInfo<InterviewResultFeedback> findResult(HttpSession session, @RequestParam int pageNum, @RequestParam int pageSize) {
        PageInfo<InterviewResultFeedback> resultByUserId = interviewResultFeedbackService.findResultByUserId(pageNum, pageSize);
//        String resultList = JSON.toJSONString(resultFeedbacks);
        return resultByUserId;
    }

    /**
     * 文件上传
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link UploadData}
     * <p>
     * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UploadDataListener}
     * <p>
     * 3. 直接读即可
     */
    @RequestMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file")MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), InterviewResultFeedback.class, new UploadDataListener(interviewResultFeedbackDao)).sheet().headRowNumber(2).doRead();
        return "success";
    }
}
