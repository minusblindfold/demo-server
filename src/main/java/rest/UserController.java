package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public User findOne(@PathVariable Integer id) {
		return userService.load(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<User> getAll() {
		return userService.loadAll();
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public List<User> save(@RequestBody User u) {
		userService.save(u);
		return userService.loadAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public List<User> delete(@PathVariable Integer id) {
		userService.delete(id);
		return userService.loadAll();
	}

}
