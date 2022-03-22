package br.edu.ifpb.companyreportstool.service;

public class JSONReport implements ReportExport {

    @Override
    public String writerHeader(String title) {
        return String.format(
            "{ header: \"%s\" ,", 
            title
        );
    }

    @Override
    public String writerBody(String subtitle, String content) {

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
    public String writerFooter(String footer) {
        return String.format(
            "footer: \"%s\" }", 
            footer
        );
    }
  
}
