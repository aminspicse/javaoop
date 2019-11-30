/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author AL AMIN
 */
class constoverload {
    int a;
    int b;
    constoverload(){
        this.a=20;
        this.b=30;
    }
    constoverload(int a, int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args){
        constoverload obj1 = new constoverload();
        System.out.println(obj1.a);
        
        constoverload obj2 = new constoverload(70,90);
        System.out.println(obj2.a);
    }
}
