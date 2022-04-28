package com.beast.beastmail.order.dao;

import com.beast.beastmail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 22:00:18
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
