package cn.com.aop.jproxy.modle;

public class Computer {
    private String name;

    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void start() {
        System.out.println(getCountry() + "  " + getName() + "�����" + " ������...");
    }

    public void stop() {
        System.out.println(getCountry() + "  " + getName() + "�����" + " �ػ���...");
    }
}
