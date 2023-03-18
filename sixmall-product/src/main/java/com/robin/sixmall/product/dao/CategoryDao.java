package com.robin.sixmall.product.dao;

import com.robin.sixmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-08 21:59:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
