package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 22:27:53
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

