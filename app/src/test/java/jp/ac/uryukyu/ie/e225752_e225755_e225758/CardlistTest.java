package jp.ac.uryukyu.ie.e225752_e225755_e225758;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CardlistTest {
    @Test void CardlistTest(){
        Cardlist card_list = new Cardlist();
        card_list.Make_Cardlist();
        System.out.println(card_list.toString());
    }
}