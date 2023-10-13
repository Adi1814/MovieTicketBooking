package com.movieticketbooking.api.user;

import com.movieticketbooking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
//    private UserService userService;
//    public UserController(UserService userService){
//        this.userService = userService;
//    }
//    @Autowired
//    private UserService userService;

    private final UserService userService;
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody String name) {
        userService.addUser(name);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findUserById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getUserById(id));
    }

    @GetMapping("/email")
    public ResponseEntity<?> findUsersByEmail(@RequestParam String email) {
        if (email == null || email == "") {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getUsersByEmail(email));
    }
}
