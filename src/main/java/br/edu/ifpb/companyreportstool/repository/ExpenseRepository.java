package br.edu.ifpb.companyreportstool.repository;

import br.edu.ifpb.companyreportstool.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
