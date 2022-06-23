package c2tc.batch.Placement;

import java.util.List;
import java.util.NoSuchElementException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController

{
	
	@Autowired
	private CertificateService service;
	@GetMapping("/Certificates")
	public List<Certificate>list()
	{
		return service.listAll();
		
	}
	//retrieve a specific records from database
	@GetMapping("/Certificates/{id}")
	public ResponseEntity<Certificate>get(@PathVariable Integer id)
	{
		try
		{
			Certificate certificate=service.get(id);
			return new ResponseEntity<Certificate>(certificate,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
		
	}
	//creation of rows
	@PostMapping("/Certificates")
	public void add(@RequestBody Certificate certificate)
	{
		service.save(certificate);
	}
	//update
	@PutMapping("/Certificates/{id}")
	public ResponseEntity<?>update(@RequestBody Certificate certificate,@PathVariable Integer id)
	{
		try
		{
			Certificate existCertificate=service.get(id);
			service.save(certificate);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//delete
	@DeleteMapping("/Certificates/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}