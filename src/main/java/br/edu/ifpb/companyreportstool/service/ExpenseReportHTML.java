package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportHTML extends ExpenseReport{

    public ExpenseReportHTML(ExpenseRepository expenseRepository){
        super(expenseRepository);
    }

    @Override
    public String fillBody() {
        return MessageFormat.format("<ul><li>{0}</li></ul>",  expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>")));
    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody());
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }
}
