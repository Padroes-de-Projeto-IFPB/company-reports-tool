package br.edu.ifpb.companyreportstool.service;

public interface ReportExporter {
  
    String exportHeader(String title);
    String exportBody(String subtitle, String content);
    String exportFooter(String footer);

}
