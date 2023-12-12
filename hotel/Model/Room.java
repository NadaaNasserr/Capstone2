package com.example.hotel.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Room {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;


    @Column(columnDefinition = "varchar(10) not null unique")
    @NotEmpty(message = "room code must be not empty")
    private String roomCode;


    @Column(columnDefinition = "varchar(20) not null")
    @NotEmpty(message = "room type must be not empty")
    private String roomType;


    @Pattern(regexp = "^\\d*$", message = "room Capacity must be numeric")
    @Column(columnDefinition = "int not null")
    @NotNull(message = "room capacity must be not empty")
    private Integer roomCapacity;

   @Pattern(regexp = "^\\d*$", message = "floor must be numeric")
     @Column(columnDefinition = "int not null")
    @NotNull(message = "floor must be not empty")
    private Integer floor;


   @Pattern(regexp = "^\\d*$", message = "price must be numeric")
    @Column(columnDefinition = "int not null")
    @NotNull(message = "price must be not empty")
    private Float price;


    @AssertTrue(message = "must be true")
    private Boolean isAvailable;


    @Pattern(regexp = "^\\d*$", message = "rating must be numeric")
    @Column(columnDefinition = "double not null")
    private double rating;










}
