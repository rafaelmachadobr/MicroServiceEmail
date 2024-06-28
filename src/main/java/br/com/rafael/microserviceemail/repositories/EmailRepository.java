package br.com.rafael.microserviceemail.repositories;

import br.com.rafael.microserviceemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, String> {
}
