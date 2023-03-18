package com.robin.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liuzemin
 * @date 2021/1/5 13:37
 * @description
 */
@Data
public class SkuReductionTo {

    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
