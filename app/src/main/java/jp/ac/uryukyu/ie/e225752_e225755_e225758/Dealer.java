package jp.ac.uryukyu.ie.e225752_e225755_e225758;
//パッケージ名を修正

public class Dealer extends Human{ //クラス名を修正

    Dealer(){
        this.name = "Dealer";
    }
    
    public void deelerAutoDraw(){
        if(totalValue() < 17){
            String drawedcard = draw();
            System.out.println("ディーラーは" + drawedcard + "を引いた。" + "得点は" + totalValue());
        }
    }
    
}