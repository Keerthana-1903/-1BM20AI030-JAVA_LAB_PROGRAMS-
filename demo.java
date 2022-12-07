
class Retail_item{
private String description;
private int units;
private double price;
Retail_item(String desc,int u,double p)
{
description=desc;
units=u;
price=p;
}
String get_description()
{
return description;
}
int get_units()
{
return units;
}
double get_price()
{
return price;
}
}

class demo{
public static void main(String args[])
{

Retail_item r1=new Retail_item("Soap",30,40.00);
Retail_item r2=new Retail_item("Yippe",12,20.00);
Retail_item r3=new Retail_item("Britannia biscuit",15,10.00);

System.out.println("Item details");
System.out.println("Description:"+r1.get_description());
System.out.println("Units:"+r1.get_units());
System.out.println("Price:"+r1.get_price());
System.out.println("");

System.out.println("Item details");
System.out.println("Description:"+r2.get_description());
System.out.println("Units:"+r2.get_units());
System.out.println("Price:"+r2.get_price());
System.out.println("");

System.out.println("Item details");
System.out.println("Description:"+r3.get_description());
System.out.println("Units:"+r3.get_units());
System.out.println("Price:"+r3.get_price());
System.out.println("");
}
}
