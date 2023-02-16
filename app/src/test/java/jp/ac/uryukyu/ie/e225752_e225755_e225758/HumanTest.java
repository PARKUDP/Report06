package jp.ac.uryukyu.ie.e225752_e225755_e225758;

public class HumanTest {
    @Test
    public static void main(){
        Cardlist clist = new Cardlist();
        Human player1 = new Human("player1", clist);
        player1.draw();
        player1.draw();
        demo.totalValue();
    }
}
