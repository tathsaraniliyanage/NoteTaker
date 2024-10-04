package lk.ijse.gdse.notetaker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UserEntity implements SuperEntity{
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(columnDefinition = "LONGTEXT")
    private String profilePic;
    @OneToMany(mappedBy = "user")
    private List<NoteEntity> notes;
}
