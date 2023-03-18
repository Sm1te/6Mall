package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

