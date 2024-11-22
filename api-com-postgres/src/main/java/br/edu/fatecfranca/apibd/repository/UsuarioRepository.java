package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//                                                    <OBJ,Chave primária>
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Esta interface terá as operações de CRUD com a entidade Usuário
}
