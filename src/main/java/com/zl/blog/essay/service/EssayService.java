package com.zl.blog.essay.service;


import com.zl.blog.essay.model.EssayEntity;
import com.zl.blog.essay.type.filte.EssayFilte;
import com.zl.blog.essay.type.input.EssayInput;
import com.zl.common.service.CommonService;

/**
 * @author zhoulin
 * @date 2019/3/20
 */
public interface EssayService extends CommonService<EssayEntity, Integer, EssayFilte, EssayInput> {
}
