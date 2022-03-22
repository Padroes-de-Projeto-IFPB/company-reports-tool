package br.edu.ifpb.companyreportstool.service;

abstract class ReportService {

    public String generatedReport() {
        return writerHeader() + writerBody() + writerFooter();
    }

    public String writerHeader() {return getExporter().exportHeader("Company Report");}

    public abstract String writerBody();

    public String writerFooter() {return getExporter().exportFooter("2022 - Design Patterns IFPB");}

    public abstract ReportExporter getExporter();

}
