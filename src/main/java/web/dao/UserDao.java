package web.dao;



import web.entity.User;

import java.util.List;

public interface UserDao {

   List<User> listUsers();
   void saveUser(User user);
   User getUser(Long id);
   void deleteUser(Long id);


}
