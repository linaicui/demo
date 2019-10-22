package com.dynamic.datasource.controller;

import com.dynamic.datasource.common.CommonResponse;
import com.dynamic.datasource.common.ResponseUtil;
import com.dynamic.datasource.model.Product;
import com.dynamic.datasource.service.ProductService;
import com.dynamic.datasource.utils.ServiceException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/11
 **/
@Api(tags = "产品相关操作接口")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ApiOperation(value = "根据id查询单个商品")
    @GetMapping("/{id}")
    public CommonResponse getProduct(@PathVariable("id") Long productId) throws ServiceException {
        return ResponseUtil.generateResponse(productService.select(productId));
    }

    @ApiOperation(value = "查询所有商品")
    @GetMapping
    public CommonResponse getAllProduct() {
        return ResponseUtil.generateResponse(productService.getAllProduct());
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "更新单个商品")
    public CommonResponse updateProduct(@PathVariable("id") Long productId, @RequestBody Product newProduct) throws ServiceException {
        return ResponseUtil.generateResponse(productService.update(productId, newProduct));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除单个商品")
    public CommonResponse deleteProduct(@PathVariable("id") long productId) throws ServiceException {
        return ResponseUtil.generateResponse(productService.delete(productId));
    }

    @PostMapping
    @ApiOperation(value = "新增单个商品")
    public CommonResponse addProduct(@RequestBody Product newProduct) throws ServiceException {
        return ResponseUtil.generateResponse(productService.add(newProduct));
    }
}
