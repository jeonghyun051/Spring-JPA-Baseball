package com.cos.baseball.web.dto.stadium;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.stadium.Stadium;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StadiumSaveReqDto {

	private String stadiumName;

	
	public Stadium toEntity() {
		return Stadium.builder()
				.stadiumName(stadiumName)
				.build();
	}
}
