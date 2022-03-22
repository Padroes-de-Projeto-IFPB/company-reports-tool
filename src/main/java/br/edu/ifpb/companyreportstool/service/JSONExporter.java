package br.edu.ifpb.companyreportstool.service;

public class JSONExporter implements ReportExporter {

    @Override
    public String exportHeader(String title) {
        return String.format(
            "{ header: \"%s\" ,", 
            title
        );
    }

    @Override
    public String exportBody(String subtitle, String content) {

        String format = String.format(
            "main: { title: \"%s\", ", 
            subtitle
        );

        format += String.format(
            "content: \"%s\" ,",
            content
        );

        return format;
    }

    @Override
    public String exportFooter(String footer) {
        return String.format(
            "footer: \"%s\" }", 
            footer
        );
    }
  
}
