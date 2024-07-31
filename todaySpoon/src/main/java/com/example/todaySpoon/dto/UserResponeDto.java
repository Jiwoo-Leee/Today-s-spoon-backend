package com.example.todaySpoon.dto;

import lombok.Data;

//����� ������ �� ����ϴ� DTO
@Data
public class UserResponeDto {
    private String userName;
    private double proteinAmount;
    private double totalProteinAmount;
    private double fatAmount;
    private double totalFatAmount;
    private double carbohydrateAmount;
    private double totalCarbohydrateAmount;
}
