package org.hashd.restsample.repository;

import org.hashd.restsample.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it's type of component but with transactional 
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Integer> {
}
