package com.monkeybusiness.fizkultura.repository;

import com.monkeybusiness.fizkultura.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
