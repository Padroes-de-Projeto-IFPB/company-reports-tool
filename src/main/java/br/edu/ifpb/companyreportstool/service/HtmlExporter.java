package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.service.ReportExporter;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlExporter implements ReportExporter {
    @Override
    public String exportHeader(String title) {
        return "<header><h1>" + title + "</h1></header>";
    }

    @Override
    public String exportBody(String subtitle, List<String> datas) {
        return "<main><h2>" + subtitle + "</h2>" +
        "<p><ul><li>" + datas.stream().collect(Collectors.joining("</li><li>")) + "</li></ul></p></main>";
    }

    @Override
    public String exportFooter(String footer) {
        return "<footer>" + footer + "</footer>";
    }
}