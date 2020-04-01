package com.example.codeclan.fileUserFolder1;

import com.example.codeclan.fileUserFolder1.models.File;
import com.example.codeclan.fileUserFolder1.models.Folder;
import com.example.codeclan.fileUserFolder1.models.User;
import com.example.codeclan.fileUserFolder1.repository.FileRepository;
import com.example.codeclan.fileUserFolder1.repository.FolderRepository;
import com.example.codeclan.fileUserFolder1.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	public void canCreateAndSave(){
		User ABC = new User("ABC");
		userRepository.save(ABC);

		Folder Documents = new Folder("Documents");
		folderRepository.save(Documents);

		File  myCv= new File("myCv",".doc","1KB");
		fileRepository.save(myCv);


	}

}
