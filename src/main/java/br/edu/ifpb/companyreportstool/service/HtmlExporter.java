package br.edu.ifpb.companyreportstool.service;

import java.text.MessageFormat;

public class HtmlExporter implements ReportExporter{
    @Override
    public String exportHeader(String title) {
        return MessageFormat.format("<header><h1>{0}</h1></header>", title);
    }

    @Override
    public String exportBody(String subtitle, String data) {
        return MessageFormat.format("<main><h2>{0}</h2><p>{1}</p></main>", subtitle, data);
    }

    @Override
    public String exportFooter(String footer) {
        return MessageFormat.format("<footer>{0}</footer>", footer);
    }
}
