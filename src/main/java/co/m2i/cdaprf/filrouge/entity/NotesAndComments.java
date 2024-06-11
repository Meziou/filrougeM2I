package co.m2i.cdaprf.filrouge.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class NotesAndComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    private int note;
    
    public NotesAndComments() {
    }
    public NotesAndComments(String comment, int note) {
        this.comment = comment;
        this.note = note;
    }
    public NotesAndComments(int id, String comment, int note) {
        this.id = id;
        this.comment = comment;
        this.note = note;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
}
