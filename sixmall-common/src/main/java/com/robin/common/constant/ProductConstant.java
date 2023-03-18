package com.robin.common.constant;

/**
 * @author liuzemin
 * @date 2020/12/31 10:54
 * @description
 */
public class ProductConstant {
    public enum AttrEnum{
        ATTR_TYPE_BASE(1, "基本属性"),ATTR_TYPE_SALE(0,"销售属性");

        AttrEnum(Integer code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        private Integer code;
        private String msg;

        public Integer getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

    public enum StatusEnum{
        NEW_SPU(0, "新建"),SPU_UP(1,"商品上架"),SPU_DOWN(1,"商品下架");

        StatusEnum(Integer code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        private Integer code;
        private String msg;

        public Integer getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
