/*
Eftykhar Rahman
*/

module task1(x,y,z,o);
input x,y,z;
output o;

assign o = ((~x&~y&z)|(~x&y&~z)|(x&~y&~z));

endmodule
