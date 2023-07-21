package com.devsuperior.jparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.jparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
