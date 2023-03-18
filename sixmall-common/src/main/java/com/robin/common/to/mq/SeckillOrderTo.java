package com.robin.common.to.mq;

import lombok.Data;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.math.BigDecimal;

/**
 * @author liuzemin
 * @date 2021/3/24 13:13
 * @description
 */
@Data
public class SeckillOrderTo {
    /**
     * 订单号
     */
    private String OrderSn;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;
    /**
     * 秒杀数量
     */
    private Integer num;

    private Long memberId;//会员id


}
