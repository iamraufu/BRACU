import java.util.Scanner;

public class Priority_Scheduling {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter No of Processes");
            int n = sc.nextInt();

            int process[] = new int[n];
            int arrivalTime[] = new int[n];
            int burstTime[] = new int[n];
            int burstTimeSolid[] = new int[n];
            int priority[] = new int[n];
            int completeTime[] = new int[n];
            int turnAroundTime[] = new int[n];
            int waitingTime[] = new int[n];
            int fg[] = new int[n];
            int st = 0, tot = 0;
            float averageWaitingTime = 0, averageTurnaroundTime = 0;

            for (int i = 0; i < n; i++) {
                  System.out.println("Enter P"+(i+1)+" arrival time");
                  arrivalTime[i] = sc.nextInt();
                  System.out.println("Enter P" + (i + 1) + " burst time");
                  burstTime[i] = sc.nextInt();
                  burstTimeSolid[i] = burstTime[i];
                  System.out.println("Enter P" + (i + 1) + " priority");
                  priority[i] = sc.nextInt();
                  process[i] = i + 1;
                  fg[i] = 0;
                  tot = tot + burstTime[i];
            }

            int min = 999, c = 0;
            while (st < tot) {
                  for (int i = 0; i < n; i++) {
                        if (arrivalTime[i] == st) {
                              fg[i] = 1;
                              if (priority[i] < min) {
                                    min = priority[i];
                                    c = i;
                              }
                        }
                  }

                  st++;
                  burstTime[c]--;
                  min = burstTime[c];

                  if (burstTime[c] == 0) {
                        fg[c] = 2;
                        completeTime[c] = st;
                        turnAroundTime[c] = completeTime[c] - arrivalTime[c];
                        waitingTime[c] = turnAroundTime[c] - burstTimeSolid[c];
                        min = 999;
                  }

                  for (int j = 0; j < n; j++) {
                        if (priority[j] < min && fg[j] == 1) {
                              min = priority[j];
                              c = j;
                        }
                  }

            }
            for (int i = 0; i < n; i++) {
                  averageWaitingTime = averageWaitingTime + waitingTime[i];
                  averageTurnaroundTime = averageTurnaroundTime + turnAroundTime[i];
                  System.out.println("\nProcess" + process[i] + "--> Arrival Time=" + arrivalTime[i] + " Burst Time="
                              + burstTimeSolid[i] + " priority=" + priority[i] + " Completion Time=" + completeTime[i]
                              + " Turnaround Time=" + turnAroundTime[i] + " Waiting Time=" + waitingTime[i]);
            }
            System.out.println("\nAverage Waiting time : " + (averageWaitingTime / n));
            System.out.println("Average Turnaround time : " + (averageTurnaroundTime / n));
      }
}