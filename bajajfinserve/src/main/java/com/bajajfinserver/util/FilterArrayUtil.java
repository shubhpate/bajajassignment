package com.bajajfinserver.util;

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
}
