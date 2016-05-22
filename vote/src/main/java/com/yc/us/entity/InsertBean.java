package com.yc.us.entity;

import java.util.List;

public class InsertBean {
	private int VS_ID;
	private String VS_TITLE;
	private int VO_ID;
	private int VS_TYPE;
	private List<String> options;

	public int getVO_ID() {
		return VO_ID;
	}

	public void setVO_ID(int vO_ID) {
		VO_ID = vO_ID;
	}

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

	public int getVS_TYPE() {
		return VS_TYPE;
	}

	public void setVS_TYPE(int vS_TYPE) {
		VS_TYPE = vS_TYPE;
	}

	

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "InsertBean [VS_ID=" + VS_ID + ", VS_TITLE=" + VS_TITLE
				+ ", VO_ID=" + VO_ID + ", VS_TYPE=" + VS_TYPE + ", options="
				+ options + "]";
	}

	
	
	
	
}
