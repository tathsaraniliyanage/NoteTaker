package lk.ijse.gdse.notetaker.controller;

import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@RestController
@RequestMapping("api/v1/notes")
@RequiredArgsConstructor
public class NoteController {
    @Autowired
    private final NoteService noteService;

    public ResponseEntity<Void> createNote(@RequestBody NoteDto note){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
