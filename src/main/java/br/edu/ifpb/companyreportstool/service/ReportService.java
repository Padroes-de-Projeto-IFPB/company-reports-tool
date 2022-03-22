package br.edu.ifpb.companyreportstool.service;

abstract class ReportService {

    public String generatedReport() {
        return writerHeader() + writerBody() + writerFooter();
    }

    public String writerHeader() {return getExport().writerHeader("Company Report");}

    public abstract String writerBody();

    public String writerFooter() {return getExport().writerFooter("2022 - Design Patterns IFPB");}

    public abstract ReportExport getExport();

}
