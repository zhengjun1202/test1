package com.dlsc.demo.service.impl;

import com.dlsc.demo.domain.Algorithm;
import com.dlsc.demo.mapper.AlgorithmMapper;
import com.dlsc.demo.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:AlgorithmServiceImpl
 * Package:com.dlsc.demo.service.impl
 * Description:
 *
 * @Date:2019/5/20 18:05
 * @Author: 郑军
 */
@Service
public class AlgorithmServiceImpl implements AlgorithmService {

    @Autowired
    private AlgorithmMapper algorithmMapper;

    @Override
    public List<Algorithm> selectAlgorithmList() {
        return algorithmMapper.selectAlgorithmlist();
    }
}
