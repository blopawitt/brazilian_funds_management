package com.brazilian_funds_management.controller;

import com.brazilian_funds_management.model.Fund;
import com.brazilian_funds_management.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funds")
public class FundController {

    @Autowired
    private FundService fundService;

    @GetMapping
    public List<Fund> getAllFunds() {
        return fundService.getAllFunds();
    }

    @GetMapping("/{id}")
    public Optional<Fund> getFundById(@PathVariable String id) {
        return fundService.getFundById(id);
    }

    @PostMapping
    public Fund createFund(@RequestBody Fund fund) {
        return fundService.createFund(fund);
    }

    @PutMapping("/{id}")
    public Fund updateFund(@PathVariable String id, @RequestBody Fund fundDetails) {
        return fundService.updateFund(id, fundDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteFund(@PathVariable String id) {
        fundService.deleteFund(id);
    }
}