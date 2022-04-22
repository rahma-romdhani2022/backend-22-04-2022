package com.projet.BackendPfe.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.BackendPfe.Entity.IAModel;
import com.projet.BackendPfe.repository.IAModelRepository;

@Service
public class IaModelService {

	@Autowired IAModelRepository repository ; 
	
	public void ajouterIaModel(IAModel  modele ) {
		IAModel  modele1 = new IAModel(new Date(), 
			                                                         	  modele.getDate_fin(),
                                                                          modele.getNbr_utilisation(),
		                                                 	           	  modele.getData(),
				                                                          modele.getAdminD());
		repository.save(modele1);
	}
	
	public void modifierIaModel(long id , IAModel modele) {
		modele.setId(id);
		repository.save(modele) ; }
	
	
	public List<IAModel> getAllModeles() {
		return repository.findAll();
	}
	public void deleteIAModel(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
