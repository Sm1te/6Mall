package com.robin.sixmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.robin.sixmall.product.entity.BrandEntity;
import com.robin.sixmall.product.service.BrandService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SixmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//
//        brandService.updateById(brandEntity);
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        brand_id.forEach(System.out::println);
    }
}
