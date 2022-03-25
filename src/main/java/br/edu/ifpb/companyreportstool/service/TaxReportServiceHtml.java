package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.factory.HtmlExporter;
import br.edu.ifpb.companyreportstool.service.factory.ReportExporter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportServiceHtml extends TaxReportService{

    public TaxReportServiceHtml(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }

    public String fillBody() {
        return "<ul><li>"+super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the tax Report", fillBody()) ;
    }
}
