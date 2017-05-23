package cn.com.aop.jproxy.dao.impl;

import cn.com.aop.jproxy.dao.ComputerDao;
import cn.com.aop.jproxy.modle.Computer;

public class ComputerService implements ComputerDao {

    private Computer c;

    public ComputerService() {

    }

    public ComputerService(Computer c) {
        this.c = c;
    }

    /**
     * Description
     * 
     * @see cn.com.aop.jproxy.dao.ComputerDao#start()
     */

    @Override
    public void start() {
        c.start();
    }

    /**
     * Description
     * 
     * @see cn.com.aop.jproxy.dao.ComputerDao#stop()
     */

    @Override
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
