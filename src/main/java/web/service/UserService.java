package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
     public List <User> listUsers();
     public void saveUser(User user);
     public User getUser(Long id);
     public void deleteUser(Long id);
}
