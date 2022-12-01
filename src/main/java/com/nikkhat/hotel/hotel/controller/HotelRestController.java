package com.nikkhat.hotel.hotel.controller;

import com.nikkhat.hotel.hotel.entity.Hotel;
import com.nikkhat.hotel.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class HotelRestController {

    @Autowired
    private HotelService service;

    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){

        Hotel hotel1 = service.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);

    }


    @GetMapping("/getAllHotel")
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id){
        return ResponseEntity.ok(service.getHotel(id));
    }

}
