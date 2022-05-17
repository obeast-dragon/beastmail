package com.beast.beastmail.member.feign;

import com.beast.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wxl
 * @version 1.0
 * @description: coupon远程调用接口
 * @date 2022/4/29 9:23
 */
@FeignClient("beastmail-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupon();
}
