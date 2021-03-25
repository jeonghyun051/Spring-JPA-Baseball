package com.cos.baseball.domain.query;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class PlayerQuery {
	
	private final EntityManager em;
	
	// import javax.persistence.Query; 꺼임
	public Query playerPivot() {
		Query query = em.createNativeQuery("select position as 포지션, max(if(teamId='1',name,null)) '롯데', max(if(teamId='2',name,null)) '삼성', max(if(teamId='3',name,null)) '기아' from player group by position order by position");
		
		
		return query;
	}


}
