package br.com.fiap.Global.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fiap.Global.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer>{

	
	@Query("from UsuarioModel")
	List<UsuarioModel> listarTodos();
	
	
	@Query("from UsuarioModel u where u.email = :email")
	Optional<UsuarioModel> encontarEmail(
			@Param("email") String email);
	
	
	@Query("from UsuarioModel u where u.id = :id")
	Optional<UsuarioModel> encontrarPorId(@Param("id") int email);
	
}
