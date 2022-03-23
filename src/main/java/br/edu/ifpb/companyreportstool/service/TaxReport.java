package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.Report;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public abstract class TaxReport extends Report {

    private final TaxRepository taxRepository;

    public TaxReport(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public String writeBody() {
        List<String> dados = taxRepository.findAll().stream().map(Objects::toString).collect(Collectors.toList());

        return getExporter().exportBody("This is the Tax Report", dados);
    }
}