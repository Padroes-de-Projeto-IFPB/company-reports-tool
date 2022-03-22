package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;


//@Primary
@Service
public class TaxReportJson extends TaxReport{

    public TaxReportJson(TaxRepository taxRepository) {
        super(taxRepository);
    }

    public ReportExporter getExporter() {
        return new JsonExporter();
    }

    public String writeBody() {
        return getExporter().exportBody("This is the tax Report", fillBody() );
    };

    public String fillBody() {
        return super.taxRepository.findAll().stream()
                .map(Objects::toString).collect(Collectors.joining(","));
    }
}
