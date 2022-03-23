package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.List;

@Service
public abstract class ExpenseReport extends Report {

    private final ExpenseRepository expenseRepository;

    public ExpenseReport(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public String writeBody() {
        List<String> datas = expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.toList());

        return getExporter().exportBody("This is the Expense Report", datas);
    }
}

