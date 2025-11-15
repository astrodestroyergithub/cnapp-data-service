package com.cnapp.cnappdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cnapp.cnappdataservice.entity.GK;

@Repository
public interface GKRepository extends JpaRepository<GK, Long> {
}
