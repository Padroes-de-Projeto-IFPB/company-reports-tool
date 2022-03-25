package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;


public abstract class TaxReportService extends ReportService{

    protected TaxRepository taxRepository;

    public TaxReportService(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public abstract String fillBody();

}
