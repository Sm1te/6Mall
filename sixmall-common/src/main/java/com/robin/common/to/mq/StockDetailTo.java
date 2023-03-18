package com.robin.common.to.mq;

import lombok.Data;

/**
 * @author liuzemin
 * @date 2021/3/12 14:20
 * @description
 */
@Data
public class StockDetailTo {
    /**
     * id
     */
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 购买个数
     */
    private Integer skuNum;
    /**
     * 工作单id
     */
    private Long taskId;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 锁定文件
     */
    private Integer lockStatus;
}
