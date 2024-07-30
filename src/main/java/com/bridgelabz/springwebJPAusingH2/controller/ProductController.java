package com.bridgelabz.springwebJPAusingH2.controller;

import com.bridgelabz.springwebJPAusingH2.model.Product;
import com.bridgelabz.springwebJPAusingH2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    ProductService service;

    @GetMapping("/products2")
    public List<Product> getProduct()
    {
        return service.getProduct();
    }//GET

    @GetMapping("/products1/{pID}")
    public Product getByProductID(@PathVariable  int pID)//GET
    {
        return service.ByProductID(pID);

    }

    @PostMapping("/products2")
    public void addProduct(@RequestBody Product prod)//post insert
    {
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products2")
    public void updateProduct(@RequestBody Product prod)
    {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products2/{prodID}")
    public void deleteProductByID(@PathVariable int prodID)
    {
        service.deleteByID(prodID);
    }
}
