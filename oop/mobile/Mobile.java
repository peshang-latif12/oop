
package mobile;

public class Mobile {
String name;
MobileIMEI mbIMEI;

Mobile(String name,MobileIMEI mbIMEI){
    this.name=name;
    this.mbIMEI=mbIMEI;
}
      public long getIMEI(){
          return mbIMEI.IMEI;
      }
    
    public static void main(String[] args) {
        MobileIMEI x=new MobileIMEI(3627275181626561L);
       Mobile a=new Mobile("iphone 8 plus",x);
        System.out.println(a.name+"\t"+"IMEI="+a.getIMEI());
    }
    
}
