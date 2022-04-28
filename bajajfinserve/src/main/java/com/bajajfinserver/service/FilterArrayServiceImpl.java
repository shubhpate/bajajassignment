package com.bajajfinserver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bajajfinserver.bean.FilterArrayResponse;
import com.bajajfinserver.dto.FilterArrayDto;
import com.bajajfinserver.util.FilterArrayUtil;

/**
 * 
 * @author Shubham Patidar
 *
 */
@Component
public class FilterArrayServiceImpl implements FilterArrayService {

	@Autowired
	private FilterArrayUtil filterUtil;

	private static String EMAIL = "arjunpatidar1225@gmail.com";
	private static String USER_ID = "shubham_patidar_13011998";
	private static String ROLL_NUMBER = "PD1298";

	@Override
	public FilterArrayResponse performFilterArrayOperation(FilterArrayDto filterDto) {
		FilterArrayResponse filterResponse = new FilterArrayResponse();
		String[] str = filterDto.getData();
		List<String> numbers = new ArrayList<>();
		List<String> alphabates = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			String stringObj = str[i];
			boolean isNumber = filterUtil.isStringOrNumber(stringObj);
			if (isNumber) {
				alphabates.add(stringObj);
			} else {
				numbers.add(stringObj);
			}
		}

		filterResponse.setIs_success(true);
		filterResponse.setEmail(EMAIL);
		filterResponse.setUser_id(USER_ID);
		filterResponse.setRoll_number(ROLL_NUMBER);
		String[] alpha = (String[]) alphabates.toArray();
		filterResponse.setAlphabets(alpha);
		String[] num = (String[]) numbers.toArray();
		filterResponse.setNumbers(num);
		return filterResponse;
	}

}
