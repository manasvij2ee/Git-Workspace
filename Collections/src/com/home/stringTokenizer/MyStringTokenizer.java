package com.home.stringTokenizer;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String a[]){
        String msg = "hi**He llo*/*h";
        StringTokenizer st = new StringTokenizer(msg,"* /");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}