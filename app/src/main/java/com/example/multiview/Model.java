package com.example.multiview;

public class Model {


    public static final int TEXT_TYPE=0;
    public static final int IMAGE_TYPE=1;
    public static final int DESC_TYPE=2;

    public int type;
    public int data;
    public int text;
    public int price;
    public int desc;

    public Model(int type, int text, int data)
    {
        this.type=type;
        this.data=data;
        this.text=text;
    }
    public Model(int type, int text, int data,int price)
    {
        this.type=type;
        this.data=data;
        this.text=text;
        this.price=price;
    }
    public Model(int type, int text, int data,int price,int desc)
    {
        this.type=type;
        this.data=data;
        this.text=text;
        this.price=price;
        this.desc=desc;
    }

}
