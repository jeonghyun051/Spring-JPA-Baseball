package com.cos.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.team.Team;
import com.cos.baseball.service.PlayerService;
import com.cos.baseball.service.TeamService;
import com.cos.baseball.web.dto.CMRespDto;
import com.cos.baseball.web.dto.player.PlayerSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
	private final TeamService teamService;
	
	@GetMapping
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/player/saveForm")
	public String saveForm(Model model) {
		List<Team> teams = teamService.findAll();
		model.addAttribute("teams",teams);
		return "player/saveForm";
	}
	
	@PostMapping("/player/save")
	public String save(PlayerSaveReqDto playerSaveReqDto) {
			
		playerService.save(playerSaveReqDto.toEntity());
		
		return "redirect:/player/list";
	}
	
	@GetMapping("/player/list")
	public String list(Model model) {
		
		List<Player> players = playerService.전체찾기();
		model.addAttribute("players", players);
		System.out.println("players" + players);
		
		return "player/list";
	}
	
	//댓글삭제
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> playerDelete(@PathVariable int id) {
		System.out.println("컨트롤러에서 값 받아짐?" + id);
		playerService.delete(id);
		
		return new CMRespDto<>(1,null); 

	}
}
