package com.neu.edu.mapper;

import com.neu.edu.domain.Question;
import com.neu.edu.dto.QuestionDTO;
import com.neu.edu.vo.QuestionVO;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/7/15 10:57
 */
public interface QuestionMapper {
    List<QuestionVO> findBySelection(QuestionDTO questionDTO);

    int add(Question question);

    int deleteById(int Question_id);

    int updateById(Question question);
}
