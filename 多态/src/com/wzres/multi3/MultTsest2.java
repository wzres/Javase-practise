package com.wzres.multi3;

import java.util.Date;

/**
 * @ClassName：MultTsest2
 * @description：
 * @date：2023-04-10 04:24
 */
public class MultTsest2 {
    public static void main(String[] args) {
        //向上转型
        ServerFactory s1 = new AServer();
        ServerFactory s2 = new BServer();
        s1.start();
        s2.start();

        //向下转型
        //重点：访问子类特有的方法时，需要向下转型，否则会报类型转换异常
        ServerFactory s3 = new BServer();
        if(s3 instanceof AServer){
            AServer aServer = (AServer) s3;
            aServer.setNowtime(new Date());
            aServer.aStartNowTime();
        }else if(s3 instanceof BServer){
            BServer bServer = (BServer) s3;
            bServer.setNowtime(new Date());
            bServer.bStartNowTime();
        }

    }
}

class ServerFactory{
    public void start(){
        System.out.println("服务器正在启动中...");
    }
}

class AServer extends ServerFactory{
    private Date nowtime;

    @Override
    public void start() {
        System.out.println("A号服务器正在启动中...");
    }

    public void aStartNowTime(){
        System.out.println("A号服务器启动时间："+nowtime);
    }

    public Date getNowtime() {
        return nowtime;
    }

    public void setNowtime(Date nowtime) {
        this.nowtime = nowtime;
    }
}

class BServer extends ServerFactory{
    private Date nowtime;

    @Override
    public void start() {
        System.out.println("B号服务器正在启动中...");
    }

    public void bStartNowTime(){
        System.out.println("B号服务器启动时间："+nowtime);
    }

    public Date getNowtime() {
        return nowtime;
    }

    public void setNowtime(Date nowtime) {
        this.nowtime = nowtime;
    }
}