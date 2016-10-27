package java1;

import java1.geometria.Cerchio;
import java1.geometria.CerchioIntf;
import java1.geometria.Forma;
import java1.geometria.Rettangolo;

public class Java1 {
    
    public static void main(String[] args) {
        
        Forma cerchio1 = new Cerchio ( 2 );
        Forma cerchio2 = new Cerchio ( 4 );
        
        Forma cerchis [] = new Forma[] {cerchio1, cerchio2};
        for(int i=0;i<cerchis.length;i++){
            System.out.println("Area cerchis"+(i+1)+" = "+ cerchis[i].area());
        }
        
        int i=0;
        while (i<cerchis.length){
            System.out.println("Area cerchis"+(i+1)+" = "+ cerchis[i].area());
            i++;
        }
        
        i=0;
        do {
            if(i<cerchis.length){ //in questo caso funziona anche senza if
                System.out.println("Area cerchis"+(i+1)+" = "+ cerchis[i].area());
                i++;
            }
        } while (i<cerchis.length);
        
        Cerchio cerchii[] = new Cerchio [5];
        
        for (i=0; i< cerchii.length; i++){
            cerchii[i]=new Cerchio(Math.random() * 10);
        }
        for (i=0; i< cerchii.length; i++){
            
            String nano = "";
            
            switch ( i ) {
                case 0 : nano = "Eolo"; break;
                case 1 : nano = "Pisolo"; break;
                case 2 : nano = "Dotto"; break;
                case 3 : nano = "Brontolo"; break;
                case 4 : nano = "Cucciolo"; break;
                default : nano = "Mignolo"; break;
            }
            
            System.out.println ("Il nano è " + nano);
            
            if(cerchii[i].area() < 78d) {
                String s = String.format("Il cerchio %d è piccolo, la sua area è %f, il suo raggio è %f", i+1, cerchii[i].area(), cerchii[i].getR());
                System.out.println(s);
            } else {
                String s = String.format("Il cerchio %d è grande, la sua area è %f, il suo raggio è %f", i+1, cerchii[i].area(), cerchii[i].getR());
                System.out.println(s);
            }
        }
        
        Forma rett = new Rettangolo ( 3 , 6 );
        
        System.out.println("Area cerchio1 = "+ cerchio1.area());
        System.out.println("Area cerchio2 = "+ cerchio2.area());
        System.out.println("Area rett = "+ rett.area());
        
/*
static int m1(int a, int b){
        int c = a*a + b*b;
        return c;
*/
    }
}
