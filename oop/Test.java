
package test;

interface Mobile {
    void priceup(double a);
    void pricedown(double b);
    void changeversion(double c);
}
class iphone implements Mobile{
    double price;
    double version;
    public iphone(double p,double v){
        price=p;
        version=v;
    }
  
    public void priceup(double a){
        price+=a;
    }

    public void pricedown(double b){
        price-=b;
    }
   
    public void changeversion(double c){
        version+=c;
    }
    void print(){
        System.out.println("The price up to:"+price);
        System.out.println("The change version to:"+version);
    }
}
class samsung implements Mobile{
     double price;
    double version;
    public samsung(double p,double v){
        price=p;
        version=v;
    }
 
    public void priceup(double a){
        price+=a;
    }
  
    public void pricedown(double b){
        price-=b;
    }
 
    public void changeversion(double c){
        version+=c;
    }
    void print(){
        System.out.println("The price down to:"+price);
        System.out.println("The change version to:"+version);
    }
}

public class Test {

    
    public static void main(String[] args) {
       iphone x=new iphone(300,8);
       x.priceup(100);
       x.changeversion(2.3);
       x.print();
       samsung y=new samsung(300,6);
       y.pricedown(100);
       y.changeversion(1.4);
       y.print();
    }
    
}
