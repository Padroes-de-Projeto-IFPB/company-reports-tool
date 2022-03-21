package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;



@Service
public class TaxReportJson extends TaxReport{

    public TaxReportJson(TaxRepository taxRepository) {
        super(taxRepository);
    }

    public ReportExporter getExporter() {
        return new JsonExporter();
    }

    public String writeBody() {

        String dados = fillBody();
        return getExporter().exportBody("This is the tax Report", dados );
    };

    public String fillBody() {
        return super.taxRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining(","));
    }
}
