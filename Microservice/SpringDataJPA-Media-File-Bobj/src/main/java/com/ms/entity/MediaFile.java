package com.ms.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class MediaFile {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	
	private String fileName;

	private String fileType ;  //e.g mp4 ,mp3
	
	@Lob
	private byte[]  fileData;

	private LocalDateTime uploadedAt;
	
	//0-arg constructor
	public MediaFile() {}
	//Parameter Constructor 
	public MediaFile(String fileName, String fileType, byte[] fileData, LocalDateTime uploadedAt) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileData = fileData;
		this.uploadedAt = uploadedAt;
	}
//Getter And Setter Method
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	
}
