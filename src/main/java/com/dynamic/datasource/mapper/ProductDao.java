package com.dynamic.datasource.mapper;

import com.dynamic.datasource.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/11
 **/
@Mapper
public interface ProductDao {
    Product select(@Param("id") long id);

    Integer update(Product product);

    Integer insert(Product product);

    Integer delete(long productId);

    List<Product> getAllProduct();
}
