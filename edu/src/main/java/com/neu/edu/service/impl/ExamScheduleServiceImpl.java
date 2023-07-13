package com.neu.edu.service.impl;

import com.neu.edu.domain.ExamSchedule;
import com.neu.edu.dto.ExamScheduleDTO;
import com.neu.edu.mapper.ExamScheduleMapper;
import com.neu.edu.service.ExamScheduleService;
import com.neu.edu.utils.ResultModel;
import com.neu.edu.vo.ExamScheduleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamScheduleServiceImpl implements ExamScheduleService {

    @Autowired
    ExamScheduleMapper examScheduleMapper;


    @Override
    public ResultModel<List<ExamScheduleVO>> findAll() {
        ResultModel<List<ExamScheduleVO>> resultModel = new ResultModel<List<ExamScheduleVO>>();
        List<ExamScheduleVO> subjectVOList = examScheduleMapper.findAll();

        resultModel.setCode(200);
        resultModel.setMsg("查询考试成功");
        resultModel.setData(subjectVOList);
        return resultModel;
    }

    @Override
    public ResultModel add(ExamScheduleDTO subjectDTO) {

        ResultModel resultModel = new ResultModel();

        //DTO--domain
        ExamSchedule examSchedule = new ExamSchedule();
        examSchedule.setName(subjectDTO.getName());

        examScheduleMapper.add(examSchedule);
        resultModel.setCode(200);
        resultModel.setMsg("添加考试成功");
        return resultModel;
    }

    @Override
    public ResultModel deleteById(int id) {
        ResultModel resultModel = new ResultModel();

        examScheduleMapper.deleteById(id);

        resultModel.setCode(200);
        resultModel.setMsg("删除考试成功");
        return resultModel;
    }

    @Override
    public ResultModel updateById(int id, String name) {
        ResultModel resultModel = new ResultModel();

        ExamSchedule examSchedule = new ExamSchedule();
        examSchedule.setName(name);
        examSchedule.setTeacher_id(id);

        examScheduleMapper.updateById(examSchedule);

        resultModel.setCode(200);
        resultModel.setMsg("更新考试成功");
        return resultModel;
    }
}
