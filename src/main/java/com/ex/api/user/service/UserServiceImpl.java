package com.ex.api.user.service;

import com.ex.api.user.domain.User;
import com.ex.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.ex.api.user.service
 * fileName        : ServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-27         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void update(User user) {
       return;

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public Optional<User> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }
}
