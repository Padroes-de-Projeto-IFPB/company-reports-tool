package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportJSON extends TaxReport{
    public TaxReportJSON(TaxRepository TaxRepository) {
        super(TaxRepository);
    }
    @Override
    public RelatorioReport getReport() {
        return new PadraoJSON();
    }

    @Override
    public String Body() {
        return getReport().Body("This is the tax Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
