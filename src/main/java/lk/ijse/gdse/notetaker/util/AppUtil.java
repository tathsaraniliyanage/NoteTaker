package lk.ijse.gdse.notetaker.util;

import java.util.Base64;
import java.util.UUID;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/
public class AppUtil {
    public static String createNoteId(){
        return "NOTE-"+ UUID.randomUUID();
    }
    public static String createUserId(){
        return "USER-"+UUID.randomUUID();
    }
    public static String toBase64ProfilePic(String profilePic){
        return Base64.getEncoder().encodeToString(profilePic.getBytes());
    }
}
