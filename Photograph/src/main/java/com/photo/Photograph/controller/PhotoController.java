package com.photo.Photograph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photo.Photograph.entity.Photo;
import com.photo.Photograph.service.PhotoService;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {

	 @Autowired
	    private PhotoService photoService;

	    @PostMapping
	    public ResponseEntity<Photo> uploadPhoto(@RequestBody Photo photo) {
	        Photo savedPhoto = photoService.uploadPhoto(photo);
	        return new ResponseEntity<>(savedPhoto, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<Photo>> getAllPhotos() {
	        List<Photo> photos = photoService.getAllPhotos();
	        return new ResponseEntity<>(photos, HttpStatus.OK);
	    }
}
