package com.neu.edu.controller;

import com.neu.edu.common.BusinessException;
import com.neu.edu.dto.QuestionDTO;
import com.neu.edu.service.QuestionService;
import com.neu.edu.utils.ResultModel;
import com.neu.edu.vo.QuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("")
    public ResultModel<List<QuestionVO>> findBySelection(QuestionDTO questionDTO){
        return questionService.findBySelection(questionDTO);
    }

    @PostMapping("")
    public ResultModel add(QuestionDTO questionDTO){
        return questionService.add(questionDTO);
    }

    @DeleteMapping("/{id}")
    public ResultModel deleteById(@PathVariable("id") int question_id)throws BusinessException {
        return questionService.deleteById(question_id);
    }

    @PutMapping("/{id}")
    public ResultModel updateById(@PathVariable("id")int question_id, QuestionDTO questionDTO)throws BusinessException{
        return questionService.updateById(questionDTO);
    }

}
