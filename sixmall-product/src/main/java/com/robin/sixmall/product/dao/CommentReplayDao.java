package com.robin.sixmall.product.dao;

import com.robin.sixmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 22:27:53
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
