package com.hostelmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hostelmanagement.models.FoodRequest;

@Repository
public interface FoodRequestRepository extends JpaRepository<FoodRequest, Long> {
}
