package com.brazilian_funds_management.service;

import com.brazilian_funds_management.model.Fund;
import com.brazilian_funds_management.repository.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FundService {

    @Autowired
    private FundRepository fundRepository;

    public List<Fund> getAllFunds() {
        return fundRepository.findAll();
    }

    public Optional<Fund> getFundById(String id) {
        return fundRepository.findById(id);
    }

    public Fund createFund(Fund fund) {
        return fundRepository.save(fund);
    }

    public Fund updateFund(String id, Fund fundDetails) {
        Fund fund = fundRepository.findById(id).orElseThrow(() -> new RuntimeException("Fund not found"));
        fund.setName(fundDetails.getName());
        fund.setType(fundDetails.getType());
        fund.setNetAssetValue(fundDetails.getNetAssetValue());
        fund.setExpenseRatio(fundDetails.getExpenseRatio());
        fund.setManager(fundDetails.getManager());
        return fundRepository.save(fund);
    }

    public void deleteFund(String id) {
        fundRepository.deleteById(id);
    }
}