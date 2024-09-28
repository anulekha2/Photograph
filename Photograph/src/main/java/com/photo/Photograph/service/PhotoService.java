package com.photo.Photograph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photo.Photograph.dao.PhotoRepository;
import com.photo.Photograph.entity.Photo;

@Service
public class PhotoService {

	@Autowired
	private PhotoRepository photoRepository;
	
	public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Photo uploadPhoto(Photo photo) {
        return photoRepository.save(photo);
    }
}
