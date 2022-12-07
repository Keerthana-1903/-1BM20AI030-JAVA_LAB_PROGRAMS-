class A{
private int x;
private int y;
protected double a,b;
public int p,q;
A()
{
x=2;
y=6;
a=2.5;
b=4.7;
p=4;
q=1;
}
A(int a1,int a2)
{
a1=x;
a2=y;
}
void display()
{
System.out.println("Inside Class A");
}
void print_data()
{
System.out.println("Private data members value:x="+x+" y="+y);
}
}
class B extends A{
B()
{
super();
}
void display()
{
System.out.println("Inside Class B");
}
void data()
{
System.out.println("Protected data members value:a="+a+" b="+b);
System.out.println("Public data members value:p="+p+" q="+q); 
}
}
class C extends B{
C()
{
super();
}
void display()
{
System.out.println("Inside Class C");
}
}
class D extends B{
D()
{
super();
}
void display()
{
System.out.println(" Inside Class D");
}
}

class test2{
public static void main(String args[])
{
A a=new A(3,7);
System.out.println("class A");
a.display();
a.print_data();
D d=new D();
C c=new C();
System.out.println("class D");
d.print_data();
d.display();
d.data();
System.out.println("Class C");
c.print_data();
c.display();
c.data();
}
}

