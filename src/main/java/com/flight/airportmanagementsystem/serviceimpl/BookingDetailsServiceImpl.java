package com.flight.airportmanagementsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flight.airportmanagementsystem.dto.BookingDetails;
import com.flight.airportmanagementsystem.repository.BookingDetailsRepository;
import com.flight.airportmanagementsystem.respose.ApplicationResponse;
import com.flight.airportmanagementsystem.service.BookingDetailsService;

@Repository
public class BookingDetailsServiceImpl implements BookingDetailsService{
	
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;
	
//	@Override
//	public ApplicationResponse<BookingDetails> saveBookingDetailsService(BookingDetails bookingDetails) {
//		
//		return null;
//	}
}
