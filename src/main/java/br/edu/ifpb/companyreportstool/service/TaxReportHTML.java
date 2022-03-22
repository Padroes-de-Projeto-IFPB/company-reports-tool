package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportHTML extends TaxReport {

    public TaxReportHTML(TaxRepository banco) {
        super(banco);
    }

    @Override
    public ReportExporter getExporter() {
        return new HTMLExporter();
    }

    @Override
    public String writerBody() {
        return getExporter().exportBody("This is the tax Report", fillBody());
    }

    @Override
    public String fillBody() {
        return "<ul><li>" + super.taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>")) + "</li></ul>";
    }
}
