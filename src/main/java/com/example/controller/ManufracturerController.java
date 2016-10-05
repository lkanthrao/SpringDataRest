package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Manufacturer;
import com.example.repository.ManufacturerRepository;

@RestController
public class ManufracturerController {

	@Autowired
	private ManufacturerRepository manufacturerRepository;

	// expose a service to retreive manufacturer by startDate
	@RequestMapping(value = "/findByStartDate/{startDate}")
	public List<Manufacturer> findByStartDate(
			@DateTimeFormat(iso = ISO.DATE) @PathVariable Date startDate) {

		// convert the param to datatime format so that the Before and After
		// filter can be applied

		return manufacturerRepository.findByStartDateBefore(startDate);
	}

}
