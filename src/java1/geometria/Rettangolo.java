package java1.geometria;

public class Rettangolo implements Forma {
    private double b,h;
    
    public Rettangolo(){}
    
    public Rettangolo(double b, double h){
        this.b = b;
        this.h = h;
    }
    
    public void setB(double b, double h){
         this.b = b;
    }
    
    public void setH(double h){
         this.h = h;
    }
    
    @Override
    public double area () {
        return b*h;
    }
    
/*
    //Creo una funzione VUOTA (void) a cui dico di SETTARE B
    public void setC(double base, double altezza){
         b=base;
         h=altezza;
    }
    
    
    //Creo una funzione di RITORNO a cui dico di PRENDERE B ed H
    public double getB(){
        return b;
    }
    
    public double getH(){
        return h;
    }
   */ 
}

