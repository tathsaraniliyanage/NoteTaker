package lk.ijse.gdse.notetaker.customObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteErrorResponse implements NoteResponse, Serializable {
    private int errorCode;
    private String errorMessage;
}
