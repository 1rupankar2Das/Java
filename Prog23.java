//java Program to illustrate the use of Rectangular class which
//has length and width data members
class Rectangle{
    int length;
    int width;
    void insert(int I,int w){
        length=I;
        width=w;
    }
    int calculateArea()
    {
        return(length*width);
    }
    void display()
    {
        System.out.println("Area of Rect="+calculateArea());
    }
}
class Prog23{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();//creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.display();
        r2.display();
    }
}