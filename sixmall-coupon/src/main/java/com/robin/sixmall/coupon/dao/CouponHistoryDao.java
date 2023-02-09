package com.robin.sixmall.coupon.dao;

import com.robin.sixmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-09 15:03:34
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
