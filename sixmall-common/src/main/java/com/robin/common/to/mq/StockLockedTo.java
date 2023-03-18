package com.robin.common.to.mq;

import lombok.Data;

import java.util.List;

/**
 * @author liuzemin
 * @date 2021/3/12 14:04
 * @description
 */
@Data
public class StockLockedTo {
    private Long id; //库存工作单的id

    private StockDetailTo detail; //工作单详情的所有id
}
