package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportHTML extends ExpenseReport {

    public ExpenseReportHTML(ExpenseRepository banco) {
        super(banco);
    }

    @Override
    public ReportExporter getExporter() {
        return new HTMLExporter();
    }

    @Override
    public String writerBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody());
    }

    @Override
    public String fillBody() {
        return "<ul><li>" + expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>")) + "</li></ul>";
    }
}
