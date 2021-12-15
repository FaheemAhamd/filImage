package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.web.service.FileService;

@Controller
public class FileController  {
	@Autowired
	private FileService fileService;
@PostMapping
public void save(@RequestParam("file") MultipartFile file) {
	
	fileService.save(file);
}
}
