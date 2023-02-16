package jp.ac.uryukyu.ie.e225752_e225755_e225758;

public class Main {
    public static void main(String[] args){
        //プレイヤーが二人の場合
        Cardlist cl = new Cardlist();
        cl.Card_remove("Color Joker");
        cl.Card_remove("Black Joker");
        Player plyer1 = new Player("Aさん", cl);
        Player player2 = new Player("Bさん", cl);
        while(true){
            if(plyer1.totalValue() <= 21){
                plyer1.draw();
            }
            if(player2.totalValue() <= 21){
                player2.draw();
            }
            if(plyer1.totalValue() == 21){
                System.out.println(plyer1.name + "の勝ち");
                break;
            }
            if(player2.totalValue() == 21){
                System.out.println(player2.name + "の勝ち");
                break;
            }
            if(plyer1.totalValue() > 21){
                System.out.println(player2.name + "の勝ち");
                break;
            }
            if(player2.totalValue() > 21){
                System.out.println(plyer1.name + "の勝ち");
                break;
            }
        }
        
         //プレイヤー名を具体的に書く
        //Player plyer2 = new Player("Bさん", cl);


    }
    
    
}
