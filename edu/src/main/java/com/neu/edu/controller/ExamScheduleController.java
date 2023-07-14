package com.neu.edu.controller;

import com.neu.edu.dto.ExamScheduleDTO;
import com.neu.edu.service.ExamScheduleService;
import com.neu.edu.utils.ResultModel;
import com.neu.edu.vo.ExamScheduleVO;
import com.neu.edu.vo.SubjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ExamScheduleController {

    @Autowired
    private ExamScheduleService examScheduleService;

    @GetMapping("")
    public ResultModel<List<ExamScheduleVO>> findAll(){
        return examScheduleService.findAll();
    }

    @GetMapping("/{exam_name}")
    public ResultModel<List<ExamScheduleVO>> findByName(@PathVariable("exam_name") String exam_name){
        try {
            System.out.println(exam_name);
            String decodedExamName = URLDecoder.decode(exam_name.replace("+", " "), "UTF-8");
            System.out.println(decodedExamName);
            return examScheduleService.findByName(decodedExamName);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }


    @PostMapping("")
    public ResultModel add(ExamScheduleDTO examScheduleDTO){
        return examScheduleService.add(examScheduleDTO);
    }

    @DeleteMapping("/{id}")
    public ResultModel deleteById(@PathVariable("id") int teacher_id){
        return examScheduleService.deleteById(teacher_id);
    }

    @PutMapping("/{id}")
    public ResultModel updateById(@PathVariable("id") int teacher_id,String name){
        return examScheduleService.updateById(teacher_id,name);
    }
}
