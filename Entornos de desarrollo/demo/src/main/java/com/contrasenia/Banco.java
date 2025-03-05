package com.contrasenia;

public class Banco {
   int saldo;

    public Banco() {
        this.saldo = 0;
    }

    public void depositar(int cantidad){
        if(cantidad <=0){
            throw new IllegalArgumentException();
        }
        else{
            saldo += cantidad;
        }
    }

    public void retirar(int cantidad){
        if(cantidad > saldo){
            throw new IllegalArgumentException();
        } else {
            saldo -= cantidad;
        }
    }

    public int getSaldo() {
        return saldo;
    }
}