package cn.com.aop.spring.dao.impl;

public class CupServiceBean implements CupDao {

    @Override
    public void drink() {
        // throw new RuntimeException("���쳣��...");
        System.out.println("drink....");

    }

    @Override
    public String getName() {
        return "�豭";
    }
    @Override
    public void doPlay(String name,int weight) {
        System.out.println("doplay..." + "");
    }

}
