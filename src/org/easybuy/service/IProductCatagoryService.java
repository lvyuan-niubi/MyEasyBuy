package org.easybuy.service;

import org.easybuy.entity.Product_Category;
import org.easybuy.util.Pager;

import java.util.List;

public interface IProductCatagoryService {


    public int queryCatagoryRows();

    public List<Product_Category> queryCatagoryByPage(Pager pager);
}
