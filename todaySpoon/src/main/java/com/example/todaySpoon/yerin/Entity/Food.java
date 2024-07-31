package com.example.todaySpoon.yerin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodID;
    private String foodName;
    private String url;
    private float calorie;
    private float unitAmount;
    private float proteinAmount;
    private float fatAmount;
    private float carbohydrateAmount;


}