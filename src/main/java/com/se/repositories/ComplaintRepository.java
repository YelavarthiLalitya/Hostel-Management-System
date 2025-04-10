package com.hostelmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hostelmanagement.models.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
