package com.example.assignement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignement.model.Application;
import com.example.assignement.model.Offer;
import com.example.assignement.service.ApplicationService;

@RestController
@RequestMapping("/recrutingprocess/application")
public class ApplicationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value = "/getAllApplicationByJobId/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Application>> getAllApplicationByJobId(@PathVariable("parameter") final String parameter) {

		LOGGER.trace("Entering into method getAllApplicationByJobId");
		List<Application> applicationList = applicationService.getAllApplicationByJobId(parameter);
		LOGGER.trace("Exiting from method getAllApplicationByJobId");
		return new ResponseEntity<List<Application>>(applicationList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getApplicationDetails/{param1}/{param2}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Application> getUserApplicationDetails(@PathVariable("param1") final String jobId,@PathVariable("param2") final String emailId) {

		LOGGER.trace("Entering into method getUserApplicationDetails");
		Application applicationList = applicationService.getUserApplicationDetails(jobId,emailId);
		LOGGER.trace("Exiting from method getUserApplicationDetails");
		return new ResponseEntity<Application>(applicationList, HttpStatus.OK);
	}
	
	
	/**
	 * Add description
	 * @throws Exception 
	 */
	@RequestMapping(value = "/createApplication", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<String> createApplication(@RequestBody final Application applicationDetails) throws Exception {
		LOGGER.info("Entering into method createApplication >>");
		applicationService.createApplication(applicationDetails);
		LOGGER.info("Exiting from method createOffer <<");
		return new ResponseEntity<String>("Application Submitted successfilly.", HttpStatus.OK);

	}

}
