package hr.tvz.listenlater.service;

import hr.tvz.listenlater.model.User;
import hr.tvz.listenlater.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public List<User> getAllEntities() {
        return this.userRepository.getAllEntities();
    }

    public User getEntity(int id) {
        return this.userRepository.getEntity(id);
    }

    public User addNewEntity(User user) {
        return this.userRepository.addNewEntity(user);
    }

    public User updateEntity(int id, User user) {
        return this.userRepository.updateEntity(id, user);
    }

    public boolean deleteEntity(int id) {
        return this.userRepository.deleteEntity(id);
    }

}
