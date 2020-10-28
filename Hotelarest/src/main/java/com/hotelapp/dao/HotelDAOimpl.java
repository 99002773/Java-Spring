package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOimpl implements HotelDAO{

	@Override
	public List<Hotel> getAllHotels() {
		return showHotelList();
	}

	@Override
	public Hotel getByid(int id) {
		//List<Hotel> newhotellist=new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getHotelid().equals(id))
				return hotel;
		}
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		List<Hotel> newhotellist=new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city))
				newhotellist.add(hotel);
		}
		return newhotellist;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newhotellist=new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				newhotellist.add(hotel);
		}
		return newhotellist;
	}
	private List<Hotel> showHotelList(){
		return Arrays.asList(new Hotel("Kalyani",100,"Mysore","Indian"),
				new Hotel("Haveli",101,"Khammam","Chineese"),
				new Hotel("Peocock",102,"Warangal","Indian"),
				new Hotel("Ramya",103,"Hyderabad","Chineese")
				);
	}

}
