// src/main/java/flordacidade/Treinamento_Wollace/controller/UserController.java

package flordacidade.treinamento_wollace.controller;

import flordacidade.treinamento_wollace.model.User;
import flordacidade.treinamento_wollace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class usercontroller {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listarUsuarios() {
        return userService.listarUsuarios();
    }

    @GetMapping("/{cpf}")
    public Optional<User> buscarPorCpf(@PathVariable String cpf) {
        return userService.buscarPorCpf(cpf);
    }

    @PostMapping
    public User salvarUsuario(@RequestBody User user) {
        return userService.salvarUsuario(user);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        userService.deletarUsuario(id);
    }
}