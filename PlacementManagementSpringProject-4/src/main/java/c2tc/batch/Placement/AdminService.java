package c2tc.batch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class AdminService {
	@Autowired
	private AdminRepository repo;
	//to retrieve a data
	public List<Admin> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public Admin get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(Admin admin) {
		 repo.save(admin);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}