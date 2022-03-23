package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.service.ReportExporter;

import java.util.List;
import java.util.stream.Collectors;

public class JsonExporter implements ReportExporter {

    @Override
    public String exportHeader(String title) {
        return "{ header: \"" + title + "\",";
    }

    @Override
    public String exportBody(String subtitle, List<String> datas) {
        return "main: { title: \"" + subtitle + "\", " +
                "content: \"" + datas.stream().collect(Collectors.joining(",")) + "\",";
    }

    @Override
    public String exportFooter(String footer) {
        return "footer: \"" + footer + "\"}";
    }
}