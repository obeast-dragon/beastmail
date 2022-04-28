package com.beast.beastmail.coupon;

import com.beast.beastmail.coupon.entity.CouponEntity;
import com.beast.beastmail.coupon.service.CouponService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeastmailCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    public void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("便宜");
        couponService.save(couponEntity);
    }

}
