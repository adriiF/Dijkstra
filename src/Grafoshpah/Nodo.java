package Grafoshpah;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrii
 */

public class Nodo implements Comparable<Nodo> {
    String id;

    //@Override
    //public String toString() {
     //   return "Nodo{" + "id=" + id + ", distancia=" + distancia + ", procedencia=" + procedencia + '}';
   // }
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    Nodo(String x, int d, Nodo p) { id=x; distancia=d; procedencia=p; }
    Nodo(String x) { this(x, 0, null); }
    @Override
    public int compareTo(Nodo tmp) { return this.distancia-tmp.distancia; }
    @Override
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        return tmp.id == null ? this.id == null : tmp.id.equals(this.id);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }
}