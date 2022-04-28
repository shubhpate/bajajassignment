package com.bajajfinserve.service;

import org.springframework.stereotype.Service;

import com.bajajfinserve.bean.FilterArrayResponse;
import com.bajajfinserve.dto.FilterArrayDto;

/**
 * 
 * @author Shubham Patidar
 *
 */
public interface FilterArrayService {
	public FilterArrayResponse performFilterArrayOperation(FilterArrayDto filterDto);
}
