package com.example.product_backend.controller;

import com.example.product_backend.dao.ProductDao;
import com.example.product_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @GetMapping("/")
    public String homeProductPage(){return "home product page";}

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addProductPage(@RequestBody Product p){
        System.out.println(p.getName());
        System.out.println(p.getProductCode());
        System.out.println(p.getBrand());
        System.out.println(p.getManufDate());
        System.out.println(p.getExpDate());
        System.out.println(p.getPrice());
        System.out.println(p.getSeller());
        System.out.println(p.getDistName());
        dao.save(p);
        return "Add product page";}

//    @PostMapping("/search")
//    public String searchProductPage(){return "Add search page";}

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public String viewProductPage(){return "view product page";}

//    @PostMapping("/delete")
//    public String deleteProductPage(){return "Delete view page";}



}
