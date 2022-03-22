package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportJSON extends ExpenseReport {
    public ExpenseReportJSON(ExpenseRepository Repositorio) {
        super(Repositorio);
    }

    @Override
    public RelatorioReport getReport() {
        return new PadraoJSON();
    }

    @Override
    public String Body() {
        return getReport().Body("This is the Expense Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}