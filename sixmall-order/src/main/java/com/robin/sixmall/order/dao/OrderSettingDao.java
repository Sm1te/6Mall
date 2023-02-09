package com.robin.sixmall.order.dao;

import com.robin.sixmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-09 15:23:01
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
