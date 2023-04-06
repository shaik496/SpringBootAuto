package com.example.learnspringframework;

public class AppBaisicGaming {

    public static void main(String[] args) {
        var test= "meeravali";
        System.out.println(test);
//      var game= new MarioGame();
        var game=new SuperConstra();
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}