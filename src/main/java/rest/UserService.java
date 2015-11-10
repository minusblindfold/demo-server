package rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> userList = new ArrayList<User>();

	public List<User> loadAll() {
		return userList;
	}

	public User load(Integer id) {
		for (User u : userList) {
			if (u.getId().equals(id)) {
				return u;
			}
		}
		return null;
	}

	public void delete(Integer id) {
		if (id == null) {
			return;
		}
		Iterator<User> iter = userList.iterator();
		while (iter.hasNext()) {
			if (iter.next().getId().equals(id)) {
				iter.remove();
			}
		}
	}

	public void save(User user) {		
		if (user.getId() == null) {
			user.setId(userList.size() + 1);
			userList.add(user);
		} else {
			delete(user.getId());
			userList.add(user);
		}
	}

}
