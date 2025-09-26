package com.ms.service;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ms.entity.MediaFile;
import com.ms.repo.MediaFileRepo;

@Service
public class MediaFileService {

	private final MediaFileRepo repo;
	public MediaFileService(MediaFileRepo repo) {
		this.repo =repo;
	}
	
	public MediaFile saveFile(MultipartFile file)throws IOException{
		MediaFile media = new MediaFile(
				file.getOriginalFilename(),
				file.getContentType(),
				file.getBytes(),
				LocalDateTime.now()
				);
		return repo.save(media);
	}
	
	public MediaFile getFile(Long id) {
		return repo.findById(id).orElseThrow(()->new RuntimeException("File Not found .."));
	}
}
