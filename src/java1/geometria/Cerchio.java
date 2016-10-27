package java1.geometria;

public class Cerchio implements CerchioIntf, Forma
{
    private double r;
    
    public Cerchio(){
        this.r = 1.0;
    }
    public Cerchio(double raggio){
        this.r = raggio;
    }
    
    @Override
    public double getR(){
        return this.r; 
    }
    
    @Override
    public void setR(double raggio){
         this.r = raggio;
    }
         
    @Override
    public double area () {
        return Math.PI * (this.r) * (this.r);
    } 
}
