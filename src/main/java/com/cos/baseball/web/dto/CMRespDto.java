package com.cos.baseball.web.dto;

import java.sql.Timestamp;

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
public class CMRespDto <T>{

	private int statusCode;
	private T data;
	
}
