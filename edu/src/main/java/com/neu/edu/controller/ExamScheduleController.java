package com.neu.edu.controller;

import com.neu.edu.dto.ExamScheduleDTO;
import com.neu.edu.service.ExamScheduleService;
import com.neu.edu.utils.ResultModel;
import com.neu.edu.vo.ExamScheduleVO;
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
    public ResultModel<List<ExamScheduleVO>> findBySelection(ExamScheduleDTO examScheduleDTO){
        return examScheduleService.findBySelection(examScheduleDTO);
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
