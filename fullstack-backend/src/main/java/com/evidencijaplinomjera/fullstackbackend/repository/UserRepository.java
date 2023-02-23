package com.evidencijaplinomjera.fullstackbackend.repository;

import com.evidencijaplinomjera.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
