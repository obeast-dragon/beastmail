package com.beast.beastmail.member.dao;

import com.beast.beastmail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 21:45:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
