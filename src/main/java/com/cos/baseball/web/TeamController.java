package com.cos.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball.domain.stadium.Stadium;
import com.cos.baseball.domain.team.Team;
import com.cos.baseball.service.StadiumService;
import com.cos.baseball.service.TeamService;
import com.cos.baseball.web.dto.CMRespDto;
import com.cos.baseball.web.dto.team.TeamSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	private final StadiumService stadiumService;

	@GetMapping("team/list")
	public String 팀전체보기(Model model) {

		List<Team> teams = teamService.findAll();
		System.out.println("teams" + teams);
		model.addAttribute("teams", teams);

		return "team/list";
	}

	@GetMapping("team/saveForm")
	public String 팀등록페이지(Model model) {
		List<Stadium> stadiums = stadiumService.findAll();
		model.addAttribute("stadiums", stadiums);
		return "team/saveForm";
	}

	@PostMapping("team/save")
	public String 팀저장하기(TeamSaveReqDto teamSaveReqDto) {
		teamService.save(teamSaveReqDto.toEntity());

		return "redirect:/team/list";
	}

	// 댓글삭제
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> playerDelete(@PathVariable int id) {
		
		teamService.deleteById(id);

		return new CMRespDto<>(1, null);

	}
}
