import java.util.Scanner;

public class SJF_Scheduling {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Number Of Processes");
            int n = sc.nextInt();

            int process[] = new int[n];
            int arrivalTime[] = new int[n];
            int burstTime[] = new int[n];
            int completeTime[] = new int[n];
            int turnAroundTime[] = new int[n];
            int waitingTime[] = new int[n];
            int fg[] = new int[n];
            int st = 0, totalTime = 0;
            float averageWaitingTime = 0, averageTurnaroundTime = 0;

            for (int i = 0; i < n; i++) {
                  System.out.println("Enter P" + (i + 1) + " Arrival Time");
                  arrivalTime[i] = sc.nextInt();
                  System.out.println("Enter P" + (i + 1) + " Burst Time");
                  burstTime[i] = sc.nextInt();
                  process[i] = i + 1;
                  fg[i] = 0;
            }
            while (true) {
                  int c = n;
                  int min = 999;
                  if (totalTime == n) {
                        break;
                  }
                  for (int i = 0; i < n; i++) {
                        if ((arrivalTime[i] <= st) && (fg[i] == 0) && (burstTime[i] < min)) {
                              min = burstTime[i];
                              c = i;
                        }
                  }
                  if (c == n)
                        st++;
                  else {
                        completeTime[c] = st + burstTime[c];
                        st = st + burstTime[c];
                        turnAroundTime[c] = completeTime[c] - arrivalTime[c];
                        waitingTime[c] = turnAroundTime[c] - burstTime[c];
                        fg[c] = 1;
                        totalTime++;
                  }
            }

            System.out.println("\nProcess \tArrival \tBurst  \t\tComplete \tTurnaround \tWaiting");
            for (int i = 0; i < n; i++) {
                  averageWaitingTime = averageWaitingTime + waitingTime[i];
                  averageTurnaroundTime = averageTurnaroundTime + turnAroundTime[i];
                  System.out.println(process[i] + "\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t"
                              + completeTime[i] + "\t\t" + turnAroundTime[i] + "\t\t" + waitingTime[i]);
            }
            System.out.println("\nAverage Waiting time : " + (averageWaitingTime / n));
            System.out.println("Average Turnaround time : " + (averageTurnaroundTime / n));
      }
}