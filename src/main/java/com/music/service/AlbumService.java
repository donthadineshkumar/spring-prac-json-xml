package com.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.model.Album;
import com.music.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	AlbumRepository albumRepository;

	public List<Album> findAll(){
		return albumRepository.findAll();
	}
}
