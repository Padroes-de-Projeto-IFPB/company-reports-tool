package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;

import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

abstract class ExpenseReport extends ReportService {

    @Autowired
    protected final ExpenseRepository expenseRepository;

    public ExpenseReport(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public abstract String fillBody();

}

