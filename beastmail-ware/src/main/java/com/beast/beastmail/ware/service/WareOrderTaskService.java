package com.beast.beastmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beast.common.utils.PageUtils;
import com.beast.beastmail.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 22:24:34
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

