package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TaxReportHtml extends TaxReport{

    public TaxReportHtml(TaxRepository taxRepository){
        super(taxRepository);
    }

    @Override
    public String fillBody() {
        return MessageFormat.format("<ul><li>{0}</li></ul>",  taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.joining("</li><li>")));
    }

    @Override
    public String writeBody() {
        return getExporter().exportBody("This is the tax Report", fillBody());
    }

    @Override
    public ReportExporter getExporter() {
        return new HtmlExporter();
    }
}
