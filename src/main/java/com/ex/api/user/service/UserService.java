package com.ex.api.user.service;

import com.ex.api.user.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.ex.api.user.service
 * fileName        : Service.java
 * author          : solyikwon
 * date            : 2022-05-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-27         solyikwon      최초 생성
 **/
public interface UserService {
    String login(User user);

    List<User> findAll();

    void update(User user);

    void delete(User user);

    long count();

    void save(User user);

    boolean existsById(String userid);

    Optional<User> findById(String userid);

    Page<User> findAll(Pageable pageable);

    List<User> findAll(Sort sort);
}
