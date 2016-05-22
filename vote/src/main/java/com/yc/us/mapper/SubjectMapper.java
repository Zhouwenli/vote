package com.yc.us.mapper;

import java.util.List;

import com.yc.us.entity.InsertBean;
import com.yc.us.entity.Item;
import com.yc.us.entity.Option;
import com.yc.us.entity.OptionBean;
import com.yc.us.entity.Subject;
import com.yc.us.entity.SubjectBean;
import com.yc.us.entity.VoteBean;

public interface SubjectMapper {

	List<Subject> getSubject();
	
	Subject getSubjectById(int VS_ID);

	List<SubjectBean> getSubjectBean();

	OptionBean getOptionById(int vS_ID);

	VoteBean getVoteBeanByIds(int vS_ID);

	

	void insertItem(Item item);

	void insertSubject(InsertBean insertBean);

	void insertOption(Option option);

	

}
