package ru.netology.springBootRest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springBootRest.model.Authorities;
import ru.netology.springBootRest.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, String> users = new HashMap<>();

    public List<Authorities> getUserAuthorities(User user) {
        List<Authorities> list = new ArrayList<>();

        testMethod();

        if (users.containsKey(user.getUser()) && users.get(user.getUser()).equals(user.getPassword())) {
            list.add(Authorities.READ);
        }
        return list;
    }

    private void testMethod() {
        users.put("Sergey", "12345");
        users.put("Egor", "54321");
        users.put("Aleksey", "11111");
    }

}