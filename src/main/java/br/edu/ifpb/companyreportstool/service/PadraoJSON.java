package br.edu.ifpb.companyreportstool.service;

public class PadraoJSON implements RelatorioReport {
    @Override
    public String Header(String title) {
        return "{ header: \""+ title +"\" ,";
    }

    @Override
    public String Body(String conteudo, String dado) {
        return "main: { title: \"" + conteudo + "\", " +
                "content: \"" + dado + "\" ," ;
    }

    @Override
    public String footer(String footer) {
        return "footer: \""+ footer + "\" }";
    }
}
