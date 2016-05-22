package com.yc.us.service;

import java.util.List;

import com.yc.us.entity.InsertBean;
import com.yc.us.entity.Item;
import com.yc.us.entity.Option;
import com.yc.us.entity.OptionBean;
import com.yc.us.entity.Subject;
import com.yc.us.entity.SubjectBean;
import com.yc.us.entity.VoteBean;

public interface SubjectService {

	List<Subject> getSubject();
	
	List<SubjectBean> getSubjectBean();

	Subject getSubjectById(int VS_ID);

	OptionBean findByOptionsById(int vS_ID);

	VoteBean findVoteBeanByIds(int vS_ID);

	boolean saveVote(Item item);

	boolean saveVote(Item item, String[] vO_ID);
	
	//1.一个添加主题
	//2.一个添加选项
	InsertBean addSubject(InsertBean insertBean);
	void addOption(Option option);

	void add(InsertBean insertBean);
	
	
}
