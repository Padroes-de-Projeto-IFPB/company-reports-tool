package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportJSON extends TaxReport {

    public TaxReportJSON(TaxRepository banco) {
        super(banco);
    }

    @Override
    public ReportExporter getExporter() {
        return new JSONExporter();
    }

    @Override
    public String writerBody() {
        return getExporter().exportBody("This is the tax Report", fillBody());
    }

    @Override
    public String fillBody() {
        return super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
