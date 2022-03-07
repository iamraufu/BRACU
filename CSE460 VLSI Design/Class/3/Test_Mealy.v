module Test_Mealy (clk, Resetn, w, z);

input clk, Resetn, w;
output reg z;
reg y, Y;
parameter A = 0, B = 1; 

always @(w, y)
  case (y)
      A: if (w) 
      begin
      z=0;
      Y = B;
      end
      else
      begin
      z = 0;
      Y = A;
      end
      B: if (w) 
      begin
      z=1;
      Y = B;
      end
      else
      begin
      z = 0;
      Y = A;
      end
  endcase
  
always @(negedge Resetn, posedge clk)  
       if (Resetn == 0) y <= A;
       else y<=Y;

endmodule