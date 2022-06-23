package c2tc.batch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	//to retrieve a data
	public List<User> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public User get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(User user) {
		 repo.save(user);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}