package br.edu.ifpb.companyreportstool.service;

import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifpb.companyreportstool.repository.TaxRepository;


public abstract class TaxReport extends TaxReportService {

    @Autowired
    protected TaxRepository taxRepository;

    public TaxReport(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public abstract String fillBody();

    // public String generateReport(String type) {
    //     if (type.equals("html")) {
    //         return "<header><h1>Company Report</h1></header>" +
    //                 "<main><h2>This is the tax Report</h2>" +
    //                 "<p>" + fillBodyHtml() + "</p></main>" +
    //                 "<footer>2022 - Design Patterns IFPB</footer>";
    //     } else if (type.equals("json")) {
    //         return "{ header: \"Company Report\" ," +
    //                 "main: { title: \"This is the tax Report\", " +
    //                 "content: \"" + fillBodyJson() + "\" ," +
    //                 "footer: \"2022 - Design Patterns IFPB\" }";
    //     }
    //     return "";
    // }

    // public String fillBodyHtml() {
    //     return "<ul><li>"+taxRepository.findAll().stream()
    //             .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    // }

    // public String fillBodyJson() {
    //     return taxRepository.findAll().stream()
    //             .map(Objects::toString).collect(Collectors.joining(","));
    // }

}

