package com.citytech.games.thegame.model;

public class TicTacToe {

    private int no;
    private int p1;
    private int p2;
    private int p3;
    private String position;

    public TicTacToe(){}

    public TicTacToe(int no, int p1, int p2, int p3, String position) {
        this.no = no;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.position = position;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TicTacToe{" +
                "no=" + no +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", position='" + position + '\'' +
                '}';
    }
}