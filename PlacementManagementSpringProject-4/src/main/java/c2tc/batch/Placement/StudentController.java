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
public class StudentController

{
	
	@Autowired
	private StudentService service;
	@GetMapping("/Students")
	public List<Student>list()
	{
		return service.listAll();
		
	}
	//retrieve a specific records from database
	@GetMapping("/Students/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try
		{
			Student student=service.get(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
	}
	//creation of rows
	@PostMapping("/Students")
	public void add(@RequestBody Student student)
	{
		service.save(student);
	}
	//update
	@PutMapping("/Students/{id}")
	public ResponseEntity<?>update(@RequestBody Student student,@PathVariable Integer id)
	{
		try
		{
			Student existStudent=service.get(id);
			service.save(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//delete
	@DeleteMapping("/Students/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}