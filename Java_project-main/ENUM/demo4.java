enum fruit
{
  apple(100,5), orange(60,6), watermelon(25,7);
  private double Price;
  private int Sweetness;
  fruit(double P,int S)
  {
    this.Price = P;
    this.Sweetness = S;
  }
  final double getPrice()
  {
    return(this.Price);
  }
  final int getSweetness()
  {
    return(this.Sweetness);
  }
  
}
class demo4{
  public static void main(String[] args)
  {
    System.out.println("Fruits are\n");
    for(fruit i: fruit.values())
    {
      System.out.println("Fruit name "+i);
      System.out.println("Fruit price per kg "+i.getPrice());
      System.out.println("Fruit sweetness level "+i.getSweetness());
      System.out.println("Fruit index is " +i.ordinal());
    } 
      fruit fs = fruit.apple;
      switch(fs)
      {
        case apple: System.out.println("I ordered apple ");
                    break;
        case orange: System.out.println("I ordered orange ");
                     break;
        case watermelon: System.out.println("I ordered watermelon ");
                         break;
        default: System.out.println("Error");
      } 
  }
}