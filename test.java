class car{
int model;
String make;
int speed;
car(int m,String mk,int s)
{
model=m;
make=mk;
speed=s;
}
void display()
{
System.out.println("Car details:");
System.out.println("Car model:"+model);
System.out.println("Car make:"+make);
System.out.println("Car speed:"+speed);
}
int accelerate()
{
speed=speed+5;
return speed;
}
int brake()
{
speed=speed-5;
return speed;
}
}

class test{
public static void main(String args[]){
car c=new car(2020,"Audi R8",330);
c.display();
System.out.println("New speed after acceleration:"+c.accelerate());
System.out.println("New speed after acceleration:"+c.accelerate());
System.out.println("New speed after acceleration:"+c.accelerate());
System.out.println("New speed after acceleration:"+c.accelerate());
System.out.println("New speed after acceleration:"+c.accelerate());
System.out.println("");

System.out.println("New speed after acceleration:"+c.brake());
System.out.println("New speed after acceleration:"+c.brake());
System.out.println("New speed after acceleration:"+c.brake());
System.out.println("New speed after acceleration:"+c.brake());
System.out.println("New speed after acceleration:"+c.brake());
}
}