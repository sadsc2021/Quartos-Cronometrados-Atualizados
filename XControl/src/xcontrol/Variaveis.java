/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xcontrol;

import java.util.Timer;

/**
 *
 * @author samue
 */
public class Variaveis {
    public static Variaveis varias = new Variaveis();
    
    //(VALORES PADRÃO) - VALOR POR HORA NO (DINHEIRO/PIX) COM 10 MINUTOS DE TOLERANCIA
    int DPHora1 = 25;
    int DPHora2 = 40;
    int DPHora3 = 50;
    
    //(2 REAIS DE ACRESCIMO DA MAQUININHA) - VALOR DE ACRESCIMO DA MAQUININHA (DÉBITO/CRÉDITO)
    int DCAcrescimoMaquininha = 2;
    
    //(20 REAIS DE ACRESCIMO DE FUMANTES) - VALOR DE ACRESCIMO DE QUEM É (FUMANTES)
    int FAcrescimoFumantes = 20;
        
    //VALOR GLOBAL DO VALOR ACIMA DE 3 HORAS
    int maisHora = 15;
    
    //VARIAVEIS DO VALOR DO QUARTO 4
    int q4;

    public int getQ4() {
        return q4;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }
    
    //VARIAVEIS DO VALOR DO QUARTO 6
    int q6;

    public int getQ6() {
        return q6;
    }

    public void setQ6(int q6) {
        this.q6 = q6;
    }
    
    //VARIAVEIS DO VALOR DO QUARTO 8
    int q8;

    public int getQ8() {
        return q8;
    }

    public void setQ8(int q8) {
        this.q8 = q8;
    }
    
    //VARIAVEIS DO VALOR DO QUARTO 10
    int q10;

    public int getQ10() {
        return q10;
    }

    public void setQ10(int q10) {
        this.q10 = q10;
    }
    
    //VARIAVEIS DO VALOR DO QUARTO 12
    int q12;

    public int getQ12() {
        return q12;
    }

    public void setQ12(int q12) {
        this.q12 = q12;
    }
    
    //VARIAVEIS DO VALOR DO QUARTO 14
    int q14;

    public int getQ14() {
        return q14;
    }

    public void setQ14(int q14) {
        this.q14 = q14;
    }
    
    //VARIAVEL VERIFICA VARIAVEIS
    public Timer variaveistimer;
    public int s = 0;
    
    //VARIAVEL CRONOMETRO 4
    public Timer timer4;
    public int h4 = 0;
    public int m4 = 0;
    public int s4 = 0;
    
    //VARIAVEL CRONOMETRO 6
    public Timer timer6;
    public int h6 = 0;
    public int m6 = 0;
    public int s6 = 0;
    
    //VARIAVEL CRONOMETRO 8
    public Timer timer8;
    public int h8 = 0;
    public int m8 = 0;
    public int s8 = 0;
    
    //VARIAVEL CRONOMETRO 10
    public Timer timer10;
    public int h10 = 0;
    public int m10 = 0;
    public int s10 = 0;
    
    //VARIAVEL CRONOMETRO 12
    public Timer timer12;
    public int h12 = 0;
    public int m12 = 0;
    public int s12 = 0;
    
    //VARIAVEL CRONOMETRO 14
    public Timer timer14;
    public int h14 = 0;
    public int m14 = 0;
    public int s14 = 0;
}
