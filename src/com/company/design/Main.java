package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public  static void main(String[] args) {
        /* single pattern
        Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();

        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals((bClient)));
        */
        /* adapter pattern
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
         */
        /* proxy pattern
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();


        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();


        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()-> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()-> {
                    Long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
           );
        aopBrowser.show();
        System.out.println("loading time :" +end.get());
        aopBrowser.show();
        System.out.println("loading time :" +end.get());

         */
        /* decorator
        ICar audi = new Audi( 1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        // a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        // a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();
        */
        /*observer pattern
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click(("메시지 전달 : click 1"));
        button.click(("메시지 전달 : click 2"));
        button.click(("메시지 전달 : click 3"));
        button.click(("메시지 전달 : click 4"));
        */

    }
    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
