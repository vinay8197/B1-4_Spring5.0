package c2tc.batch.Placement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world_controller {
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

}
