/* 
 * @Author: Jonathan Monreal
 * My practice problems from Project Euler in Java.
 */

public class Euler
{
  public static int problem1()
  {
    int[] multiples = new int[1000/3 + 1000/5];
    int pointer = 0;
    int sum = 0;
    
    for (int i=3; i<1000; i+=3)
      multiples[pointer++] = i;
    
    for (int i = 5; i < 1000; i+=5)
    {
      if (i % 3 != 0)
        multiples[pointer++] = i;
    }
    
    for (int i = 0; i < multiples.length; i++)
      sum += multiples[i];
    
    return sum;
  }
  
  public static int problem2()
  {
    int total = 0;
    int current = 1;
    int previous = 1;
    int temp = 0;
    
    while (current < 4000000)
    {
      if (current % 2 == 0)
      {
        total += current;
      }
      temp = current;
      current = current + previous;
      previous = temp;
    }
    
    return total;
  }
  
  public static int problem4()
  {
    int largest = -1;
    
    for (int i = 100; i < 1000; i++)
    {
      for (int j = 100; j < 1000; j++)
      {
        if (i * j > largest && i * j == reverse(i * j))
          largest = i * j;
      }
    }
    
    return largest;
  }
  
  public static int problem5()
  {
    int n = 20;
    boolean notFound = true;
    
    while (notFound)
    {
      n += 20;
      notFound = false;
      for (int i = 1; i < 21; i++)
      {
        if ((double)n / i % 1 != 0)
        {
          notFound = true;
          break;
        }
      }
    }
    
    return n;
  }
  
  /* Helper methods: */
  
  public static int reverse(int n)
  {
    int reversed = 0;
    
    while (n > 0)
    {
      reversed = (reversed * 10) + (n % 10);
      n /= 10;
    }
    
    return reversed;
  }
}