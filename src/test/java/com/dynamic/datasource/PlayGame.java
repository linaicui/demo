package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/28
 **/
public class PlayGame {

    public static void main(String[] args) {
        GuessNumberHander guessNumberHander = new GuessNumberHander();
        while (true){
            boolean b = guessNumberHander.startGame();
            if (!b){
                System.out.println("没人猜对游戏继续");
            }else {
                System.out.println("有人猜对，游戏结束");
                break;
            }
        }

    }
}
