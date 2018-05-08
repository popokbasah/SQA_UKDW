/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqa;

/**
 *
 * @author yoelt
 */
import java.awt.Color;
import java.util.Random;

public final class Dadu {
    public static final int DEFAULT_SISI = 6;
    private static Random randGenerator = new Random();
    private final int jumSisi;
    private int hasil;
    private int temp=0;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.WHITE, Color.BLACK, Color.PINK, Color.ORANGE};
    
    public Dadu() {
        this(DEFAULT_SISI);
    }
    
    public Dadu(int numSides) {
        this.jumSisi = numSides;
    }
    
    public int lempar() {
        hasil = randGenerator.nextInt(jumSisi) + 1;
        while (temp==hasil) {
            hasil = randGenerator.nextInt(jumSisi) + 1;
        }
        temp = hasil;
	return hasil;
    }
    
    public int getJumSisi() {
        return jumSisi;
    }
    
    public int getHasil() {
        return hasil;
    }
    
    public Color getWarnaSisi() {
        //warna random tiap kali lempar
        return colors[randGenerator.nextInt(jumSisi)];
        
        /*warna tergantung hasil dari lempar dadu, mengikuti index array
        return colors[hasil];*/
    }
    
    @Override
    public String toString() {
    	return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil() + " warna: " + getWarnaSisi();
    }
}
