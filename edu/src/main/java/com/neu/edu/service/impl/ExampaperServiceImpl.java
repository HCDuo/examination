package com.neu.edu.service.impl;

import com.neu.edu.common.BusinessException;
import com.neu.edu.dto.ExamScheduleDTO;
import com.neu.edu.dto.ExampaperDTO;
import com.neu.edu.service.ExampaperService;
import com.neu.edu.utils.ResultModel;
import com.neu.edu.vo.ExampaperVO;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/7/15 14:12
 */
public class ExampaperServiceImpl implements ExampaperService {
    @Override
    public ResultModel<List<ExampaperVO>> findBySelection(ExampaperDTO exampaperDTO) {
        return null;
    }

    @Override
    public ResultModel add(ExampaperDTO exampaperDTO) {
        return null;
    }

    @Override
    public ResultModel deleteById(int title_id) throws BusinessException {
        return null;
    }

    @Override
    public ResultModel updateById(ExamScheduleDTO examScheduleDTO) throws BusinessException {
        return null;
    }
}
