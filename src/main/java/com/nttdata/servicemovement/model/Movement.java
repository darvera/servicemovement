package com.nttdata.servicemovement.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
public class Movement {
    @Id
    private String idMovement;
    private String amount;
    private LocalDateTime createAt;
    Client client;
    Product product;
}
