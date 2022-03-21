package br.edu.ifpb.companyreportstool.service;

import java.util.List;

public class JsonExporter implements ReportExporter{

    public String exportHeader(String title) {
        return "{ header: \"" + title + "\" ,";
    };
    public String exportBody(String subtitle, String dados) {
        return  "main: { title: \"" + subtitle + "\", " +
                "content: \"" + dados + "\" ,";
    };
    public String exportFooter(String desc) {
        return "footer: \"" + desc + "\" }";
    };
}
//                    "main: { title: \"This is the tax Report\", " +
//                    "content: \"" + fillBodyJson() + "\" ," +
//                    "footer: \"2022 - Design Patterns IFPB\" }";