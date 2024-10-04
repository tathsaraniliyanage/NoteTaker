package lk.ijse.gdse.notetaker.service;

import lk.ijse.gdse.notetaker.dto.NoteDTO;

import java.util.List;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/


public interface NoteService {
    void saveNote(NoteDTO noteDto);
    void updateNote(String noteId,NoteDTO noteDTO);
    void deleteNote(String noteId);
    NoteResponse getSelectedNote(String noteId);
    List<NoteDTO> getAllNotes();
}
