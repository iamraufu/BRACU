*version 9.1 99169801
u 35
R? 4
V? 2
@libraries
@analysis
@targets
@attributes
@translators
a 0 u 13 0 0 0 hln 100 PCBOARDS=PCB
a 0 u 13 0 0 0 hln 100 PSPICE=PSPICE
a 0 u 13 0 0 0 hln 100 XILINX=XILINX
@setup
unconnectedPins 0
connectViaLabel 0
connectViaLocalLabels 0
NoStim4ExtIFPortsWarnings 1
AutoGenStim4ExtIFPorts 1
@index
pageloc 1 0 1975 
@status
n 0 120:11:21:15:01:50;1608541310 e 
s 2832 120:11:21:15:01:50;1608541310 e 
*page 1 0 970 720 iA
@ports
port 6 GND_ANALOG 260 230 h
@parts
part 5 VDC 80 130 h
a 0 sp 0 0 22 37 hln 100 PART=VDC
a 0 a 0:13 0 0 0 hln 100 PKGREF=V1
a 1 ap 9 0 24 7 hcn 100 REFDES=V1
a 1 u 13 0 -11 18 hcn 100 DC=15V
part 2 r 200 170 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R1
a 0 ap 9 0 15 0 hln 100 REFDES=R1
a 0 u 13 0 15 30 hln 100 VALUE=5k
part 3 r 310 170 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R2
a 0 ap 9 0 15 0 hln 100 REFDES=R2
a 0 u 13 0 15 40 hln 100 VALUE=5.5k
part 4 r 390 170 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R3
a 0 ap 9 0 15 0 hln 100 REFDES=R3
a 0 u 13 0 15 35 hln 100 VALUE=1.5k
part 1 titleblk 970 720 h
a 1 s 13 0 350 10 hcn 100 PAGESIZE=A
a 1 s 13 0 180 60 hcn 100 PAGETITLE=
a 1 s 13 0 300 95 hrn 100 PAGENO=1
a 1 s 13 0 340 95 hrn 100 PAGECOUNT=1
@conn
w 8
a 0 up 0:33 0 0 0 hln 100 V=
s 80 130 80 80 7
s 80 80 200 80 9
a 0 up 33 0 140 79 hct 100 V=
s 200 80 200 130 11
s 200 80 310 80 13
s 310 80 310 130 15
s 310 80 390 80 17
s 390 80 390 130 19
w 26
a 0 up 0:33 0 0 0 hln 100 V=
s 80 170 80 230 25
s 390 170 390 230 21
s 390 230 310 230 23
s 80 230 200 230 27
a 0 up 33 0 140 229 hct 100 V=
s 200 230 260 230 31
s 200 170 200 230 29
s 310 230 260 230 34
s 310 170 310 230 32
@junction
j 80 130
+ p 5 +
+ w 8
j 200 130
+ p 2 2
+ w 8
j 200 80
+ w 8
+ w 8
j 310 130
+ p 3 2
+ w 8
j 310 80
+ w 8
+ w 8
j 390 130
+ p 4 2
+ w 8
j 80 170
+ p 5 -
+ w 26
j 390 170
+ p 4 1
+ w 26
j 260 230
+ s 6
+ w 26
j 200 170
+ p 2 1
+ w 26
j 200 230
+ w 26
+ w 26
j 310 170
+ p 3 1
+ w 26
j 310 230
+ w 26
+ w 26
@attributes
a 0 s 0:13 0 0 0 hln 100 PAGETITLE=
a 0 s 0:13 0 0 0 hln 100 PAGENO=1
a 0 s 0:13 0 0 0 hln 100 PAGESIZE=A
a 0 s 0:13 0 0 0 hln 100 PAGECOUNT=1
@graphics
