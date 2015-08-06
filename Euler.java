public class Euler
{
  public static int problem1()
  {
    int[] multiples = new int[1000/3 + 1000/5];
    int pointer = 0;
    int sum = 0;
    
    for (int i=3;i<1000;i+=3)
      multiples[pointer++] = i;
    
    for (int i=5;i<1000;i+=5)
    {
      if (i % 3 != 0)
        multiples[pointer++] = i;
    }
    
    for (int i=0;i<multiples.length;i++)
      sum += multiples[i];
    
    return sum;
  }
  
  public static int problem2()
  {
    int total = 0;
    int current = 1;
    int previous = 1;
    int temp = 0;
    
    while (current<4000000)
    {
      if (current%2==0)
      {
        total += current;
      }
      temp = current;
      current = current + previous;
      previous = temp;
    }
    
    return total;
  }
}