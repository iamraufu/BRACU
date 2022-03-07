module labtask( A,B,C,Y);

input A;
input B;
input C;
 
output Y;
 
assign Y = ((~A&~B&C)|(~A&B&~C)|(A&~B&~C));
 
endmodule
