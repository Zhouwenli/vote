package com.yc.us.entity;

import java.io.Serializable;
import java.util.List;

public class VoteBean implements Serializable {
	
	private static final long serialVersionUID = -3309713452637157524L;
	private int VS_ID;
	private String VS_TITLE;
	private int optionCount;
	private List<Option> options;
	private int voteUserCount;
	private int VS_TYPE;
	
	public int getVS_ID() {
		return VS_ID;
	}
	public void setVS_ID(int vS_ID) {
		VS_ID = vS_ID;
	}
	public int getVS_TYPE() {
		return VS_TYPE;
	}
	public void setVS_TYPE(int vS_TYPE) {
		VS_TYPE = vS_TYPE;
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
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	@Override
	public String toString() {
		return "VoteBean [VS_ID=" + VS_ID + ", VS_TITLE=" + VS_TITLE
				+ ", optionCount=" + optionCount + ", options=" + options
				+ ", voteUserCount=" + voteUserCount + ", VS_TYPE=" + VS_TYPE
				+ "]";
	}
	
	
	

}
