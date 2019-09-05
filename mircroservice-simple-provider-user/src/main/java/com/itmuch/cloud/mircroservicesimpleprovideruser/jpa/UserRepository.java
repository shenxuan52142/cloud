package com.itmuch.cloud.mircroservicesimpleprovideruser.jpa;

import com.itmuch.cloud.mircroservicesimpleprovideruser.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
