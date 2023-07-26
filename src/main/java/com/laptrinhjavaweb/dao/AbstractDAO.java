package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.entity.Products;

import java.util.List;

public interface AbstractDAO{
    public List<Products> findAll();
}
