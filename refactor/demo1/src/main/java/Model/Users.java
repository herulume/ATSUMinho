package Model;

import Exceptions.InvalidUserException;
import Exceptions.UserExistsException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Users implements Serializable {
    private static final long serialVersionUID = 7586838070562585444L;
    private final Map<String, User> userBase;

    Users() {
        this.userBase = new HashMap<>();
    }

    void addUser(User u) throws UserExistsException {
        if(this.userBase.putIfAbsent(u.getEmail(), u.clone()) != null) {
			throw new UserExistsException();
		}
    }

    List<String> getClientIDS() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, User> e : this.userBase
                .entrySet()) {
            if (e.getValue() instanceof Client) {
                String key = e.getKey();
                list.add(key);
            }
        }
        return list;
    }

    User getUser(String id) throws InvalidUserException {
        User a = userBase.get(id);
        if(a == null) {
			throw new InvalidUserException();
		}
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}

        if (o == null || getClass() != o.getClass()) {
			return false;
		}

        Users users = (Users) o;
        return this.userBase.equals(users.userBase);
    }
}
