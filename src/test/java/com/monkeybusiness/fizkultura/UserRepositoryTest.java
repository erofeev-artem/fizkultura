package com.monkeybusiness.fizkultura;

import com.monkeybusiness.fizkultura.entity.User;
import com.monkeybusiness.fizkultura.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DisplayName("Repository for working with the table user")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @DisplayName("Select all users")
    @Test
    void findAllUsers(){
        userRepository.save(new User(0, "Ragnar"));
        List<User> allUsers = userRepository.findAll();
        Assertions.assertThat(allUsers.size()).isEqualTo(1);
        Assertions.assertThat(allUsers.get(0).getUserName()).isEqualTo("Ragnar");
    }
}
