package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class ExpenseReportHTML extends ExpenseReport {

    public ExpenseReportHTML(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    public ReportExporter getExporter() {
        return new HtmlExporter();
    }

    public String writeBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody());
    }

    public String fillBody() {
        return "<ul><li>"+super.expenseRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }
}