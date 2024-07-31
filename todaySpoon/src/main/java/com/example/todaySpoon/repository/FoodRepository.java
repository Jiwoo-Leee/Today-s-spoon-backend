package com.example.todaySpoon.repository;

import com.example.todaySpoon.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
// 특정 날짜 음식 정보 가져오기
public interface FoodRepository extends JpaRepository<Food, Long> {

}