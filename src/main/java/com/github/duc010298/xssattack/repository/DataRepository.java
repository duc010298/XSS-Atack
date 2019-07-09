package com.github.duc010298.xssattack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.duc010298.xssattack.entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, String> {

	List<DataEntity> findAll();
}