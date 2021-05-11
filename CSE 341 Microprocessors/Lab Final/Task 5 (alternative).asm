.MODEL SMALL
 
.STACK 100H

.DATA  

X DB "ENTER A STRING: $" 
T DB "TOTAL CHARACTER: $"
Y DB "TOTAL CONSONANT: $"
TOTAL DB 0
VOWEL DB 0
CON DB 0

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here


 MOV AH,9
 LEA DX,X
 INT 21H  ;PRINT STRING X 
 
 
 MOV AH,1
 INT 21H
 
 WHILE:
    CMP AL,0DH
    JE ENDED
    
    CMP AL,'A'
    JE OK
    CMP AL,'a'
    JE OK
    CMP AL,'E'
    JE OK
    CMP AL,'e'
    JE OK
    CMP AL,'I'
    JE OK
    CMP AL,'i'
    JE OK
    CMP AL,'O'
    JE OK
    CMP AL,'o'
    JE OK
    CMP AL,'U'
    JE OK
    CMP AL,'u'
    JE OK
    
    UP:
      INC TOTAL
      INT 21H
      JMP WHILE
     
    OK:
      INC VOWEL
      JMP UP
     
ENDED:

    MOV DL,0AH
    MOV AH,2
    INT 21H    ;next line
      
    MOV DL,0DH      
    INT 21H    ;new line from left corner

    MOV AH,9
    LEA DX,T
    INT 21H
    
    MOV AH,2
    MOV DL,TOTAL
    ADD DL,30H
    INT 21H
    
    MOV DL,0AH
    MOV AH,2
    INT 21H    ;next line
      
    MOV DL,0DH      
    INT 21H    ;new line from left corner
    
    MOV AH,9
    LEA DX,Y
    INT 21H
    
    MOV AH,2
    MOV DL,TOTAL
    MOV BL,VOWEL
    SUB DL,BL
    ADD DL,30H
    INT 21H
      



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
