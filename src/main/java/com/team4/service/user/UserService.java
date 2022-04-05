package com.team4.service.user;
import com.team4.connect.SingletonConnection;
import com.team4.model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService{
Connection connection = SingletonConnection.getConnect();

        @Override
    public List<User> selectAll() {
return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(User user) throws SQLException {
        return false;
    }
}
