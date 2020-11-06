package com.example.assignement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignement.model.Offer;
import com.example.assignement.service.OfferService;

@RestController
@RequestMapping("/recrutingprocess")
public class OfferController {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(OfferController.class);

	@Autowired
	private OfferService offerService;

	/**
	 * To get job offer detail by ID
	 */
	@RequestMapping(value = "/getJobOfferById/{parameter}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Offer> getJobOfferById(@PathVariable("parameter") final String parameter) {

		LOGGER.info("Entering into method getJobOfferById");
		Offer offer = offerService.getJobOfferById(parameter);
		LOGGER.info("Exiting from method getJobOfferById");
		return new ResponseEntity<Offer>(offer, HttpStatus.OK);
	}
	
	/**
	 * To get all job offer
	 */
	@RequestMapping(value = "/getAllJobOffer", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Offer>> getAllJobOffer()  {

		LOGGER.info("Entering into method getJobOfferById");
		List<Offer> offer = offerService.getAllJobOffer();
		LOGGER.info("Exiting from method getJobOfferById");

		return new ResponseEntity<List<Offer>>(offer, HttpStatus.OK);
	}

	/**
	 * To create job offer
	 */
	@RequestMapping(value = "/createOffer", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<String> createJobOffer(@RequestBody final Offer offerDetails) {
		LOGGER.info("Entering into method createOffer >>");
		offerService.createJobOffer(offerDetails);
		LOGGER.info("Exiting from method createOffer <<");
		return new ResponseEntity<String>("Offer Created successfilly.", HttpStatus.OK);

	}

}
