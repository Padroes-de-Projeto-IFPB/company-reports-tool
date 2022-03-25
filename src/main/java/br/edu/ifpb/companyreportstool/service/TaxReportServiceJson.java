package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.factory.JsonExporter;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportServiceJson extends TaxReportService{
    public TaxReportServiceJson(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JsonExporter();
    }

    public String fillBody() {
        return super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining(","));
    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the tax Report", fillBody()) ;
    }
}
