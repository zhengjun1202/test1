package com.dlsc.demo.service;

import com.dlsc.demo.domain.Algorithm;

import java.util.List;

/**
 * ClassName:AlgorithmService
 * Package:com.dlsc.demo.service
 * Description:
 *
 * @Date:2019/5/20 18:05
 * @Author: 郑军
 */
public interface AlgorithmService {
    /**
     * 查询全部的算法
     * @return List<Algorithm>
     */
    List<Algorithm> selectAlgorithmList();
}
