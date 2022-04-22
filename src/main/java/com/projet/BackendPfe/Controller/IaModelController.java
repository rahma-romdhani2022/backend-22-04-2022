package com.projet.BackendPfe.Controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.BackendPfe.Entity.IAModel;
import com.projet.BackendPfe.repository.IAModelRepository;
import com.projet.BackendPfe.services.IaModelService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/IaModel")
public class IaModelController {

	@Autowired IAModelRepository  repository ; 
	@Autowired IaModelService  service ; 
	
	@PostMapping ("/add")
	public void ajouterIaModel (@Valid @RequestBody IAModel data) {
		service.ajouterIaModel(data);
	}
	@GetMapping("/get/{id}")
	public IAModel  getProduitByMC(@PathVariable ("id") long  id ){
		return repository.findById(id).get() ; 
	}
	@GetMapping("/all")
	public List<IAModel> getAll(){
		return service.getAllModeles();
	}
	@DeleteMapping("/modele/{id}")
	public void  deleteModele(@PathVariable ("id") long  id) {
		service.deleteIAModel(id);
	}
}
