package com.example.demotda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImportProductDto {
    private Long id;
    private Date dateadd;
    private int quantity;
    private ProductDto productDto;

}
