package com.actividad.lista.lista_usuarios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.actividad.lista.lista_usuarios.models.User;

@Service
public class UserService {

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User("Harry", "Styles", "hs@gmail.com"));
        users.add(new User("Louis", "Tomlinson", "ltom@gmail.com"));
        users.add(new User("Liam", "Payne",  null));
        users.add(new User("Zayn", "Malik", "zmlik@gmail.com"));
        users.add(new User("Niall", "Horan", "horanniall@gmail.com"));
        return users;
    }

}
