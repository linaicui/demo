package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/28
 **/
public class Player {
    private String name;
    private Integer guessNumber;

    public Player(String name, Integer guessNumber) {
        this.name = name;
        this.guessNumber = guessNumber;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    public int guess(){
        int i = (int) (Math.random() * 10);
        System.out.println(name+"猜测的数字是"+i);
        return i;
    }
}
