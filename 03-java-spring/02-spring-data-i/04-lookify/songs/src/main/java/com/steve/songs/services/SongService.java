package com.steve.songs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.songs.models.Song;
import com.steve.songs.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository sRepo;
	
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	public List<Song> allSongs(){
		return this.sRepo.findAll();
	}
	public Song newSong(Song song) {
		return sRepo.save(song);
	}
	public Song getSingleSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	public Song updateSong(Song song) {
		return sRepo.save(song);
	}
	public List<Song> topTenByRating() {
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> byArtist(String search){
		return this.sRepo.findAllByArtistContaining(search);
	}
}
