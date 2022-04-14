package com.citytech.games.thegame.controller;
import com.citytech.games.thegame.controller.business.TicTacToeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class TicTacToeController {

    @GetMapping("/tictactoe")
    public Map<String,Object> grtStatus(@RequestParam String position) {
       var map = TicTacToeService.getWinner(position);
       map.put("author", "ahelrchid, hafida");
       map.put("date", new Date());
       return map;
    }

}
