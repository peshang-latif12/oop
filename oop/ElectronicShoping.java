package electronic.shoping;


public class ElectronicShoping {
 private String Marka;
 private String jor;
 private double nrx;
 
 public void setMarka(String newMarka){
     Marka=newMarka;
 }
   public void setjor(String newjor){
       jor=newjor;
   }
    public void setnrx(double newnrx){
        nrx=newnrx;
    }
    public String getMarka(){
        return Marka;
    }
    public String getjor(){
        return jor;
    }
    public double getnrx(){
        return nrx;
    }
    public static void main(String[] args) {
        ElectronicShoping a=new ElectronicShoping();
        a.setMarka("DELL");
        a.setjor("Latitude");
        a.setnrx(350);
        System.out.println("Labtop");
        System.out.println("Marka:"+a.getMarka()+"  jor:"+a.getjor()+"  nrx:"+a.getnrx()+"$");
        a.setMarka("Apple");
        a.setjor("Iphone 8");
        a.setnrx(500);
        System.out.println("Mobile Phone");
        System.out.println("Marka:"+a.getMarka()+"  jor:"+a.getjor()+"  nrx:"+a.getnrx()+"$");
        a.setMarka("Nikon");
        a.setjor("D7000");
        a.setnrx(800);
        System.out.println("Camera");
        System.out.println("Marka:"+a.getMarka()+"  jor:"+a.getjor()+"  nrx:"+a.getnrx()+"$");
    }
    
}


  
    



