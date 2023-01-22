package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.Ledger;
import com.carloan.service.LedgerService;

@RestController
@RequestMapping("/Ledgerdetails")
public class LedgerController {
	
	@Autowired
	private LedgerService ser;

	@PostMapping("/adddetails")
	public Ledger addLedgerData(@RequestBody Ledger l) {
		 
		ser.addLedgerData(l);
		
		return l;
		
	}
	
	  @GetMapping("/getledgerdetails")
		public List<Ledger>getLedgerDetails(){
			
			List<Ledger> llist =ser.getAllDetails();
			return llist;
			
}
	  @DeleteMapping("/delledgerdetails/{ledgerId}")
	  public List<Ledger>deleteById(@PathVariable int ledgerId){
		  
		  List<Ledger> list = ser.deleteById(ledgerId);
		return list; 
		  
	  }
	  @PutMapping("/update") 
	  public List<Ledger> updateLedger(@RequestBody Ledger ledger) {
	 
	 ser.addLedgerData(ledger);
	  List<Ledger>llist=ser.getAllDetails();
	  return llist;
	 
	  }
	  
}