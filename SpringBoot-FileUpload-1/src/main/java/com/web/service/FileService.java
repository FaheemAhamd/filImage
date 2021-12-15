package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web.model.FileDb;
import com.web.repository.FileRepository;
@Service
public class FileService {
	@Autowired
	private FileRepository repo;
	
	public FileDb save(MultipartFile file){
		String fileName=file.getOriginalFilename();
		
		try {
			FileDb filedb=new FileDb(fileName,file.getContentType(),file.getBytes());
			
			
			return repo.save(filedb);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
			}
public Optional<FileDb> getFile(String id){
	
	return repo.findById(id);
}
public List<FileDb> getFiles(){
	
	return repo.findAll();
}
}
