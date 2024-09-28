package com.photo.Photograph.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photo.Photograph.entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo,Long>{

}
