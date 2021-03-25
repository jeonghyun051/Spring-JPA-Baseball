package com.cos.baseball.domain.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerPositionDto {
	
	private String position;
	private String lot;
	private String sam;
	private String kia;

}
