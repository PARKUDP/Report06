package jp.ac.uryukyu.ie.e225752_e225755_e225758;
import java.util.Arrays;
import jp.ac.uryukyu.ie.e225752_e225755_e225758.*;

import org.junit.jupiter.api.Test;

class CardlistTest {
    @Test
    void cardlistTest(){
        Cardlist clist = new Cardlist();
        clist.Card_remove("Black Jocker");
        clist.Card_remove("Color Joker");
    }
}