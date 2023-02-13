package com.lombok.spring_Lombok.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Laprepo extends JpaRepository<Laptop, Integer>{

}
