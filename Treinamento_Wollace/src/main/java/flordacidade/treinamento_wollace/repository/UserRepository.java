// src/main/java/flordacidade/Treinamento_Wollace/repository/UserRepository.java

package flordacidade.treinamento_wollace.repository;

import flordacidade.treinamento_wollace.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Consulta opcional para buscar usuário pelo CPF
    Optional<User> findByCpf(String cpf);
}
