package web.dao;

import web.Model.User;

import java.util.List;

public interface UserDAO {
    List<User> index();

    User show(int id);

    void save(User user);

    void update(int id, User updateUser);

    void delete(int id);

}


