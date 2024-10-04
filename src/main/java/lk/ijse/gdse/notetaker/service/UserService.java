package lk.ijse.gdse.notetaker.service;

import lk.ijse.gdse.notetaker.customObj.UserResponse;
import lk.ijse.gdse.notetaker.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId);
    UserResponse getSelectedUser(String userId);
    List<UserDTO> getAllUsers();
}
