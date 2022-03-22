package br.edu.ifpb.companyreportstool.service;

public class PadraoHTML implements RelatorioReport{
    @Override
    public String Header(String title) {
        return "<header><h1>" + title +"</h1></header>";
    }

    @Override
    public String Body(String conteudo, String dado) {
        return "<main><h2>" + conteudo + "</h2>"+
                "<p>" + dado + "</p></main>";
    }

    @Override
    public String footer(String footer) {
        return "<footer>"+ footer +"</footer>";
    }
}