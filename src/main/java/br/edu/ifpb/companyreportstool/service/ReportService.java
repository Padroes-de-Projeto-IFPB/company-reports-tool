package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;

public abstract class ReportService {

    public String Header() {
        return getReport().Header("Company Report");
    }
    public abstract String Body();

    public String Footer() {
        return getReport().footer("2022 - Design Patterns IFPB");
    }
    public String generateReport() {
        return Header() + Body() + Footer();
    }
    public abstract RelatorioReport getReport();
}
