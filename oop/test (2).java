
package mobile;


interface Mobile {
void upprice(double a);
void downprice(double b);
void changeversion(double c);
}
class iphone implements Mobile {
    double price;
    double version;
    
    public iphone(double p,double v){
        price=p;
        version=v;
        
}

public void upprice(double a){
    price+=a;
}

public void downprice(double b){
    price-=b;
}

public void changeversion(double c){
    version+=c;
}
void print(){
    System.out.println("your up price is:"+price+"$");
    System.out.println("your change version is:"+version);
}
}
class samsung implements Mobile{
      double price;
    double version;
    
    public samsung(double p,double v){
        price=p;
        version=v;
    }
    public void upprice(double a){
    price+=a;
}
    
public void downprice(double b){
    price-=b;
}
public void changeversion(double c){
    version+=c;
}
void print(){
    System.out.println("your down price is:"+price+"$");
    System.out.println("your change version is:"+version);
}}
public class test{
    public static void main(String[] args) {
        iphone x=new iphone(300,8);
        x.upprice(100);
        x.changeversion(2.4);
        x.print();
        samsung y=new samsung(300,6);
        y.downprice(100);
        y.changeversion(3.2);
        y.print();
        
    }
    
}
