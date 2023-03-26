class Arearectangle_I {
int length;
int breadth;
double area;
public void calculate_area()
{
    area = length*breath;
    System.out.println("Area of Reactangle\n" +area);
}

    public static void main(String args[])
    {
        Arearectangle_I obj = new Arearectangle_I();
        obj.length=9;
        obj.breadth=6;
        obj.calculate_area();
    }
}