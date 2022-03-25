package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;


public abstract class ExpenseReportService extends ReportService{

    protected final ExpenseRepository expenseRepository;

    public ExpenseReportService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public abstract String fillBody();


}
