package com.zl.blog.essay.service.impl;

import com.zl.blog.essay.model.EssayEntity;
import com.zl.blog.essay.model.repository.EssayRepository;
import com.zl.blog.essay.service.EssayService;
import com.zl.blog.essay.type.filte.EssayFilte;
import com.zl.blog.essay.type.input.EssayInput;
import com.zl.common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;

/**
 * @author zhoulin
 * @date 2019/3/20
 */
@Service
public class EssayServiceImpl implements EssayService {
    @Autowired
    private EssayRepository userRepository;

    @Override
    public CommonRepository<EssayEntity, Integer> getCommonRepository() {
        return this.userRepository;
    }

    @Override
    public EssayEntity create(EssayInput input) {
        return null;
    }

    @Override
    public EssayEntity update(EssayInput input) {
        return null;
    }

    @Override
    public Specification<EssayEntity> buildQuery(EssayFilte filter) {
        return ((root, criteriaQuery, criteriaBuilder) -> {
            ArrayList<Predicate> predicates = new ArrayList<>();
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }
}
