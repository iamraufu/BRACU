*version 9.1 28831572
u 27
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
pageloc 1 0 1926 
@status
n 0 120:11:21:15:03:10;1608541390 e 
s 2832 120:11:21:15:03:10;1608541390 e 
*page 1 0 970 720 iA
@ports
port 6 GND_ANALOG 200 190 h
@parts
part 2 r 130 70 h
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R1
a 0 ap 9 0 15 0 hln 100 REFDES=R1
a 0 u 13 0 15 25 hln 100 VALUE=4k
part 3 r 220 70 h
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R2
a 0 ap 9 0 15 0 hln 100 REFDES=R2
a 0 u 13 0 15 25 hln 100 VALUE=7.5k
part 4 r 320 70 h
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R3
a 0 ap 9 0 15 0 hln 100 REFDES=R3
a 0 u 13 0 15 25 hln 100 VALUE=1.5k
part 5 VDC 80 110 h
a 0 sp 0 0 22 37 hln 100 PART=VDC
a 0 a 0:13 0 0 0 hln 100 PKGREF=V1
a 1 ap 9 0 24 7 hcn 100 REFDES=V1
a 1 u 13 0 -11 18 hcn 100 DC=6.5V
part 1 titleblk 970 720 h
a 1 s 13 0 350 10 hcn 100 PAGESIZE=A
a 1 s 13 0 180 60 hcn 100 PAGETITLE=
a 1 s 13 0 300 95 hrn 100 PAGENO=1
a 1 s 13 0 340 95 hrn 100 PAGECOUNT=1
@conn
w 8
a 0 up 0:33 0 0 0 hln 100 V=
s 80 110 80 70 7
s 80 70 130 70 9
a 0 up 33 0 105 69 hct 100 V=
w 12
a 0 up 0:33 0 0 0 hln 100 V=
s 170 70 220 70 11
a 0 up 33 0 195 69 hct 100 V=
w 14
a 0 up 0:33 0 0 0 hln 100 V=
s 260 70 320 70 13
a 0 up 33 0 290 69 hct 100 V=
w 24
a 0 up 0:33 0 0 0 hln 100 V=
s 80 150 80 180 23
s 360 70 400 70 15
s 400 70 400 180 17
s 400 180 200 180 19
a 0 up 33 0 300 179 hct 100 V=
s 200 180 200 190 21
s 80 180 200 180 25
@junction
j 80 110
+ p 5 +
+ w 8
j 130 70
+ p 2 1
+ w 8
j 220 70
+ p 3 1
+ w 12
j 170 70
+ p 2 2
+ w 12
j 260 70
+ p 3 2
+ w 14
j 80 150
+ p 5 -
+ w 24
j 200 190
+ s 6
+ w 24
j 200 180
+ w 24
+ w 24
j 320 70
+ p 4 1
+ w 14
j 360 70
+ p 4 2
+ w 24
@attributes
a 0 s 0:13 0 0 0 hln 100 PAGETITLE=
a 0 s 0:13 0 0 0 hln 100 PAGENO=1
a 0 s 0:13 0 0 0 hln 100 PAGESIZE=A
a 0 s 0:13 0 0 0 hln 100 PAGECOUNT=1
@graphics
