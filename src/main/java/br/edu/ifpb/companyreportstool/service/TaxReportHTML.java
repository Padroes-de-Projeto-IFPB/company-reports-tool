package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportHTML extends TaxReport{

    public TaxReportHTML(TaxRepository Repositorio) {
        super(Repositorio);
    }

    @Override
    public RelatorioReport getReport() {
        return new PadraoHTML();
    }

    @Override
    public String Body() {
        return getReport().Body("This is the tax Report", fillBody());
    }

    @Override
    public String fillBody() {
        return "<ul><li>"+super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }
}
