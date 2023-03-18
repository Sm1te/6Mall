package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

