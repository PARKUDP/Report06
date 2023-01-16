package jp.ac.uryukyu.ie.e225752_e225755_e225758;

public class Human extends Cardlist {


    //フィールド記述。
    String name;
    Arraylist hand = new Arraylist<>();
    


    //コンストラクタを記述。
    Human(String _name){
        this.name = _name;
    }



    //メソッドを記述。
    //ランダムを用いてカードリストから選び、手札に追加するメソッド。
    public String draw(){
        Random rd = new Random;
        int randint = rd.nextInt(card_list.size());
        String drawed_card = card_list[randint];
        hand.add(drawed_card);
        card_list.remove(drawed_card);
        return drawed_card;
    }

    
    //ドローした後の合計得点を示すメソッド。
    public int totalValue(){


    }


    
}




/*
 * カードリストのメソッドを、カードをの出し入れを統一する。
 * 新しく、Humanクラスを使い、今までのPlayerクラスからdealerクラスへ継承からの変更。
 * 点数計算方法を考案する。
 * ルールのクラスを作成？？
 */
