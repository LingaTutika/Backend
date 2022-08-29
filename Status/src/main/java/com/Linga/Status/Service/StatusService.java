package com.Linga.Status.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Linga.Status.Model.Status;
import com.Linga.Status.Repository.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepository statusRepository;
	public Status registerStatus(Status status) {
		 return statusRepository.save(status);
		
	}
	public List<Status> getStatus(){
		return (List<Status>) statusRepository.findAll();
	}


}
