package com.devSuperior.dsList.services;


import com.devSuperior.dsList.dto.GameListDTO;
import com.devSuperior.dsList.dto.GameMinDTO;
import com.devSuperior.dsList.entity.GameList;
import com.devSuperior.dsList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServices {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
