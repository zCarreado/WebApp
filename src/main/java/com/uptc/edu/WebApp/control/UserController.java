package com.uptc.edu.WebApp.control;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.uptc.edu.WebApp.repository.UserRepository;
import com.uptc.edu.WebApp.model.User;

@RestController
@RequestMapping("/usuarios")
public class UserController {
	
	private final UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<User> listar(){
        return repo.findAll();
    }

    @PostMapping
    public User guardar(@RequestBody User u){
        return repo.save(u);
    }
}
