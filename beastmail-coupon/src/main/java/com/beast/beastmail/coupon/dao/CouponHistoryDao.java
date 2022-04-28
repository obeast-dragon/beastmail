package com.beast.beastmail.coupon.dao;

import com.beast.beastmail.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 21:26:27
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
