package jp.ac.uryukyu.ie.e225752_e225755_e225758;
import java.util.Random;
import java.util.ArrayList; //スペルミスを修正
//import org.apache.commons.lang3.StringUtils;


public class Human {


    //フィールド記述。
    String name;
    ArrayList<String> hand = new ArrayList<>();//スペルミスを修正
    int score = 0;
    Cardlist clist; //追加（山札用）
    
    public Human(String _name, Cardlist _cardlist){ //コンストラクタ追加
        this.name = _name;
        this.clist = _cardlist;
    }

    

    //メソッドを記述。
    //ランダムを用いてカードリストから選び、手札に追加するメソッド。
    public String draw(){
        Random rd = new Random(); //()を追加
        int randint = rd.nextInt(clist.card_list.size());
        System.out.println(randint);
        //Cardlist card_list = clist.card_list.getCardList(); //クラスメソッドを直接使うのではなく、オブジェクトのメソッドを使う
        String drawed_card = clist.card_list.get(randint); //配列インデックス指定ではなく、getメソッドを使う
        hand.add(drawed_card);
        clist.card_list.remove(drawed_card); //オブジェクトのメソッドを使う
        System.out.println("draw(): " + hand);

        return drawed_card;
    }

    
    //ドローした後の合計得点を示すメソッド。
    public int totalValue(){
        int totalvalue = 0;
        for(int i = 0; i < clist.card_list.size(); i++){
            String card = clist.card_list.get(i);
            System.out.println("totalValue():" + card);
            //char cardvalue = card.charAt(2); //charAt()の戻り値はchar
            //String cardvalue = card[1];
            
            /*
            if(boolean isNumeric = StringUtils.isNumeric(cardvalue)){
                totalvalue += cardvalue;
            }
            if(cardvalue == "J" || cardvalue == "Q" || cardvalue =="K"){
                totalvalue += 10;
            }
            if(cardvalue == "A"){
                if(totalvalue <= 21){
                    totalvalue += 11;
                }else{
                    totalvalue += 1;
                }
            }
            */
            
        }
        return totalvalue;
    }
    
}




/*
 * カードリストのメソッドを、カードをの出し入れを統一する。
 * 新しく、Humanクラスを使い、今までのPlayerクラスからdealerクラスへ継承からの変更。
 * 点数計算方法を考案する。
 * ルールのクラスを作成？？
 */
