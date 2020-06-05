package com.example.bxc_logowanie;

import android.content.Intent;

public class item {

    int backgound;
    String nazwaGry;

    public int getBackgound() {
        return backgound;
    }

    public String getNazwaGry() {
        return nazwaGry;
    }

    public item(){

    }

    public item(int backgound, String nazwaGry){
        this.backgound = backgound;
        this.nazwaGry = nazwaGry;
    }

    public void setBackgound(int backgound) {
        this.backgound = backgound;
    }

    public void setNazwaGry(String nazwaGry) {
        this.nazwaGry = nazwaGry;
    }
}
