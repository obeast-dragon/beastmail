package com.beast.beastmail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beast.common.utils.PageUtils;
import com.beast.beastmail.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 22:00:18
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

