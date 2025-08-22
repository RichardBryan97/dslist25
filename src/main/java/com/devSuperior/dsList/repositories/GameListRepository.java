package com.devSuperior.dsList.repositories;

import com.devSuperior.dsList.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
