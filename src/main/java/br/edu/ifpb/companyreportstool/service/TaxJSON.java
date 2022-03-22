package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxJSON extends TaxReport {

    public TaxJSON(TaxRepository banco) {
        super(banco);
    }

    @Override
    public ReportExport getExport() {
        return new JSONReport();
    }

    @Override
    public String writerBody() {
        return getExport().writerBody("This is the tax Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
