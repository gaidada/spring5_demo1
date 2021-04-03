package com.spring.bean;

public class Orders {
    private String oname;

    //无参构造
    public Orders() {
        System.out.println("第一步，无参构造");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部，set方法");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步，执行初始化方法");
    }

    //销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，销毁");
    }
}
