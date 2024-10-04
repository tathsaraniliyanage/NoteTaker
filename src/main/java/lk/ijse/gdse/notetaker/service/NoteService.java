package lk.ijse.gdse.notetaker.service;

import lk.ijse.gdse.notetaker.dto.NoteDto;
import org.springframework.stereotype.Service;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/


public interface NoteService {
    void saveNote(NoteDto noteDto);
}
