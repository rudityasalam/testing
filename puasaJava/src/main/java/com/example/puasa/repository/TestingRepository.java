package com.example.puasa.repository;

import com.example.puasa.Entity.TestingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestingRepository extends JpaRepository<TestingEntity, UUID> {
}
