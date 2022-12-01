package com.nikkhat.hotel.hotel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name ="hotel")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Hotel {

    @Id
    @Column(name = "id")
   private String id;
   private String name;
   private String location;
   private String about;

}
