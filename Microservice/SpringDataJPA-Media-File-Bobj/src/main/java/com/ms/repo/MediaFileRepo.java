package com.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.entity.MediaFile;

public interface MediaFileRepo extends JpaRepository<MediaFile,Long>{

}
