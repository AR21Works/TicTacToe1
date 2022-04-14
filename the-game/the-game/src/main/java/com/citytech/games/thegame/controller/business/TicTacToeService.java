package com.citytech.games.thegame.controller.business;
import com.citytech.games.thegame.model.TicTacToe;

import com.citytech.games.thegame.utility.XMLProcessorUtility;
import com.citytech.games.thegame.xmllogic.TicTacToeRule;

import java.util.*;

public class TicTacToeService {
    public static Map<String, Object> getWinner(String position) {
        String fileName = "/data/tic-tac-toe.xml";
        String elementName = "rule";
        List<TicTacToe> rule = XMLProcessorUtility.processXML(TicTacToeRule::getTicTacToe, fileName, elementName);
        Map<String, Object> map = new HashMap<>();


        char[] ch = new char[position.length()];
        for (int i = 0; i < position.length(); i++){
            ch[i] = position.charAt(i);}

        for (int i = 0; i < rule.size(); i++) {
            if (Character.toString(ch[rule.get(i).getP1()]).equals("X")
                    && Character.toString(ch[rule.get(i).getP2()]).equals("X")
                    && Character.toString(ch[rule.get(i).getP3()]).equals("X")){
                map.put("no", rule.get(i).getNo());
                map.put("p1", rule.get(i).getP1());
                map.put("p2", rule.get(i).getP2());
                map.put("p3", rule.get(i).getP3());
                map.put("position", rule.get(i).getPosition());
                map.put("status", true);
                map.put("winner", "X");
                map.put("input", position);
                map.put("author", "ahelrchid, hafida");
                map.put("date", new Date());


                break;
            }
            else if (Character.toString(ch[rule.get(i).getP1()]).equals("O")
                    && Character.toString(ch[rule.get(i).getP2()]).equals("O")
                    && Character.toString(ch[rule.get(i).getP3()]).equals("O"))
            {
                map.put("no", rule.get(i).getNo());
                map.put("p1", rule.get(i).getP1());
                map.put("p2", rule.get(i).getP2());
                map.put("p3", rule.get(i).getP3());
                map.put("position", rule.get(i).getPosition());
                map.put("status", true);
                map.put("winner", "O");
                map.put("input", position);
                map.put("author", "ahelrchid, hafida");
                map.put("date", new Date());


                break;
            }
            else {
                map.put("status", false);
            }

        }
        return map;
    }
    public static  void main(String[] args) {
        String fileName = "/data/tic-tac-toe.xml";
        String elementName = "rule";
        List<TicTacToe> rule = XMLProcessorUtility.processXML(TicTacToeRule::getTicTacToe, fileName, elementName);
        rule.forEach(System.out::println);
    }



}