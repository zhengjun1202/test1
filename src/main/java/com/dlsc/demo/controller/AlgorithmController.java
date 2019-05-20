package com.dlsc.demo.controller;

import com.dlsc.demo.domain.Algorithm;
import com.dlsc.demo.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName:AlgorithmController
 * Package:com.dlsc.demo.controller
 * Description:
 *
 * @Date:2019/5/20 18:04
 * @Author: 郑军
 */
@Controller
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @RequestMapping("/selectArthimetic")
    @ResponseBody
    public List<Algorithm> selectAlgorithmList(){
        return algorithmService.selectAlgorithmList();
    }
}
