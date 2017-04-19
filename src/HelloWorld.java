/**
 * Created by 민규 on 2017-02-12.
 */
import java.util.*;
import static java.lang.System.out;

class SujinMart{
    int price;
    int BonusPoint;

    SujinMart(int price){
        this.price = price;
        BonusPoint = (int)(price/50);
    }
}

class Tv extends SujinMart{
    final int MAX_SOUND=100;
    int channel;
    Tv() {
        super(3790000);
    }

    public String toString(){
        return "화질 실화인 TV";
    }
}

class Audio extends SujinMart{
    final int MAX_SOUND=100;
    int sound;
    Audio() {
        super(370000);
    }

    public String toString(){
        return "개쩌는 오디오";
    }
}

class Buyer{ //구매자 정보
    int money = 18000000; // 소유한 돈
    int mypoint; // 소유한 포인트
    int i = 0; // list의 배열 넘버

    Vector list = new Vector();

    void Buy(SujinMart p){ // 물건 구입하는 메서드
        money -= p.price;
        mypoint += p.BonusPoint;
        list.add(p);
        out.println(p+"를 구매하셨습니다.");
        out.println("현재 잔액:"+money+"\n현재 포인트:"+mypoint);
    }

    void BuyList() { //고객 정보
        out.println("\n내 정보\n구매목록\n----------------");
        for (int a = 0; a < list.size(); a++)
            out.println(list.get(a));
        out.println("\n나의 보유 금액:"+money);
        out.println("나의 포인트:"+mypoint);
    }
}

public class HelloWorld { //메인 메서드
    public static void main(String[] args) {
        Buyer Mango = new Buyer();
        Mango.Buy(new Tv());
        Mango.Buy(new Audio());
        Mango.BuyList();
    }
}