package com.bajajfinserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajajfinserve.bean.FilterArrayResponse;
import com.bajajfinserve.dto.FilterArrayDto;
import com.bajajfinserve.service.FilterArrayService;

/**
 * 
 * @author Shubham Patidar
 *
 */
@RestController
@RequestMapping(path = "/bfhl")
public class BajajFilterArrayController {

	@Autowired
	private FilterArrayService filterArrayService;

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<FilterArrayResponse> addEmployee(@RequestBody FilterArrayDto filterDto) {
		FilterArrayResponse response = null;
		try {
			response = filterArrayService.performFilterArrayOperation(filterDto);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return ResponseEntity.ok(response);
	}
}
