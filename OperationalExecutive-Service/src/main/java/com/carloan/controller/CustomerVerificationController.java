package com.carloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.communication.CMToOECibil;
import com.carloan.model.Cibil;
import com.carloan.model.CustomerVerification;
import com.carloan.service.CustomerVerificationService;

@RestController
@RequestMapping("/customerverification")
public class CustomerVerificationController {
	@Autowired
	private CMToOECibil cmoe;
	
	@Autowired
	private CustomerVerificationService ser;
	
	@GetMapping("/getdetailsbyid/{cibilId}")
	public ResponseEntity<Cibil>  getdetail(@PathVariable int cibilId)
	{
		
	   ResponseEntity<Cibil> c=cmoe.getcibildetailbyid(cibilId);
	  
	    return c;
		
		
	}
	
	
	

	@PostMapping("/addCustomerVerificationdetails")
	public ResponseEntity<String> addCustomerVerificationdetails(@RequestBody CustomerVerification cv) {
		
		      ser.addcustomerverificationdetails(cv);
		
		return  new ResponseEntity<String>("Data Added Successfully",HttpStatus.OK);
	}

}
