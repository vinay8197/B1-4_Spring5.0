package c2tc.batch.Placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class PlacementService {
	@Autowired
	private PlacementRepository repo;
	//to retrieve a data
	public List<Placement> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public Placement get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(Placement placement) {
		 repo.save(placement);
		
	}
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}