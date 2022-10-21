package com.esprit.microservice.Service;

import java.io.File;

import javax.servlet.ServletContext;
import javax.xml.ws.Response;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservice.Entity.Facture;
import com.esprit.microservice.Repository.FactureRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;







@Service
public class FactureService implements IFactureService {

	
	@Autowired
	private FactureRepository factureRepository;
	@Autowired
    ServletContext context;
	
	@Override
    public ResponseEntity<Response> add( String Facture) throws Exception
    {

        System.out.println("Ok .............");
        Facture s = new ObjectMapper().readValue(Facture, Facture.class);


        Facture art = factureRepository.save(s);



        if (art != null)
        {
            return new ResponseEntity<Response>( HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Response>(HttpStatus.BAD_REQUEST);
        }



    }

	public Facture updateFacture( Facture facture) {
	return factureRepository.save(facture);
}
	
	
	public String deleteFacture(int id) {
		if (factureRepository.findById(id).isPresent()) {
			factureRepository.deleteById(id);
			return "hotel supprimé";
} else
return "hotel non supprimé";
	}
	
	
	
	
	
	
}
