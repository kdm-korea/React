package com.services.webservice.library.dto;

import java.time.format.DateTimeFormatter;

public class TimeFormatter {
	protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
}
