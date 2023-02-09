package com.robin.sixmall.member.dao;

import com.robin.sixmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author robin
 * @email liyijiannice@outlook.com
 * @date 2023-02-09 15:15:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
