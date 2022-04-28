package com.bajajfinserve.util;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Shubham Patidar
 *
 */
@Component
public class FilterArrayUtil {

	public boolean isStringOrNumber(String filter) {
		return ((filter != null) && (!filter.equalsIgnoreCase(" ")) && (filter.matches("^[a-zA-Z]*$")));
	}
	
	public String[] convertArrayListToArray(List<String> list) { 
		String [] ar = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ar[i] = list.get(i);
		}
		return ar;
	}
}
