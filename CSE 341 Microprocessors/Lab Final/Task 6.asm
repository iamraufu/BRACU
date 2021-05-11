.MODEL SMALL
 
.STACK 100H


   
.DATA
X DB "ENTER A NUMBER: $" 
 
.CODE 

MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here 

   LEA DX,X
   MOV AH,9
   INT 21H   ;display the string
   
   MOV BX,1
   MOV AH,1   ;user input taking start
   INT 21H    ;user input taking ends
   SUB AL,30H
   SUB AH,AH  
   MOV CX,AX
   
   MOV DL,0AH
   MOV AH,2
   INT 21H    ;next line
      
   MOV DL,0DH      
   INT 21H    ;new line from left corner 
   
   L1:
   PUSH CX
   MOV AH,2
   MOV DL,32
   L2:
   INT 21H
   LOOP L2
   
   MOV CX,BX
   MOV DL,'*'
   L3:
   INT 21H
   LOOP L3
   MOV AH,2
   MOV DL,10
   INT 21H
   MOV DL,13
   INT 21H
   INC BX
   POP CX
   LOOP L1
     
    
    
    
    




;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
