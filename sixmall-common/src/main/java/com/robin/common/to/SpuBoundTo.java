package com.robin.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuzemin
 * @date 2021/1/5 13:16
 * @description
 */
@Data
public class SpuBoundTo {

    private  Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;
}
