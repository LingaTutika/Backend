package com.Linga.Scholar.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Linga.Scholar.Repository.ScholarRepository;
import com.Linga.Scholar.mode.Scholar;

@Service
public class ScholarService {
	
	@Autowired
	private ScholarRepository scholarRepository;
	public Scholar registerScholar(Scholar scholar) {
		 return scholarRepository.save(scholar);
		
		
	}
	public List<Scholar> getScholar(){
		return (List<Scholar>) scholarRepository.findAll();
		
	}
	public Scholar updateScholar(Scholar scholar) {
		 Integer  ApplycationId = scholar.getApplycationId();
		Scholar sch= scholarRepository.findById(ApplycationId).get();
		sch.setFirstname(scholar.getFirstname());
		sch.setLastname(scholar.getLastname());
		sch.setEmail(scholar.getEmail());
		sch.setPhonenumber(scholar.getPhonenumber());
		sch.setCollegename(scholar.getCollegename());
		sch.setClassname(scholar.getClassname());
		sch.setAddress(scholar.getAddress());
		sch.setState(scholar.getState());
		
		return scholarRepository.save(sch);
	}

}
