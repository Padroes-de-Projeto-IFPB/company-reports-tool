package br.edu.ifpb.companyreportstool.service.factory;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonExporter implements ReportExporter {
    public String exportHeader(String title){
        return "{ header: \""+title+"\" ,";
    }

    public String exportBody(String subtitle, String dados){
        return "main: { title: \""+subtitle+"\"," + " content: \"" + dados +"\" ,";
    }

    public String exportFooter(String desc){
        return "footer: \""+desc+"\" }";
    }

}
