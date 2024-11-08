// src/main/java/flordacidade/Treinamento_Wollace/service/UserService.java

package flordacidade.treinamento_wollace.service;

import flordacidade.treinamento_wollace.model.User;
import flordacidade.treinamento_wollace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    public Optional<User> buscarPorCpf(String cpf) {
        return userRepository.findByCpf(cpf);
    }

    public User salvarUsuario(User user) {
        return userRepository.save(user);
    }

    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }
}