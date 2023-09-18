package com.takeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.entity.Cargo;

@Repository
public interface CargoRepository extends  JpaRepository<Cargo,Integer>{

}
