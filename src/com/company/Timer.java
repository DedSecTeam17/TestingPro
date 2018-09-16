package com.company;

import org.junit.Test;

public class Timer {

    public  static  void  main(String a[])
    {
        System.out.println(Timer(3));
    }

    public  static  boolean Timer(int stopTime)
    {
        final boolean[] _return = {false};
        Thread thread=new Thread(){

            int time=0;

            @Override
            public void run() {
                super.run();
                time+=1;
                System.out.println("Current Second ------>"+time);
                if (time==stopTime){
                   _return[0] =true;
                   stop();

                }
                try {
                    sleep(1000);
                    run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        return _return[0];
    }

}
