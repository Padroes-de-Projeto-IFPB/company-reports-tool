package br.edu.ifpb.companyreportstool.service;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public abstract class TaxReport extends ReportService{

    @Autowired
    protected TaxRepository taxRepository;

    public TaxReport(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    public abstract String fillBody();

}

