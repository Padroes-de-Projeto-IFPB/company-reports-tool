package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseJSON extends ExpenseReport {

    public ExpenseJSON(ExpenseRepository banco) {
        super(banco);
    }

    @Override
    public ReportExport getExport() {
        return new JSONReport();
    }

    @Override
    public String writerBody() {
        return getExport().writerBody("This is the Expense Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
