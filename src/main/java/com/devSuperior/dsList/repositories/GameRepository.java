package com.devSuperior.dsList.repositories;

import com.devSuperior.dsList.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
