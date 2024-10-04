package lk.ijse.gdse.notetaker.dao;

import lk.ijse.gdse.notetaker.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Prabodha Thathsarani
 * @date 10/1/24
 * @project notetaker
 **/

@Repository
public interface NoteDao extends JpaRepository<NoteEntity,String> {

}
