public class Average_In { 
    double num1;
    double num2;
    double num3;
    double avg;

    public void averageCalculator()
    {
        avg=(num1+num2+num3)/3;
        System.out.println("Average="+avg);
    }
    public static void main(String args[])
    {
        Average_In obj= new Average_In();
        obj.num1=55;
        obj.num2=89;
        obj.num3=98;
        obj.averageCalculator();
    }
   
}