package com.yc.us.entity;

public class Option {
	private int VO_ID;           //编号
	private String VO_OPTION;       //选项名  
	private int VS_ID;	//显示顺序
	private int VO_ORDER;
	
	
	public Option() {
		
	}
	public Option(String vO_OPTION, int vS_ID, int vO_ORDER) {
		
		VO_OPTION = vO_OPTION;
		VS_ID = vS_ID;
		VO_ORDER = vO_ORDER;
	}
	public int getVO_ID() {
		return VO_ID;
	}
	public void setVO_ID(int vO_ID) {
		VO_ID = vO_ID;
	}
	public String getVO_OPTION() {
		return VO_OPTION;
	}
	public void setVO_OPTION(String vO_OPTION) {
		VO_OPTION = vO_OPTION;
	}
	public int getVS_ID() {
		return VS_ID;
	}
	public void setVS_ID(int vS_ID) {
		VS_ID = vS_ID;
	}
	public int getVO_ORDER() {
		return VO_ORDER;
	}
	public void setVO_ORDER(int vO_ORDER) {
		VO_ORDER = vO_ORDER;
	}
	@Override
	public String toString() {
		return "Option [VO_ID=" + VO_ID + ", VO_OPTION=" + VO_OPTION
				+ ", VS_ID=" + VS_ID + ", VO_ORDER=" + VO_ORDER + "]";
	}
	 
	
	
	
	

}
