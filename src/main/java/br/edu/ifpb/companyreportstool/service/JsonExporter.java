package br.edu.ifpb.companyreportstool.service;

import java.text.MessageFormat;

public class JsonExporter implements ReportExporter {

    @Override
    public String exportHeader(String title) {
        return "{ header: \"%s\" ,".formatted(title);
    }

    @Override
    public String exportBody(String subtitle, String data) {
        String[] arguments = {subtitle, data};
        return "main: { title: \"%s\", content: \"%s\" ,".formatted(arguments);
    }

    @Override
    public String exportFooter(String footer) {
        return "footer: \"%s\" }".formatted(footer);
    }
}
