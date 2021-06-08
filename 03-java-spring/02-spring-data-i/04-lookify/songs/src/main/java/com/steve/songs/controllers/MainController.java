package com.steve.songs.controllers;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.steve.songs.models.Song;
import com.steve.songs.services.SongService;
@Controller

public class MainController {
	@Autowired
	private SongService sService;
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("songs", this.sService.allSongs());
		return "dashboard.jsp";
	}
	@GetMapping("/songs/new")
	public String addSongPage(@ModelAttribute("song") Song song, Model viewModel) {
		List<Integer> ratingList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		viewModel.addAttribute("ratingList", ratingList);
		return "addSong.jsp";
	}
	@PostMapping("/songs/new")
	public String newSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "addSong.jsp";
		}
		this.sService.newSong(song);
		return "redirect:/dashboard";
	}
	@RequestMapping(value="/songs/{id}/delete")
	public String delete(@PathVariable("id")Long id) {
		this.sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	@GetMapping("/songs/{id}")
	public String showSong(Model viewModel, @PathVariable("id")Long id) {
		Song song = sService.getSingleSong(id);
		viewModel.addAttribute("song", song);
		return "showSong.jsp";
	}
	@GetMapping("/search/topten")
	public String TopTen(Model viewModel) {
		viewModel.addAttribute("songs", sService.topTenByRating());
		return "topTen.jsp";
	}
	@RequestMapping("/songs/search")
	public String searchSong(@RequestParam("artist") String artist, Model viewModel) {
		viewModel.addAttribute("songs", this.sService.byArtist(artist));
		viewModel.addAttribute("artist", artist);
		return "songSearched.jsp";
	}


}
