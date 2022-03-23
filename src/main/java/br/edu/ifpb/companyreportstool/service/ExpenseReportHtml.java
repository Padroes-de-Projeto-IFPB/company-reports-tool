package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.HtmlExporter;
import br.edu.ifpb.companyreportstool.service.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class ExpenseReportHtml extends ExpenseReport {
    public ExpenseReportHtml(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }
}