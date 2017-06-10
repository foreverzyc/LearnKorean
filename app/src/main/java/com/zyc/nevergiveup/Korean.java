package com.zyc.nevergiveup;

/**
 * Created by zyc on 2017/6/7.
 */

public class Korean {
    private String name;

    private int imageId;
    public Korean(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
