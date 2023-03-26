public class SimpleInterest {
    float p;
    float r;
    int t;
    double SI;
    public void calculate_SI()
    {
      
        SI = (p*r*t)/100;
        System.out.println("Simple Intrest\n" +SI);
        
    }
    public static void main(String args [])
    {
        SimpleInterest obj = new SimpleInterest();
        obj.p=1000;
        obj.r=5;
        obj.t=2;
         obj.calculate_SI();
         
    }
    
}