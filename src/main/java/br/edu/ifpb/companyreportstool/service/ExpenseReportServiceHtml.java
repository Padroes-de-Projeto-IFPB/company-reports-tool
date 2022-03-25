package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.factory.HtmlExporter;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportServiceHtml extends ExpenseReportService{

    public ExpenseReportServiceHtml(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }

    public String fillBody() {
        return "<ul><li>"+super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody()) ;
    }
}
