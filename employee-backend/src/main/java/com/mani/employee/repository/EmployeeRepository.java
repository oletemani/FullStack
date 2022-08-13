package com.mani.employee.repository;

import com.mani.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
