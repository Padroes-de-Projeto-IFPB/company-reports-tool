package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;

import org.springframework.beans.factory.annotation.Autowired;

abstract class ExpenseReport extends ReportService {

    @Autowired
    protected final ExpenseRepository expenseRepository;

    public ExpenseReport(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public abstract String fillBody();

}

