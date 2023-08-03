/**
 * 
 */
package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

/**
 * 
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

	Customer getOne(int id);

	//Customer findByFirstName(String firstname);
      
}
