package c2tc.batch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	//to retrieve a data
	public List<College> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public College get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(College college) {
		 repo.save(college);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}