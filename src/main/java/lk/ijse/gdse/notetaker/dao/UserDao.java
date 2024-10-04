package lk.ijse.gdse.notetaker.dao;

import lk.ijse.gdse.notetaker.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,String> {
    UserEntity getUserEntityByUserId(String userId);
}
