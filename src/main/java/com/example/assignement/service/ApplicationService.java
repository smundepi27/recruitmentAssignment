package com.example.assignement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignement.model.Application;
import com.example.assignement.model.Offer;

@Service
public class ApplicationService {
	
	@Autowired
	OfferService offerService;

	public void createApplication(Application applicationDetails) throws Exception {
		if(checkOfferExits(applicationDetails.getJobId()) ) {
			if(checkUserAlreadyApplied(applicationDetails.getJobId(),applicationDetails.getUserEmailId())) {
			applicationList.add(applicationDetails); }
			else {
				throw new Exception("Dear User you already applied and its in review process");
			}
		}
		else {
			throw new Exception("Job offer does not exits.");
		}
	}
	
	public Application getUserApplicationDetails(String jobId, String emailId) {
		return applicationList.stream().filter(application -> application.getJobId().equals(jobId) && application.getUserEmailId().equals(emailId)).findFirst().orElse(null);

	}
	
	public List<Application> getAllApplicationByJobId(String Id) {
		return applicationList.stream().filter(application -> application.getJobId().equals(Id)).collect(Collectors.toList());
	}
	
	
	public boolean checkOfferExits(String jobId) {
		
		Offer offerDetails = offerService.getJobOfferById(jobId);
		if(offerDetails != null) {
			return true;
		}
		return false;
		
	}
	
	public boolean checkUserAlreadyApplied(String jobId, String emailId) {
		
		Application result = applicationList.stream().filter(application -> application.getJobId().equals(jobId) && application.getUserEmailId().equals(emailId)).findFirst().orElse(null);
		if(result != null) {
			return false;
		}
		return true;
		
	}
	
	
	  private List<Application> applicationList = new ArrayList<>(Arrays.asList(
	            new Application("101","Java Developer", "s@mail.com","resume details","HIRED"),
	            new Application("101","Java Developer", "z@mail.com","resume details","INVITED"),
	            new Application("201","Java Developer", "y@mail.com","resume details","INVITED")	           
	    ));
}
