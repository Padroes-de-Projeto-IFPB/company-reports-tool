package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.JsonExporter;
import br.edu.ifpb.companyreportstool.service.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class TaxReportJson extends TaxReport {
    public TaxReportJson(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JsonExporter();
    }
}