package com.example.Apple.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.Apple.model.CompanyDetails;

@Service
public class CompanyDetailsService {

    private Map<String, CompanyDetails> companyDetailsMap = new HashMap<>();

    public CompanyDetails getCompanyDetails(String name) {
        return companyDetailsMap.getOrDefault(name, new CompanyDetails("TCS", "IT", "TATA", "103B"));
    }
}
