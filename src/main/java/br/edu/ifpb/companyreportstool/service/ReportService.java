package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;

public abstract class ReportService {
    public String generateReport() {
        return writeHeader()+ writeBody() + writeFooter();
    }

    public String writeHeader(){
        return getExporter().exportHeader("Company Report");
    }

    public abstract String writeBody();

    public String writeFooter(){
        return getExporter().exportFooter("2022 - Design Patterns IFPB");
    }

    public abstract ReportExporter getExporter();


}
