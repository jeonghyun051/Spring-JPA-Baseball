package com.cos.baseball.domain.stadium;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.cos.baseball.domain.team.Team;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Stadium {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String stadiumName;
	
	@OneToOne(mappedBy = "stadium", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"stadium"})
	@ToString.Exclude
	private Team team;
	 
	@CreationTimestamp
	private Timestamp createDate;

}
