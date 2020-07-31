package com.product.server.service;

import com.product.common.DecreaseStockInput;
import com.product.common.ProductInfoOutput;
import com.product.server.dataobject.CartDTO;
import com.product.server.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:57
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

    void decreaseStockNotMQ(List<CartDTO> cartDTOList);
}
