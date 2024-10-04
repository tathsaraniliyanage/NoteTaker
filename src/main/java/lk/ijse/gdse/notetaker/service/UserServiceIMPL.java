package lk.ijse.gdse.notetaker.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.notetaker.customObj.NoteErrorResponse;
import lk.ijse.gdse.notetaker.customObj.NoteResponse;
import lk.ijse.gdse.notetaker.customObj.UserResponse;
import lk.ijse.gdse.notetaker.dao.NoteDao;
import lk.ijse.gdse.notetaker.dao.UserDao;
import lk.ijse.gdse.notetaker.dto.NoteDTO;
import lk.ijse.gdse.notetaker.dto.UserDTO;
import lk.ijse.gdse.notetaker.entity.UserEntity;
import lk.ijse.gdse.notetaker.exception.DataPersistFailedException;
import lk.ijse.gdse.notetaker.util.AppUtil;
import lk.ijse.gdse.notetaker.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@Service
@Transactional
public class UserServiceIMPL implements UserService {

    @Autowired
    private final UserDao userDao;
    @Autowired
    private final Mapping mapping;

    @Override
    public void saveUser(UserDTO userDTO) {
        userDTO.setUserId(AppUtil.createUserId());
        UserEntity savedUser =
                userDao.save(mapping.convertToUserEntity(userDTO));
        if(savedUser == null ) {
            throw new DataPersistFailedException("Cannot data saved");
        }
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        Optional<UserEntity> tmpUser = userDao.findById(userDTO.getUserId());
        if(!tmpUser.isPresent()){
            throw new UserNotFoundException("User not found");
        }else {
            tmpUser.get().setFirstName(userDTO.getFirstName());
            tmpUser.get().setLastName(userDTO.getLastName());
            tmpUser.get().setEmail(userDTO.getEmail());
            tmpUser.get().setPassword(userDTO.getPassword());
            tmpUser.get().setProfilePic(userDTO.getProfilePic());
        }
    }


    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public UserResponse getSelectedUser(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}