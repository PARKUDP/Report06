package Report06.app.src.main.java.jp.ac.uryukyu.ie.e225752_e225755_e225758;


public class Deeler extends Human{

    Deeler(){
        this.name = "deeler";
    }

    public void deelerAutoDraw(){
        if(totalValue() < 17){
            String drawedcard = draw();
            System.out.println("ディーラーは" + drawedcard + "を引いた。" + "得点は" + totalValue());
        }
    }
    
}