package com.esprit.microservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.Entity.Facture;

public interface FactureRepository extends JpaRepository <Facture,Integer>{

}
