package com.esprit.microservice.Controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.microservice.Entity.Facture;
import com.esprit.microservice.Service.IFactureService;
import com.fasterxml.jackson.databind.JsonMappingException;
@RestController
public class FactureRestApi {
	private final String title="hello I'm the Hotel Microservice";
	@Autowired
	IFactureService factureService;
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Response>  addHotel(@RequestParam("facture") String s)throws Exception {
		 return factureService.add(s);
	}

	@PutMapping("/update/{id}")
	@ResponseBody
	Facture updateHotel(@RequestBody Facture s){
		return factureService.updateFacture(s);
	}
	
	
	
	@RequestMapping("/hello")
	
	public String sayHello(){
		
		System.out.println(title);
		return title;
	}
	
	@DeleteMapping(value="/id", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteHotel(@PathVariable(value="id") int  id){
	return new ResponseEntity<>(factureService.deleteFacture(id),HttpStatus.OK);

	}
}
