//2b.Java program
abstract class shape{
double area;
abstract void call_area();
abstract void display();
}

class triangle extends shape{
int b,h;
triangle(int x,int y)
{
b=x;
h=y;
}
void call_area(){
area=0.5*b*h;
}
void display()
{
System.out.println("Area of triangle:"+area);
}
}
class circle extends shape{
int r;
circle(int x)
{
r=x;
}
void call_area(){
area=3.14*r*r;
}
void display(){
System.out.println("Area of Circle:"+area);
}
}

class hexagon extends shape{
int s;
hexagon(int y)
{
s=y;
}
void call_area()
{
area=2.6*s*s;
}
void display()
{
System.out.println("Area of hexagon:"+area);
}
}

class sphere extends shape{
int r;
sphere(int z)
{
r=z;
}
void call_area()
{
area=4*3.14*r*r;
}
void display()
{
System.out.println("Area of sphere:"+area);
}
}

class demo2{
public static void main(String args[])
{
triangle t=new triangle(5,7);
t.call_area();
t.display();
circle c=new circle(2);
c.call_area();
c.display();
hexagon h=new hexagon(4);
h.call_area();
h.display();
sphere s=new sphere(8);
s.call_area();
s.display();
}
}
