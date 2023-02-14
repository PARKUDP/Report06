package jp.ac.uryukyu.ie.e225752_e225755_e225758;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("ゲームを選択してください。");
        System.out.println("1.ブラックジ;ャック 2.準備中");
        Scanner scanner = new Scanner(System.in);
        int select_result = scanner.nextInt();
        
        if(select_result == 1){//プレイヤーが二人の場合
            Cardlist cl = new Cardlist();
            cl.Card_remove("Black Joker");
            cl.Card_remove("Color Joker");
            Player player1 = new Player("Aさん", cl);
            //Player plyer2 = new Player("Bさん", cl);
        }
        while(true){


        }
    }
    
    
}