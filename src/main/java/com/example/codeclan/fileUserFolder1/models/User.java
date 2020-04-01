package com.example.codeclan.fileUserFolder1.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

   // private List<Folder> folders;
    public User(String title) {
        this.title = title;
        //this.folders = new ArrayList<>();
    }
    public User(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Folder> getFolders() {
//        return folders;
//    }
//
//    public void setFolders(List<Folder> folders) {
//        this.folders = folders;
//    }
}
