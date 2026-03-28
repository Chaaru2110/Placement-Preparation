class SkipMultiples{
public static void main(String[]args)
{
int i=1;
   while(i<=20)
  {
     if(i%3==0||i%5==0)
    {
	i++;
	continue;
    }
	System.out.println(i);
	i++;
   }
  }
 }
