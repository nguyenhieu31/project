package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.AbstractDAO;
import com.laptrinhjavaweb.entity.Products;
import com.laptrinhjavaweb.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductsService implements AbstractService {
    @Autowired
    private AbstractDAO productsDAO;
    @Override
    public List<Products> findAll() {
        return productsDAO.findAll();
    }
}
