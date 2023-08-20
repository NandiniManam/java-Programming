import java.util.*;
class NumberTypes
{   
    public static void main(String args[])
{
    int pcount=0;
    int ncount=0;
    int zcount=0;
    //n=n/10;
    Scanner sc=new Scanner(System.in);
    int nol=1;
    while(nol<=5)
    {
    int n=sc.nextInt();
    if(n>0)
    {
        pcount=pcount+1; 
       //System.out.println("count of +ve numbers"+pcount);
       nol++;
    }
    else if(n<0)
    {
       ncount=ncount+1; 
      //System.out.println("count of -ve numbers"+ncount);
      nol++;
    }
    else{
        zcount=zcount+1; 
       //k
       //l;
       // System.out.println("count of zero numbers"+zcount);
        n++;
    }
    }
 System.out.println("count of +ve numbers"+pcount);
 System.out.println("count of -ve numbers"+ncount);
 System.out.println("count of zero numbers"+zcount);
 sc.close();
}
}

   