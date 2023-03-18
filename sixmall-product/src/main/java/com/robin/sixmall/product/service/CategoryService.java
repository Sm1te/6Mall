package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

