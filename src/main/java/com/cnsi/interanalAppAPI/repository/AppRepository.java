package com.cnsi.interanalAppAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnsi.interanalAppAPI.model.Appdetails;

public interface AppRepository extends JpaRepository<Appdetails, Long>{

}
