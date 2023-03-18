package com.robin.sixmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

