package com.cos.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.team.Team;
import com.cos.baseball.domain.team.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamRepository teamRepository;
	
	@Transactional(readOnly = true)
	public List<Team> findAll(){
		
		return teamRepository.findAll();
	}
	
	@Transactional
	public void save(Team team) {
		teamRepository.save(team);
	}
	
	@Transactional
	public void deleteById(int id) {
		
		teamRepository.deleteById(id);
	}
}
