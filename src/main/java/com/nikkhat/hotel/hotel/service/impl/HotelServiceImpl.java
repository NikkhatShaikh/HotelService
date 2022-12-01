package com.nikkhat.hotel.hotel.service.impl;

import com.nikkhat.hotel.hotel.entity.Hotel;
import com.nikkhat.hotel.hotel.exception.ResourceNotFoundException;
import com.nikkhat.hotel.hotel.repository.HotelRepository;
import com.nikkhat.hotel.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel createHotel(Hotel hotel) {
        String randomUserId= UUID.randomUUID().toString();   // generate unique Userid
        hotel.setId(randomUserId);
        return this.hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return this.hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return this.hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Given Id Is not found!!"));
    }
}
