package com.solotics.storeback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solotics.storeback.services.impl.IProductServiceImpl;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private IProductServiceImpl iProductServiceImpl;

    @GetMapping("/")
    public ResponseEntity findAll(){
        return this.iProductServiceImpl.findAll();
    }
}