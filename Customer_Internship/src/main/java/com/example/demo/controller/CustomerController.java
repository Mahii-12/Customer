package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;

import com.example.demo.repository.CustomerRepository;

@Controller
public class CustomerController {
	 
	@Autowired
	CustomerRepository customerrepo;
	
	@RequestMapping("/")
	public String home() {
        return "home.jsp";		
	}

	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		customerrepo.save(customer);
		return "home";
		
	}
	
	@RequestMapping("/getCustomer")
	@ResponseBody
	public ModelAndView getCustomer1(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showcustomer.jsp");
		customerrepo.findById(id);
		mv.addObject(mv);
		return mv;
	}
	
	
	@PostMapping(path="/newCustomer",consumes="application/json")
	@ResponseBody
	public Customer addNewCustomer(Customer customer){
		return customerrepo.save(customer);
	}
	
	@GetMapping(path="/customer",produces="application/json")
	@ResponseBody
	public List<Customer> getCustomers(){
		return (List<Customer>) customerrepo.findAll();
	}
	
	@GetMapping("/customer/{id}")
	@ResponseBody
	public Optional<Customer> getCustomer(@PathVariable ("id") int id) {
		return customerrepo.findById(id);
	}
	
	@DeleteMapping("/customer/{id}")
	@ResponseBody
	public String deleteCustomerByid(@PathVariable  int id) {
		Customer c=customerrepo.getOne(id);
		customerrepo.delete(c);
		return "deleted";
	}
	
	
	@PutMapping(path="/customer",consumes="application/json")
	@ResponseBody
	public Customer saveOrupdateCustomer(Customer customer) {
		 customerrepo.save(customer);
		 return customer;
	}
	
	
	
			
	

}
