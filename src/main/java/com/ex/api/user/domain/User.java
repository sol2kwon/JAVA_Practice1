package com.ex.api.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * packageName: com.ex.api.user.domain
 * fileName        : User.java
 * author          : solyikwon
 * date            : 2022-05-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-27         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="?")
public class User {
    @Id
    @Column
    @GeneratedValue private long userid;

}
