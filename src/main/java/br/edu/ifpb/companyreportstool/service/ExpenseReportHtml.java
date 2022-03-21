package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Primary
@Service
public class ExpenseReportHtml extends ExpenseReport{

    public ExpenseReportHtml(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    public ReportExporter getExporter() {
        return new HtmlExporter();
    }

    public String writeBody() {
        String dados = fillBody();
        return getExporter().exportBody("This is the Expense Report", dados );
    }

    public String fillBody() {
        return "<ul><li>"+super.expenseRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }
}
