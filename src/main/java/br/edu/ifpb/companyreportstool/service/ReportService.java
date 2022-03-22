package br.edu.ifpb.companyreportstool.service;

public abstract class ReportService {


    public String generateReport() {
        return writeHeader() + writeBody() + writeFooter();
    };

    protected String writeHeader() {
        return getExporter().exportHeader("Company Report");
    };

    public abstract String writeBody();

    protected String writeFooter() {
        return getExporter().exportFooter("2022 - Design Patterns IFPB");
    };

    public abstract ReportExporter getExporter();

}




