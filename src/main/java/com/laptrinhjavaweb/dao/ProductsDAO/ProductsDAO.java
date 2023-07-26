package com.laptrinhjavaweb.dao.ProductsDAO;

import com.laptrinhjavaweb.Util.DatabaseUtil;
import com.laptrinhjavaweb.dao.AbstractDAO;
import com.laptrinhjavaweb.entity.Products;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductsDAO implements AbstractDAO {
    @Override
    public List<Products> findAll() {
        List<Products> products= null;
        try(Session session= DatabaseUtil.getSessionFactory().openSession()) {
            Query<Products> result= session.createQuery("from Products", Products.class);
            products= result.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  products;
    }
}
