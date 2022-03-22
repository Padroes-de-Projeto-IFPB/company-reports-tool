package br.edu.ifpb.companyreportstool.service;

import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;


public abstract class ExpenseReport extends TaxReportService {

    @Autowired
    protected ExpenseRepository expenseRepository;

    public ExpenseReport(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public abstract String fillBody();

    // public String generateReport(String type) {
    //     if (type.equals("html")) {
    //         return "<header><h1>Company Report</h1></header>" +
    //                 "<main><h2>This is the Expense Report</h2>" +
    //                 "<p>" + fillBodyHtml() + "</p></main>" +
    //                 "<footer>2022 - Design Patterns IFPB</footer>";
    //     } else if (type.equals("json")) {
    //         return "{ header: \"Company Report\" ," +
    //                 "main: { title: \"This is the Expense Report\", " +
    //                 "content: \"" + fillBodyJson() + "\" ," +
    //                 "footer: \"2022 - Design Patterns IFPB\" }";
    //     }
    //     return "";
    // }

    // public String fillBodyHtml() {
    //     return "<ul><li>"+expenseRepository.findAll().stream()
    //             .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    // }

    // public String fillBodyJson() {
    //     return expenseRepository.findAll().stream()
    //             .map(Objects::toString).collect(Collectors.joining(","));
    // }

}

