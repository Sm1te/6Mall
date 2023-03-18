package com.robin.common.to;

import lombok.Data;

/**
 * @author liuzemin
 * @date 2021/1/13 15:50
 * @description
 */
@Data
public class SkuHasStockVo {
    private Long skuId;

    private Boolean hasStock;
}
