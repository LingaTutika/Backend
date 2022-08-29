package com.Linga.Status.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Linga.Status.Model.Status;
import com.Linga.Status.Service.StatusService;

@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	@PostMapping("/registerStatus")
	public Status registerStatus(@RequestBody Status status) {
	return	statusService.registerStatus(status);
		
	}
	 @GetMapping("/getStatus")
	 public List<Status> getStatus(){
		 return statusService.getStatus();
	 }

           
}
