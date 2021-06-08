package com.steve.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.steve.songs.models.Song;
import com.steve.songs.services.SongService;

@RestController
@RequestMapping("/api")

public class SongsApi {
	@Autowired
	private SongService sService;
	
	@GetMapping("")
	public List<Song> getSongs(){
		return this.sService.allSongs();
	}
	@GetMapping("/{id}")
	public Song getSong(@PathVariable("id") Long id) {
		return this.sService.getSingleSong(id);
	}
	@PostMapping("/new")
	public Song newSong(Song newSong) {
		return this.sService.newSong(newSong);
	}
	@PutMapping("/update/{id}")
	public Song edit(@PathVariable("id")Long id, Song updateSong) {
		return this.sService.updateSong(updateSong);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
	}
}
