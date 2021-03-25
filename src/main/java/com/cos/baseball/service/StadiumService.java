package com.cos.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseball.domain.stadium.Stadium;
import com.cos.baseball.domain.stadium.StadiumRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumRepository stadiumRepository;
	
	public List<Stadium> findAll() {
		return stadiumRepository.findAll();
	}
	
	public void save(Stadium stadium) {
		stadiumRepository.save(stadium);
	}
	
	@Transactional
	public void deleteById(int id) {
		
		stadiumRepository.deleteById(id);
	}
}