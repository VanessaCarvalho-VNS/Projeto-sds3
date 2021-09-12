package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.sale;

public interface SaleRepository extends JpaRepository<sale, Long> {

}
