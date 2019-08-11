package com.dbs.twitter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.twitter.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByName(String name);
    List<User> findAll();
}
