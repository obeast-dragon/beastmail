package com.beast.beastmail.order.dao;

import com.beast.beastmail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 22:00:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
