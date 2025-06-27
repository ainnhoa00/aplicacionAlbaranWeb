package com.cursoceat.aplicacionalbaran.repository;

import com.cursoceat.aplicacionalbaran.modell.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer> {
}
