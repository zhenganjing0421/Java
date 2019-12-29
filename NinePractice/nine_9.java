package NinePractice;
public class nine_9
{
    private  int n =3;
    private  double side = 1; 
    private  double x = 0;
    private  double y = 0;
    nine_9(){}
    nine_9(int n,double side)
    {
    this.n = n;
    this.side =side;
    }
    nine_9(int n,double side,double x,double y) 
    {
     this.n = n;
     this.side = side;
     this.x = x;
     this.y = y;
    }
    public int getN(int n)
    {
     return n;
    }
    public void setN(int n)
    {
     this.n = n;
    }
    public double getSide(double side)
    {
     return side;
    }
    public void setSide(double side)
    {
     this.side = side;
    }
    public double getX(double x)
    {
     return x;
    }
    public void setX(double x)
    {
     this.x = x;
    }
    public double getY(double y)
    {
     return y;
    }
    public void setY(double y)
    {
     this.y = y;
    }
    public double getPerimeter()
    {
        System.out.println("正多边形的周长是"+n*side);
        return n*side;
    }
    public double getArea()
    {
        
        System.out.println("正多边形的面积是"+(n*side*side)/(4*Math.atan(180/n)));
         return (n*side*side)/(4*Math.atan(180/n));
    }
}