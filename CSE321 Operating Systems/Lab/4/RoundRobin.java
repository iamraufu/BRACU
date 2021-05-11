import java.util.*;
public class RoundRobin 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of processes:");
        int n=sc.nextInt();
        int p[]=new int[n];
        int burstTime[]=new int[n];
        int waitingTime[]=new int[n];
        int turnaroundTime[]=new int[n];
        int fbt[]=new int[n];
        System.out.println("Enter the quantum time:");
        int qt=sc.nextInt();
        System.out.println("Enter the burst times:");
        int gc=0,i,j,tbt=0;
        for(i=0;i<n;i++)
        {
          p[i]=i+1;
          burstTime[i]=sc.nextInt(); 
          fbt[i]=burstTime[i];
          tbt+=burstTime[i];
        }
        while(tbt>0)
        {
            for (i = 0; i < n; i++) 
            {
                if (burstTime[i] > qt) {
                    burstTime[i] -= qt;tbt-=qt;
                    System.out.println("p"+p[i]+":"+gc+"-"+(gc+qt));gc+=qt;
                    for (j = 0; j < n; j++) {
                        if ((j != i) && (burstTime[j] != 0)) waitingTime[j] += qt;
                    }
                }
                else 
                {
                    if(burstTime[i]>0){
                        System.out.println("p"+p[i]+":"+gc+"-"+(gc+burstTime[i]));gc+=burstTime[i];}
                        for (j = 0; j < n; j++) {
                            if ((j != i) && (burstTime[j] != 0)) waitingTime[j] += burstTime[i];
                        }
                    tbt-=burstTime[i];
                    burstTime[i] = 0;
                }
            }
        }
        turnaroundTime[i] = waitingTime[i] + fbt[i];
        System.out.println("\n\nprocess\t\tBT\tWT\tTAT");
        for (i = 0; i < n; i++) {
            System.out.println("process" + (i + 1) + "\t" + fbt[i] + "\t" + waitingTime[i] + "\t" + turnaroundTime[i]);
        }
    }
}