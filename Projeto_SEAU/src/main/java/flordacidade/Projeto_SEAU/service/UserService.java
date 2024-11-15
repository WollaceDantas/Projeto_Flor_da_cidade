// src/main/java/flordacidade/Treinamento_Wollace/service/UserService.java

package flordacidade.Projeto_SEAU.service;

import flordacidade.Projeto_SEAU.model.User;
import flordacidade.Projeto_SEAU.repository.UserRepository;
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