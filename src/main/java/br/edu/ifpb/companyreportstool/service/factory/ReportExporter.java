package br.edu.ifpb.companyreportstool.service.factory;

import java.util.List;

public interface ReportExporter {

    public String exportHeader(String title);

    public String exportBody(String subtitle, String dados);

    public String exportFooter(String desc);
}
