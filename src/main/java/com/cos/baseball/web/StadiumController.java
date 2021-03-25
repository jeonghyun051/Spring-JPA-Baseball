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
import com.cos.baseball.service.StadiumService;
import com.cos.baseball.web.dto.CMRespDto;
import com.cos.baseball.web.dto.stadium.StadiumSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;

	@GetMapping("/stadium/saveForm")
	public String saveForm() {
		return "stadium/saveForm";
	}

	@GetMapping("stadium/list")
	public String findAll(Model model) {

		List<Stadium> stadiums = stadiumService.findAll();

		model.addAttribute("stadiums", stadiums);
		return "stadium/list";
	}

	@PostMapping("stadium/save")
	public String 구단등록(StadiumSaveReqDto stadiumSaveReqDto) {
		stadiumService.save(stadiumSaveReqDto.toEntity());

		return "redirect:/stadium/list";

	}

	// 댓글삭제
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> playerDelete(@PathVariable int id) {

		stadiumService.deleteById(id);

		return new CMRespDto<>(1, null);

	}
}
