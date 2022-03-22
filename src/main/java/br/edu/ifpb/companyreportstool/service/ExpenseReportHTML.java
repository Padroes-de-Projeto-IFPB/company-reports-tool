package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportHTML extends ExpenseReport{

    public ExpenseReportHTML(ExpenseRepository Repositorio) {
        super(Repositorio);
    }

    @Override
    public RelatorioReport getReport() {
        return new PadraoHTML();
    }

    @Override
    public String Body() {
        return getReport().Body("This is the Expense Report", fillBody());
    }

    @Override
    public String fillBody() {
        return "<ul><li>"+super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }
}