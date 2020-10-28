package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface Hotelservice {
 List<Hotel> getAllHotels();
 Hotel getByid(int id);
 List<Hotel> getByCity(String city);
 List<Hotel> getByCuisine(String cuisine);
}
