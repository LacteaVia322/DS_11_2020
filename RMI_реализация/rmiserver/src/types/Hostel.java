/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

import java.io.Serializable;

/**
 *
 * @author Lactea Via
 */
public class Hostel implements Serializable{
    private String name;
    private int Number;
    private int Price;
    private int kol;

    public Hostel() {
        this.name = "";
        this.kol=0;
        this.Price=0;
        this.Number=0;
    }

    public Hostel(String name,int Number, int kol, int Price) {
        this.name = name;
         this.kol = kol;
        this.Price = Price;
        this.Number=Number;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }
    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
}
