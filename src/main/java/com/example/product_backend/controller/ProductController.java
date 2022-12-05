package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ProductController {
    @PostMapping("/add")
    public String addProductPage(){return "Add product page";}

    @PostMapping("/search")
    public String searchProductPage(){return "Add search page";}

    @GetMapping("/viewall")
    public String viewProductPage(){return "Add view page";}

    @PostMapping("/delete")
    public String deleteProductPage(){return "Delete view page";}



}
