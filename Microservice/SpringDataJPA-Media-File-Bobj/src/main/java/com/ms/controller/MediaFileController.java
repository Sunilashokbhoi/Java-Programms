package com.ms.controller;

import java.net.http.HttpHeaders;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ms.entity.MediaFile;
import com.ms.service.MediaFileService;

@RestController
@RequestMapping("/media")
public class MediaFileController {
	
	private final MediaFileService service;
	public MediaFileController(MediaFileService service) {
		this.service = service;
	}
	
	//Upload file 
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
		MediaFile saved = service.saveFile(file);
		return ResponseEntity.ok("File Uploaded Successfully with ID ..."+saved.getId());
	}
	
	 @GetMapping("/download/{id}")
	 public ResponseEntity<byte[]> downlodFile(@PathVariable Long id){
		 MediaFile media = service.getFile(id);
		 
		 return ResponseEntity.ok().contentType(MediaType.parseMediaType(media.getFileType()))
				 .header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION, "attached; filename=\""+ media.getFileName())
				 .body(media.getFileData());
	 }
}
