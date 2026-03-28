class NthPrimeNumber
{
public static void main(String args[])
{
int n = 7;
int count = 0;
int num = 2;
while(count < n)
{
int temp = 0;
for(int i = 2; i <= num/2; i++)
{
if(num%i==0)
{
temp=1;
break;
}
}
if(temp == 0)
{
count++;
if(count == n)
{
 System.out.println(num);
  }
 }  num++;
        }
    }
}
