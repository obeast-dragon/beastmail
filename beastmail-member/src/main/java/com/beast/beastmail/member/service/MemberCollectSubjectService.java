package com.beast.beastmail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beast.common.utils.PageUtils;
import com.beast.beastmail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author wxl
 * @email 1468258057@qq.com
 * @date 2022-04-28 21:45:34
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

