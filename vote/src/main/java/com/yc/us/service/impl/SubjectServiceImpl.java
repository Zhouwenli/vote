package com.yc.us.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yc.us.entity.InsertBean;
import com.yc.us.entity.Item;
import com.yc.us.entity.Option;
import com.yc.us.entity.OptionBean;
import com.yc.us.entity.Subject;
import com.yc.us.entity.SubjectBean;
import com.yc.us.entity.VoteBean;
import com.yc.us.mapper.SubjectMapper;
import com.yc.us.service.SubjectService;
@Transactional
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectMapper subjectMapper;

	@Override
	public List<Subject> getSubject() {
		
		return subjectMapper.getSubject();
	}

	@Override
	public Subject getSubjectById(int VS_ID) {
		
		return subjectMapper.getSubjectById(VS_ID);
	}

	@Override
	public List<SubjectBean> getSubjectBean() {
		
		return subjectMapper.getSubjectBean();
	}

	@Override
	public OptionBean findByOptionsById(int vS_ID) {
		
		return subjectMapper.getOptionById(vS_ID);
	}

	@Override
	public VoteBean findVoteBeanByIds(int vS_ID) {
		return subjectMapper.getVoteBeanByIds(vS_ID);
	}

	@Override @Transactional(propagation=Propagation.REQUIRED)
	public boolean saveVote(Item item) {
		try{
			subjectMapper.insertItem(item);
			return true;
		}catch(Exception e){
			LogManager.getLogger().error("投票失败",e);
			
		}
		return false;
	}

	@Override @Transactional(propagation=Propagation.REQUIRED)
	public boolean saveVote(Item item, String[] vO_ID) {
		boolean flag=true;
		if(vO_ID.length >1){
			for(String v:vO_ID){
				item.setVO_ID(Integer.parseInt(v));
				if(!saveVote(item)){
					return false;
				}
			}
			return true;
			
		}
		
		return saveVote(item);
	}

	
	//添加主题
	@Override @Transactional
	public InsertBean addSubject(InsertBean insertBean) {
		subjectMapper.insertSubject(insertBean);
		return insertBean;
	}

	@Override @Transactional
	public void addOption(Option option) {
		subjectMapper.insertOption(option);
	}

	@Override @Transactional
	public void add(InsertBean insertBean) {
		// 1.插入我们的主题
		insertBean=addSubject(insertBean);
		
		//2.插入所有的选项
		List<String> options=insertBean.getOptions();
		for(int i=0;i<options.size();i++){
			Option option=new Option(options.get(i),insertBean.getVS_ID(),i+1);
			addOption(option);
		}
	}

	

}
