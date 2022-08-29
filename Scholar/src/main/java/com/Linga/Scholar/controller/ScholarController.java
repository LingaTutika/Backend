package com.Linga.Scholar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Linga.Scholar.Service.ScholarService;
import com.Linga.Scholar.mode.Scholar;

@RestController
@CrossOrigin(allowedHeaders= "*",origins ="*")
public class ScholarController {
	        @Autowired
	        private ScholarService  scholarService;
	        
	        @PostMapping("/registerScholar")
            public  Scholar registerScholar( @RequestBody Scholar scholar) {
	        	 return scholarService.registerScholar(scholar);
            	
            }
	        @GetMapping("/getScholar")
	        public List<Scholar> getScholar(){
	        return	scholarService.getScholar();
	        	
	        }
	        @PutMapping("/updateScholar")
	        public Scholar updateScholar(@RequestBody Scholar scholar ) {
	        	return  scholarService.updateScholar(scholar);
	        	
	        }
}
