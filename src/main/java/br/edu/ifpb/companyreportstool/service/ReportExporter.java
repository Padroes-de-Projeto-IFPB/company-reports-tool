package br.edu.ifpb.companyreportstool.service;

import java.util.List;

public interface ReportExporter {
    String exportHeader(String title);
    String exportBody(String subtitle, List<String> datas);
    String exportFooter(String footer);
}