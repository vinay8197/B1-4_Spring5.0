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
public class CollegeController

{
	
	@Autowired
	private CollegeService service;
	@GetMapping("/Colleges")
	public List<College>list()
	{
		return service.listAll();
		
	}
	//retrieve a specific records from database
	@GetMapping("/Colleges/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id)
	{
		try
		{
			College college=service.get(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
		
	}
	//creation of rows
	@PostMapping("/Colleges")
	public void add(@RequestBody College college)
	{
		service.save(college);
	}
	//update
	@PutMapping("/Colleges/{id}")
	public ResponseEntity<?>update(@RequestBody College college,@PathVariable Integer id)
	{
		try
		{
			College existCollege=service.get(id);
			service.save(college);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//delete
	@DeleteMapping("/Colleges/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}