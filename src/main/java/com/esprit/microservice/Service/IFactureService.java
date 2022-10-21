package com.esprit.microservice.Service;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservice.Entity.Facture;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;





public interface IFactureService {

	ResponseEntity<Response> add( String Hotel)
			throws Exception;
	
	Facture updateFacture(Facture s);
	// ResponseEntity<String> deleteHotel(int id);
	String deleteFacture(int id);
	
}
