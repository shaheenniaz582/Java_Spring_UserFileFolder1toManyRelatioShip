package com.example.codeclan.fileUserFolder1.repository;


import com.example.codeclan.fileUserFolder1.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
