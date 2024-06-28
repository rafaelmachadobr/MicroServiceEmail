package br.com.rafael.microserviceemail.repositories;

import br.com.rafael.microserviceemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
