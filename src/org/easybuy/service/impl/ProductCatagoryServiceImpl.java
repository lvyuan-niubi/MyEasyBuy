package org.easybuy.service.impl;

import org.easybuy.entity.Product_Category;
import org.easybuy.mapper.CatagoryMapper;
import org.easybuy.service.IProductCatagoryService;
import org.easybuy.util.Pager;

import java.util.List;

public class ProductCatagoryServiceImpl implements IProductCatagoryService {

    @Override
    public int queryCatagoryRows() {
        return catagoryMapper.queryCatagoryRows();
    }

    @Override
    public List<Product_Category> queryCatagoryByPage(Pager pager) {
            pager.setTemp((pager.getCurrentPage() -1 ) * pager.getRowPerPage());
        return catagoryMapper.queryCatagoryByPage(pager);
    }

    CatagoryMapper catagoryMapper = null;

    public void setCatagoryMapper(CatagoryMapper catagoryMapper) {
        this.catagoryMapper = catagoryMapper;
    }

}
