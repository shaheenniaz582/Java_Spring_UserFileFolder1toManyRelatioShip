package com.example.codeclan.fileUserFolder1.repository;


import com.example.codeclan.fileUserFolder1.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
