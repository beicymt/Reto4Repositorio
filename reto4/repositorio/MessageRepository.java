package com.ciclo3.reto.reto4.repositorio;

import com.ciclo3.reto.reto4.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
