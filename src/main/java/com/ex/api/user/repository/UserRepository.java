package com.ex.api.user.repository;

import com.ex.api.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * packageName: com.ex.api.user.repository
 * fileName        : UserRepository.java
 * author          : solyikwon
 * date            : 2022-05-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-27         solyikwon      최초 생성
 **/
interface UserCustomRepository {

}

public interface UserRepository extends JpaRepository {
    List<User> findByUserName(String name);
}
