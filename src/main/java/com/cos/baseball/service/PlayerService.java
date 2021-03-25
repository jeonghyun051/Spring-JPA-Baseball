package com.cos.baseball.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.player.PlayerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerRepository playerRepository;
	
	@Transactional(readOnly = true)
	public List<Player> 전체찾기() {
	
		return playerRepository.findAll();
		
	}
	
	@Transactional
	public void save(Player player) {
		
		playerRepository.save(player);
	}
	
	@Transactional
	public void delete(int id) {
		
		playerRepository.deleteById(id);
	}
	
}
