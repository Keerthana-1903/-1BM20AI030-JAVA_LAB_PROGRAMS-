enum fruits
{
  apple, orange, watermelon
}
class demo3{
  public static void main(String[] args)
  {
    fruits f = fruits.orange;
    System.out.println(f);
    f = fruits.apple;
    System.out.println(f);
    System.out.println("Fruits are\n");
    for(fruits i: fruits.values())
      System.out.println(i);
    f = fruits.valueOf("apple");
     System.out.println(f);
  }
}