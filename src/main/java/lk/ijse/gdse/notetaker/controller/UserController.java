package lk.ijse.gdse.notetaker.controller;

import lk.ijse.gdse.notetaker.dto.UserDTO;
import lk.ijse.gdse.notetaker.service.UserServiceIMPL;
import lk.ijse.gdse.notetaker.util.AppUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserServiceIMPL userService;
    //Save User
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> saveUser(
            @RequestPart("firstName") String firstName,
            @RequestPart ("lastName") String lastName,
            @RequestPart ("email") String email,
            @RequestPart ("password") String password,
            @RequestPart ("profilePic") MultipartFile profilePic) {
        // Handle profile pic
           try {
        //byte [] imageByteCollection = profilePic.getBytes();
        String base64ProfilePic = AppUtil.toBase64ProfilePic(profilePic);
        // build the user object
        UserDTO buildUserDTO = new UserDTO();
        buildUserDTO.setFirstName(firstName);
        buildUserDTO.setLastName(lastName);
        buildUserDTO.setEmail(email);
        buildUserDTO.setPassword(password);
        buildUserDTO.setProfilePic(base64ProfilePic);
        //send to the service layer
        userService.saveUser(buildUserDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }catch (DataPersistFailedException e){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }catch (Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}
