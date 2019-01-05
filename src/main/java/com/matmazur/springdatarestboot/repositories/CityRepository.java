package com.matmazur.springdatarestboot.repositories;

import com.matmazur.springdatarestboot.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRepository extends JpaRepository<City,Long> {
}
