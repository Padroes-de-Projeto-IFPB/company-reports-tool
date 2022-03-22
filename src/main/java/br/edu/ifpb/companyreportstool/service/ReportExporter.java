package br.edu.ifpb.companyreportstool.service;

public interface ReportExporter {
    public String exportHeader(String title);
    public String exportBody(String subtitle, String data);
    public String exportFooter(String footer);
}
