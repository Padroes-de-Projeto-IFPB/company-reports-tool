package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseReportJSON extends ExpenseReport {

    public ExpenseReportJSON(ExpenseRepository banco) {
        super(banco);
    }

    @Override
    public ReportExporter getExporter() {
        return new JSONExporter();
    }

    @Override
    public String writerBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
