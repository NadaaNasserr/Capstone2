package com.example.hotel.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Booking {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Column(columnDefinition = "int not null")
    @Pattern(regexp = "^\\d*$", message = "customer Id must be numeric")
    @NotNull(message = "customer id must be not empty")
    private Integer customerId;


    @Column(columnDefinition = "int not null")
    @Pattern(regexp = "^\\d*$", message = "room Id must be numeric")
    @NotNull(message = "room id must be not empty")
    private Integer roomId;


   @NotNull(message = "check In Date must be not empty")
    private LocalDate checkInDate;


    @NotNull(message = "check Out Date must be not empty")
    private  LocalDate checkOutDate;



    @Column(columnDefinition = "int not null")
    @Pattern(regexp = "^\\d*$", message = "total Price must be numeric")
    private Integer totalPrice;

}
