package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameDTO;
import com.devSuperior.dsList.dto.GameMinDTO;
import com.devSuperior.dsList.entity.Game;
import com.devSuperior.dsList.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServices gameServices;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameServices.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameServices.findAll();
        return result;
    }
}
