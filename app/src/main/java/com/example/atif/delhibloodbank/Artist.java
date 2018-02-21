package com.example.atif.delhibloodbank;

/**
 * Created by ATIF on 19-11-2017.
 */

public class Artist {

    String ide;
    String type;
    String name;
    String w;
    String e;
    //String r;
    //String t;

    public Artist()
    {

    }

    public Artist(String ide, String name, String w, String e, String type) {
        this.ide = ide;
        this.name = name;
        this.w = w;
        this.e = e;
        this.type=type;

         }

    public String getIde() {
        return ide;
    }

    public String getQ() {
        return name;
    }

    public String getW() {
        return w;
    }

    public String getE() {
        return e;
    }

    }
