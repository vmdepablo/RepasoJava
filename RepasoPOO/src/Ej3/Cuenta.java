/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej3;

/**
 *
 * @author Victor Manuel
 */
public class Cuenta {

    private int saldo;
    private int id;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    
    
}
