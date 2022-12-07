//1a. Design and create a class named Retail Item that holds data about an item in a retail store. 
//The class should have the following fields:
//• Description - The description field references a String object that holds a brief description of the item.
//• Units - The units field is an int variable that holds the number of units currently in inventory.
//• Price - The price field is a double that holds the item’s retail price.
//Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. 
//Write the main method which creates three Retail Item objects and invokes appropriate methods

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
