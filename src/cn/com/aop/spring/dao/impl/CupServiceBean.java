package cn.com.aop.spring.dao.impl;

public class CupServiceBean implements CupDao {

    @Override
    public void drink() {
        // throw new RuntimeException("Œ““Ï≥£¡À...");
        System.out.println("drink....");

    }

    @Override
    public String getName() {
        return "≤Ë±≠";
    }
    @Override
    public void doPlay(String name,int weight) {
        System.out.println("doplay..." + "");
    }

}
