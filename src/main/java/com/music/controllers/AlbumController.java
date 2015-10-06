package com.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.music.model.Album;
import com.music.service.AlbumService;

@Controller
public class AlbumController {

	@Autowired
	AlbumService service;
	
	@RequestMapping(value="/albums",produces= {"application/xml","application/json"})
	public @ResponseBody List<Album> getAlbums(){
		return service.findAll();
	}
	

}
