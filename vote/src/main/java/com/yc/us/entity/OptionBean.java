package com.yc.us.entity;

import java.io.Serializable;
import java.util.List;

public class OptionBean implements Serializable {
	private static final long serialVersionUID = -7181669799998890949L;
	private String VS_TITLE;
	private int optionCount;
	private List<Integer> voteOptionCount;
	private int voteUserCount;
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
	public List<Integer> getVoteOptionCount() {
		return voteOptionCount;
	}
	public void setVoteOptionCount(List<Integer> voteOptionCount) {
		this.voteOptionCount = voteOptionCount;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "\nOptionBean [VS_TITLE=" + VS_TITLE + ", optionCount="
				+ optionCount + ", voteOptionCount=" + voteOptionCount
				+ ", voteUserCount=" + voteUserCount + "]";
	}
	
	
}
