package com.example.assignement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.assignement.model.Offer;

@Service
public class OfferService {


	public void createJobOffer(Offer offerDetails) {
		 topicList.add(offerDetails);
	}
	
	public List<Offer> getAllJobOffer() {
		return topicList;
	}
	
	public Offer getJobOfferById(String Id) {
		return topicList.stream().filter(offer -> offer.getJobId().equals(Id)).findFirst().orElse(null);
	}
	
		
	  private List<Offer> topicList = new ArrayList<>(Arrays.asList(
	            new Offer("101","Java Developer", new Date(06-11-2020), 10),
	            new Offer("201","Front End", new Date(04-11-2020), 20)	           
	    ));
}
