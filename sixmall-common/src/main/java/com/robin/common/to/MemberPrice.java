package com.robin.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuzemin
 * @date 2021/1/5 13:38
 * @description
 */
@Data
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}
