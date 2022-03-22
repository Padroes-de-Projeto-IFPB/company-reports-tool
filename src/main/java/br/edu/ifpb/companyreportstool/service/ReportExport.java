package br.edu.ifpb.companyreportstool.service;

public interface ReportExport {
  
    public String writerHeader(String title);
    public String writerBody(String subtitle, String content);
    public String writerFooter(String footer);

}
