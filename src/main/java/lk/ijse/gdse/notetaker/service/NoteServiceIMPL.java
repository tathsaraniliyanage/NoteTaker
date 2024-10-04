package lk.ijse.gdse.notetaker.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.notetaker.dto.NoteDto;
import org.springframework.stereotype.Service;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@Service
@Transactional
public class NoteServiceIMPL implements NoteService{

    @Override
    public void saveNote(NoteDto noteDto) {

    }
}
