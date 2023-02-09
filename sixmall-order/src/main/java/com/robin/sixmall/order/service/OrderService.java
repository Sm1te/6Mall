package com.robin.sixmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.robin.common.utils.PageUtils;
import com.robin.sixmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-09 15:23:01
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

