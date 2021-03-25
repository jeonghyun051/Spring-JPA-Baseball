package com.cos.baseball.web.dto.team;

import com.cos.baseball.domain.stadium.Stadium;
import com.cos.baseball.domain.team.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeamSaveReqDto {
	
	private String teamName;
	private Stadium stadium;
	
	public Team toEntity() {
		return Team.builder()
		.teamName(teamName)
		.stadium(stadium)
		.build();
	}
}
