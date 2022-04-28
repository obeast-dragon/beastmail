package com.beast.beastmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beast.common.utils.PageUtils;
import com.beast.beastmail.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 21:26:27
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

