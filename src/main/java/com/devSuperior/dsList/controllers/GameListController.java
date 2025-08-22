package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameListDTO;
import com.devSuperior.dsList.services.GameListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListServices gameListServices;

   /* @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id){
        GameListDTO result = gameListServices.findById(id);
        return result;
    } */

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListServices.findAll();
        return result;
    }
}
