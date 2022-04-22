package com.projet.BackendPfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.BackendPfe.Entity.IAModel;


@Repository
public interface IAModelRepository extends JpaRepository<IAModel, Long>{

	
}
