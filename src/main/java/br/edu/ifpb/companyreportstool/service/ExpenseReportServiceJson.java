package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.factory.JsonExporter;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class ExpenseReportServiceJson extends ExpenseReportService{

    public ExpenseReportServiceJson(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JsonExporter();
    }

    public String fillBody() {
        return super.expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the Expense Report", fillBody()) ;
    }
}
