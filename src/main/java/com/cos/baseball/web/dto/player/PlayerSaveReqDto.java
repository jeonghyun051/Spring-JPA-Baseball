package com.cos.baseball.web.dto.player;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.team.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlayerSaveReqDto {

	private String name;
	private String position;
	private Team team;
	
	public Player toEntity() {
		return Player.builder()
				.name(name)
				.position(position)
				.team(team)
				.build();
	}
}
