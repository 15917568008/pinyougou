package com.pinyougou.manager.controller;

import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @GetMapping("/brand/findAll")
   public List<Brand> findAll() {
        return brandService.findAll();
    }

}
