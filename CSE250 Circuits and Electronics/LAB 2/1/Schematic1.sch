*version 9.1 598871510
u 61
R? 5
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
pageloc 1 0 2052 
@status
n 0 120:10:20:22:53:34;1605891214 e 
s 2832 120:10:20:23:31:55;1605893515 e 
*page 1 0 970 720 iA
@ports
port 7 GND_ANALOG 230 260 h
@parts
part 4 r 490 150 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R3
a 0 ap 9 0 15 0 hln 100 REFDES=R3
part 5 r 490 220 v
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R4
a 0 ap 9 0 15 0 hln 100 REFDES=R4
part 6 VDC 230 150 h
a 0 sp 0 0 22 37 hln 100 PART=VDC
a 0 a 0:13 0 0 0 hln 100 PKGREF=V1
a 1 ap 9 0 24 7 hcn 100 REFDES=V1
a 1 u 13 0 -11 18 hcn 100 DC=12V
part 2 r 330 60 h
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R1
a 0 ap 9 0 15 0 hln 100 REFDES=R1
a 0 u 13 0 15 25 hln 100 VALUE=10k
part 3 r 330 120 h
a 0 sp 0 0 0 10 hlb 100 PART=r
a 0 s 0:13 0 0 0 hln 100 PKGTYPE=RC05
a 0 s 0:13 0 0 0 hln 100 GATE=
a 0 a 0:13 0 0 0 hln 100 PKGREF=R2
a 0 ap 9 0 15 0 hln 100 REFDES=R2
a 0 u 13 0 15 25 hln 100 VALUE=10k
part 1 titleblk 970 720 h
a 1 s 13 0 350 10 hcn 100 PAGESIZE=A
a 1 s 13 0 180 60 hcn 100 PAGETITLE=
a 1 s 13 0 300 95 hrn 100 PAGENO=1
a 1 s 13 0 340 95 hrn 100 PAGECOUNT=1
@conn
w 15
s 370 120 420 120 14
s 420 120 420 90 16
s 420 60 370 60 18
s 420 90 420 60 22
s 420 90 490 90 20
s 490 90 490 110 23
w 41
s 280 90 230 90 42
s 280 60 280 90 44
s 280 90 280 120 46
s 280 120 330 120 47
s 280 60 330 60 49
s 230 150 230 90 35
w 26
s 490 180 490 150 53
w 28
s 490 220 490 260 27
s 230 260 230 190 60
s 490 260 230 260 29
@junction
j 370 120
+ p 3 2
+ w 15
j 420 90
+ w 15
+ w 15
j 490 110
+ p 4 2
+ w 15
j 370 60
+ p 2 2
+ w 15
j 280 90
+ w 41
+ w 41
j 330 120
+ p 3 1
+ w 41
j 330 60
+ p 2 1
+ w 41
j 490 180
+ p 5 2
+ w 26
j 490 150
+ p 4 1
+ w 26
j 490 220
+ p 5 1
+ w 28
j 230 260
+ s 7
+ w 28
j 230 150
+ p 6 +
+ w 41
j 230 190
+ p 6 -
+ w 28
@attributes
a 0 s 0:13 0 0 0 hln 100 PAGETITLE=
a 0 s 0:13 0 0 0 hln 100 PAGENO=1
a 0 s 0:13 0 0 0 hln 100 PAGESIZE=A
a 0 s 0:13 0 0 0 hln 100 PAGECOUNT=1
@graphics
