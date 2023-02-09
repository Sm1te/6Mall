package com.robin.sixmall.coupon.dao;

import com.robin.sixmall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-09 15:03:34
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
