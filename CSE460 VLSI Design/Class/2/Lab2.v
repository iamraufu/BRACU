module Lab2 (d, q, load, clock);
input load, clock;
input [3:0] d;
output reg [3:0] q;
always @ (posedge clock)
begin
     if (load)
         q = d;
     else
     begin
          q[0] <= q[3];
          q[3] <= q[2];
          q[2] <= q[1];
          q[1] <= q[0];
     end
end
endmodule
