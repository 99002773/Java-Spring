package com.hotelapp.model;

public class Hotel {
   String hotelname;
   Integer hotelid;
   String city;
   String cuisine;
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(String hotelname, Integer hotelid, String city, String cuisine) {
	super();
	this.hotelname = hotelname;
	this.hotelid = hotelid;
	this.city = city;
	this.cuisine = cuisine;
}
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public Integer getHotelid() {
	return hotelid;
}
public void setHotelid(Integer hotelid) {
	this.hotelid = hotelid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
@Override
public String toString() {
	return "Hotel [hotelname=" + hotelname + ", hotelid=" + hotelid + ", city=" + city + ", cuisine=" + cuisine + "]";
}
   

}
