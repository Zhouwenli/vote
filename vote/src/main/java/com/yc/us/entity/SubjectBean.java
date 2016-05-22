package com.yc.us.entity;

import java.io.Serializable;

public class SubjectBean implements Serializable {
	private int VS_ID;
	private String VS_TITLE;
	private int optionCount;
	private int voteCount;
	public int getVS_ID() {
		return VS_ID;
	}
	public void setVS_ID(int vS_ID) {
		VS_ID = vS_ID;
	}
	public String getVS_TITLE() {
		return VS_TITLE;
	}
	public void setVS_TITLE(String vS_TITLE) {
		VS_TITLE = vS_TITLE;
	}
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	@Override
	public String toString() {
		return "SubjectBean [VS_ID=" + VS_ID + ", VS_TITLE=" + VS_TITLE
				+ ", optionCount=" + optionCount + ", voteCount=" + voteCount
				+ "]";
	}
	
	

}
