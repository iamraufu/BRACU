module Test_Moore (clk, Resetn, w, z);

input clk, Resetn, w;
output z;
reg [2:1] y, Y;
parameter [2:1] A = 2'b00, B = 2'b01, C = 2'b10; 

always @(w, y)
  case (y)
      A: if (w) Y = B;
         else Y = A;
      B: if (w) Y = C;
         else Y = A;
      C: if (w) Y = C;
         else Y = A;
      default: Y = 2'bxx;
  endcase
  
always @(negedge Resetn, posedge clk)  
       if (Resetn == 0) y <= A;
       else y<=Y;
       
assign z = (y == C);

endmodule
