package com.craft.springbootdata.model;

import javax.persistence.*;

@Entity
@Table(name = "") // interview_result_2
public class interview_result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "CANDIDATE_NAME")
	private String CANDIDATE_NAME;

	@Column(name = "CANDIDATE_SCORE")
	private double CANDIDATE_SCORE;

	@Column(name = "IS_SUCCESSFUL")
	private boolean IS_SUCCESSFUL;

	public interview_result() {

	}

	public interview_result(String CANDIDATE_NAME, double CANDIDATE_SCORE, boolean IS_SUCCESSFUL) {
		this.CANDIDATE_NAME = CANDIDATE_NAME;
		this.CANDIDATE_SCORE = CANDIDATE_SCORE;
		this.IS_SUCCESSFUL = IS_SUCCESSFUL;
	}

	public long getId() {
		return id;
	}

	public String getCANDIDATE_NAME() {
		return CANDIDATE_NAME;
	}

	public void setCANDIDATE_NAME(String CANDIDATE_NAME) {
		this.CANDIDATE_NAME = CANDIDATE_NAME;
	}

	public double getCANDIDATE_SCORE() {
		return CANDIDATE_SCORE;
	}

	public void setCANDIDATE_SCORE(double CANDIDATE_SCORE) {
		this.CANDIDATE_SCORE = CANDIDATE_SCORE;
	}

	public boolean isIS_SUCCESSFUL() {
		return IS_SUCCESSFUL;
	}

	public void setIS_SUCCESSFUL(boolean IS_SUCCESSFUL) {
		this.IS_SUCCESSFUL = IS_SUCCESSFUL;
	}

	@Override
	public String toString() {
		return "API [id=" + id + ", CANDIDATE_NAME=" + CANDIDATE_NAME + ", score=" + CANDIDATE_SCORE + ", IS_SUCCESSFUL=" + IS_SUCCESSFUL + "]";
	}

}