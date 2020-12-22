package eObrazovanje.eObrazovanje.controller;

import eObrazovanje.eObrazovanje.dto.UserDTO;
import eObrazovanje.eObrazovanje.entity.User;
import eObrazovanje.eObrazovanje.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<User> users = userService.findAll();
        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for(User u : users) {
            userDTOS.add(new UserDTO(u));
        }
        return new ResponseEntity<List<UserDTO>>(userDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Long id) {
        User user = userService.findOne(id);
        if(user == null) {
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDTO>(new UserDTO(user), HttpStatus.OK);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        User user = new User();

        user.setIme(userDTO.getIme());
        user.setPrezime(userDTO.getPrezime());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        user = userService.save(user);
        return new ResponseEntity<UserDTO>(new UserDTO(user), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}", consumes = "application/json")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable("id") Long id) {
        User user = userService.findOne(id);
        if(user == null) {
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        }
        user.setIme(userDTO.getIme());
        user.setPrezime(userDTO.getPrezime());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());

        user = userService.save(user);
        return new ResponseEntity<UserDTO>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        User user = userService.findOne(id);
        if(user != null) {
            userService.remove(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
