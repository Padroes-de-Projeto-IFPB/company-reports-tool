package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.JsonExporter;
import br.edu.ifpb.companyreportstool.service.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class ExpenseReportJson extends ExpenseReport {
    public ExpenseReportJson(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JsonExporter();
    }
}