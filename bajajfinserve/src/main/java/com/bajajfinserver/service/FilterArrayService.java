package com.bajajfinserver.service;

import org.springframework.stereotype.Service;

import com.bajajfinserver.bean.FilterArrayResponse;
import com.bajajfinserver.dto.FilterArrayDto;

/**
 * 
 * @author Shubham Patidar
 *
 */
@Service
public interface FilterArrayService {
	public FilterArrayResponse performFilterArrayOperation(FilterArrayDto filterDto);
}
