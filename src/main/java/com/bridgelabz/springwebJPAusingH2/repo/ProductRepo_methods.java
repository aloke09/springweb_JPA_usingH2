package com.bridgelabz.springwebJPAusingH2.repo;

import com.bridgelabz.springwebJPAusingH2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo_methods extends JpaRepository<Product,Integer>//class name and primary key type
{

}
