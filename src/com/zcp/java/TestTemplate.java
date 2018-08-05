package com.zcp.java;

import java.util.ArrayList;

/**
 *
 * @create Administrator 2018-08-05 21:16
 */


public class TestTemplate {

    private static final String str ="test";


    //模板一：psvm
    public static void main(String[] args) {
        //模板二:sout
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TestTemplate.main");

        String strs[] = {"test1","test2","test3"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        for (String str : strs) {
            System.out.println(str);
        }

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }

        ArrayList<String> arryList = new ArrayList<>();

        arryList.add("123");
        arryList.add("345");
        arryList.add("678");
        for (String str : arryList) {
            System.out.println(str);
        }
    }

    public void mathod1(){

        ArrayList<String> arryList = new ArrayList<>();

        arryList.add("123");
        arryList.add("345");
        arryList.add("678");

        if (arryList == null) {
            System.out.println("this is null");
        }

        if (arryList != null) {

        }


    }


}
