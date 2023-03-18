package com.robin.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @author liuzemin
 * @date 2020/12/28 13:55
 * @description 实现注解ListValue,数据校验
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {
    private Set<Integer> set = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        for (int value : values) {
            set.add(value);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        return set.contains(integer);
    }
}

