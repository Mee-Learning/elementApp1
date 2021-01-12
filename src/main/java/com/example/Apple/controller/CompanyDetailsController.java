package com.example.Apple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Apple.model.CompanyDetails;
import com.example.Apple.service.CompanyDetailsService;

@RestController
@RequestMapping("/company")
public class CompanyDetailsController {

    @Autowired
    public CompanyDetailsService companyDetailsService;

    @RequestMapping("/{name}")
    public CompanyDetails getCompanyDetails(@PathVariable("name") String name) {
        return companyDetailsService.getCompanyDetails(name);
    }
}
