package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class TaxReportHtml extends TaxReport{
    public TaxReportHtml(TaxRepository taxRepository) {
        super(taxRepository);
    }

    public ReportExporter getExporter() {
        return new HtmlExporter();
    }

    public String writeBody() {

        String dados = fillBody();
        return getExporter().exportBody("This is the tax Report", dados );
    };

    public String fillBody() {
        return "<ul><li>"+super.taxRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining("</li><li>"))+"</li></ul>";
    }

}
