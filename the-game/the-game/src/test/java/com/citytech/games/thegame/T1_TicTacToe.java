package com.citytech.games.thegame;
import com.citytech.games.thegame.controller.business.TicTacToeService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_TicTacToe {

    @ParameterizedTest
    @CsvSource({
            "XXXNNNNNN,       true",
            "OONNXXNNN,       false",
            "OOONNNNNN,       true",
            "OXO0XOXNN,       false",
            "NNNXXXNNN,       true",
            "XNXXOONNN,       false",
            "NNNNNNOOO,       true",
            "NXXNNNNNN,       false",
            "XNNOXNNOX,       true",
            "OXO0XOXNN,       false",
            "NXXOOOONN,       true",
            "OONNXXNNN,       false",
            "NXONXOXXN,       true",
            "XXOONNXXO,       false",
            "XNNOXOOOX,       true",
            "XXNNOONXX,       false",
            "NOOXXXOON,       true",
            "NOOXXOOOX,       false",
            "OOOXXNOON,       true",
            "OOXXXNNOO,       false",






    })
    void  testWithCvsSource(String position, boolean status) {

        var mapResults = TicTacToeService.getWinner(position);
        assertEquals(status, mapResults.get("status"));

        System.out.println(position + " " + status);

    }
}
