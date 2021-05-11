.MODEL SMALL               
FINDGREATER MACRO X,Y,Z      
   MOV CL,X
   MOV CH,Y
   MOV BH,Z
    
   CMP CL,CH 
   JG C1   
   JNG C2  
   C1: 
   CMP CL,BH 
   JG MAX_X    
   JNG MAX_Z 
   C2:
   CMP CH,BH  
   JG MAX_Y   
   JNG MAX_Z  
         
   MAX_X:
   MOV DL,CL
   MOV AH,2
   INT 21H 
   JMP EXIT
   MAX_Y:
   MOV DL,CH
   MOV AH,2
   INT 21H 
   JMP EXIT 
   MAX_Z:
   MOV DL,BH
   MOV AH,2
   INT 21H 
   EXIT:
    
ENDM    

.STACK 100H

.DATA   

 A DB 0  
 B DB 0
 C DB 0
 M1 DB 0AH,0DH,"Maximum number is $"       
 M2 DB 0AH,0DH,"Minimum number is $"      
 M3 DB "INPUT:$" 

.CODE
MAIN PROC
    
;INITIALIZE DS
MOV AX, @DATA
MOV DS, AX

;ENTER YOUR CODE HERE 
LEA DX,M3
MOV AH,9
INT 21H 


MOV AH,1
INT 21H
MOV A,AL
INT 21H 
MOV B,AL
INT 21H
MOV C,AL

LEA DX,M1
MOV AH,9
INT 21H 
FINDGREATER A,B,C   

LEA DX,M2
MOV AH,9
INT 21H 
CALL FINDMINIMUM  

FINDMINIMUM PROC  
    
   MOV CL,A
   MOV CH,B
   MOV BH,C
  
   CMP CL,CH ;A<B?  
   JNL C3  ;A<B=NO?
   JL C4   ;A<B=YES?
   C3:
   CMP CH,BH  
   JL MIN_B   ;B<C=YES? MIN=B
   JNL MIN_C  ;B<C=NO? MIN=C 
   C4:
   CMP CL,BH 
   JL MIN_A  ;A<C=YES? MIN=A  
   JNL MIN_C ;A<C=NO? MIN=C
       
   MIN_A:
   MOV DL,CL
   MOV AH,2
   INT 21H 
   JMP EXIT_
   MIN_B:
   MOV DL,CH
   MOV AH,2
   INT 21H 
   JMP EXIT_ 
   MIN_C:
   MOV DL,BH
   MOV AH,2
   INT 21H 
   EXIT_:
    
    MOV AX, 4C00H
    INT 21H 
    
   RET
   
FINDMINIMUM ENDP
