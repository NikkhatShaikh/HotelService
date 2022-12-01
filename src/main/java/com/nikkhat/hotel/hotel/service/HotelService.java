package com.nikkhat.hotel.hotel.service;

import com.nikkhat.hotel.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel (Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel (String id);
}
