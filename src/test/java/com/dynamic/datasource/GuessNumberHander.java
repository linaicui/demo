package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //写个游戏自己玩
 * @Date 2019/6/28
 **/
public class GuessNumberHander {
    private Player player1;
    private Player player2;
    private Player player3;

    public boolean startGame(){
        player1 = new Player("张三");
        player2 = new Player("李四");
        player3 = new Player("王五");

        //要猜测的数字
        int targetNum = (int) (Math.random() * 10);
        System.out.println("本次游戏要猜的目标数字为"+targetNum);

        //记录三位玩家的猜测结果
        int player1Guess=0;
        int player2Guess=0;
        int player3Guess=0;

        //记录猜测结果是否正确
        boolean player1Right=false;
        boolean player2Right=false;
        boolean player3Right=false;

        player1Guess=player1.guess();
        player2Guess=player2.guess();
        player3Guess=player3.guess();

        player1Right=player1Guess==targetNum;
        System.out.println("player1猜测的结果为"+player1Right);
        player2Right=player2Guess==targetNum;
        System.out.println("player2猜测的结果为"+player2Right);
        player3Right=player3Guess==targetNum;
        System.out.println("player3猜测的结果为"+player3Right);

        return player1Right||player2Right||player3Right;
    }
}
