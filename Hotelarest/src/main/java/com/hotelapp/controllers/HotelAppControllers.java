package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.Hotelservice;

@RestController
public class HotelAppControllers {
	@Autowired
	Hotelservice hotelservice;
	@GetMapping("/hotel")
	public List<Hotel> showAllBooks()
	{
		return hotelservice.getAllHotels();
	}
	@GetMapping("/hotel-by-city/{city}")
	public List<Hotel> showHotelByCity(@PathVariable("city")String city)
	{
		return hotelservice.getByCity(city);
	}
	@GetMapping("/hotel-by-cuisine/{cuisine}")
	public List<Hotel> showHotelByCuisine(@PathVariable("cuisine")String cuisine)
	{
		return hotelservice.getByCuisine(cuisine);
	}
@GetMapping("/hotel-by-Id/{id}")
public Hotel showById(@PathVariable("id")int id) {
	return hotelservice.getByid(id);
	
}
	

}
