package c2tc.batch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository repo;
	//to retrieve a data
	public List<Student> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public Student get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(Student student) {
		 repo.save(student);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}