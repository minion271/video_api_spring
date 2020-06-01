package com.training.sharevideoversion2.repository;

import com.training.sharevideoversion2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUsername(String username);
    User findById(Long id);
}
