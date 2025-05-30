package hiber.dao;

import hiber.model.User;
import java.util.List;

public interface UserDao {

   void add(User user);

   List<User> getAllUsers();

   void update(User user);

   void delete(Long id);

   User getUserById(Long id);

}

