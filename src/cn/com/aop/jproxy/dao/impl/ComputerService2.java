package cn.com.aop.jproxy.dao.impl;

import cn.com.aop.jproxy.modle.Computer;

public class ComputerService2 {

    private Computer c;

    public ComputerService2() {

    }

    public ComputerService2(Computer c) {
        this.c = c;
    }

    public void start() {
        c.start();
    }

    public void stop() {
        c.stop();
    }

    public Computer getC() {
        return c;
    }

    public void setC(Computer c) {
        this.c = c;
    }

}
