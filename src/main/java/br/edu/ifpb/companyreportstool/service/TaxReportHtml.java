package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.HtmlExporter;
import br.edu.ifpb.companyreportstool.service.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class TaxReportHtml extends TaxReport {
    public TaxReportHtml(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }
}