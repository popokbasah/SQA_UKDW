/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqa;

/**
 *
 * @author KatonGilang
 */
public class SQA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek dari class dadu
        Dadu d1 = new Dadu(6); 
        //test
        //pengen lempar sebanyak 6 kali
        //for (int i=0;i<6;i++){
            d1.lempar(); //random lemparan
            System.out.println(d1.toString());
        //}
    }
    
}
