package lk.ijse.gdse.notetaker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDto implements SuperDTO{
    private String noteId;
    private String noteTitle;
    private String noteDesc;
    private String priority;
    private String createDate;
    private String userId;
}
