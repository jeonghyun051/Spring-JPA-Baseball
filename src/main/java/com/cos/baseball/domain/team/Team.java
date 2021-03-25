package com.cos.baseball.domain.team;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.cos.baseball.domain.player.Player;
import com.cos.baseball.domain.stadium.Stadium;
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
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamName;

	@OneToMany(mappedBy = "team", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"team"})
	@ToString.Exclude
	private List<Player> player;
	
	@OneToOne
	@JoinColumn(name="stadiumId")
	private Stadium stadium;

	@CreationTimestamp
	private Timestamp createDate;
}
