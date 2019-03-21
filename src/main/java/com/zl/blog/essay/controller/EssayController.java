package com.zl.blog.essay.controller;


import com.zl.blog.essay.model.EssayEntity;
import com.zl.blog.essay.service.EssayService;
import com.zl.blog.essay.type.filte.EssayFilte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhoulin
 * @date 2019/1/15
 */
@RestController
@RequestMapping(value = "/essay")
public class EssayController {
    @Autowired
    private EssayService userService;

    @RequestMapping(value = "/pagination")
    public Page<EssayEntity> pagination(Integer pageNum, Integer pageSize, EssayFilte filter) {
        return userService.findAll(pageNum, pageSize, filter);
    }

    @RequestMapping(value = "/items")
    public List<EssayEntity> items(EssayFilte filter) {
        return userService.findAll(filter);
    }

    @RequestMapping(value = "/item")
    public EssayEntity item(Integer id) {
        return userService.findById(id);
    }

}