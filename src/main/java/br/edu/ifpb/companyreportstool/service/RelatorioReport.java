package br.edu.ifpb.companyreportstool.service;

public interface RelatorioReport {
    public String Header(String title);
    public String Body(String conteudo, String dado);
    public String footer(String footer);
}
