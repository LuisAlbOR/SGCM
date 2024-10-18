package edu.sgcm.sgcm.Infraestructure.domain.Administrador;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
    Optional<Administrador> findByCorreoAdministrador(String correo);
}