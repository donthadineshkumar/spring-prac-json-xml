package com.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long>{
}
