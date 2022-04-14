package com.citytech.games.thegame.xmllogic;


import com.citytech.games.thegame.model.TicTacToe;
import org.w3c.dom.Element;

public class TicTacToeRule {

    public static TicTacToe getTicTacToe (Element element){

        int no = Integer.parseInt(element.getAttribute("no"));

        int p1 = Integer.parseInt(element.getAttribute("p1"));

        int p2 = Integer.parseInt(element.getAttribute("p2"));

        int p3 = Integer.parseInt(element.getAttribute("p3"));

        String position =  element.getTextContent();

        var rule = new TicTacToe(no, p1, p2, p3, position);

        return rule;

    }

}