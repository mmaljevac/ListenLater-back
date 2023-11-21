package hr.tvz.listenlater.controller;

import hr.tvz.listenlater.model.User;
import hr.tvz.listenlater.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllEntities() {
        List<User> entities = this.userService.getAllEntities();
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getEntity(@PathVariable final int id) {
        User entity = this.userService.getEntity(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> addNewEntity(@RequestBody User user) {
        User addedEntity = this.userService.addNewEntity(user);
        return new ResponseEntity<>(addedEntity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateEntity(@PathVariable final int id, @RequestBody final User user) {
        User updatedEntity = this.userService.updateEntity(id, user);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEntity(@PathVariable final int id) {
        boolean deletedEntity = this.userService.deleteEntity(id);
        return new ResponseEntity<>(deletedEntity, HttpStatus.OK);
    }

}
