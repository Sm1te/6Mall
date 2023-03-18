package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

