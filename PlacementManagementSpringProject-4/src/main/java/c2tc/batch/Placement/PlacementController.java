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
public class PlacementController

{
	
	@Autowired
	private PlacementService service;
	@GetMapping("/Placements")
	public List<Placement>list()
	{
		return service.listAll();
		
	}
	//retrieve a specific records from database
	@GetMapping("/Placements/{id}")
	public ResponseEntity<Placement>get(@PathVariable Integer id)
	{
		try
		{
			Placement placement=service.get(id);
			return new ResponseEntity<Placement>(placement,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
		
	}
	//creation of rows
	@PostMapping("/Placements")
	public void add(@RequestBody Placement placement)
	{
		service.save(placement);
	}
	//update
	@PutMapping("/Placements/{id}")
	public ResponseEntity<?>update(@RequestBody Placement placement,@PathVariable Integer id)
	{
		try
		{
			Placement existPlacement=service.get(id);
			service.save(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//delete
	@DeleteMapping("/Placements/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}