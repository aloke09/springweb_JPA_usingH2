package com.bridgelabz.springwebJPAusingH2.service;

import com.bridgelabz.springwebJPAusingH2.model.Product;
import com.bridgelabz.springwebJPAusingH2.repo.ProductRepo_methods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//@component can also be used
public class ProductService
{
    @Autowired
    ProductRepo_methods repo;

    public List<Product> getProduct()
    {
        return repo.findAll();
    }

    public  Product ByProductID(int pID)
    {
        return repo.findById(pID).orElse(new Product());
    }

    public void addProduct(Product product)
    {
        repo.save(product);

    }

    public void updateProduct(Product prod)
    {
        repo.save(prod);
    }

    public void deleteByID(int prodID)
    {
        repo.deleteById(prodID);
    }
}
