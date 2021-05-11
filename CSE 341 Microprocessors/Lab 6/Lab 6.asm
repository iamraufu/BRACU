;Task 1
.model small
.stack 100h 
.data
msg         db 10, 13, "Enter your name $ "
bufferSize  db 21  ; 20 char + RETURN
inputLength db 0   ; number of read characters
buffer      db 21 DUP("$") ; actual buffer

.code
main proc

mov ax, @data
mov ds, ax
lea dx, msg
mov ah, 09h ;output
int 21h

mov dx, offset bufferSize ; load our pointer to the beginning of the structure
mov ah, 10 ; GetLine function
int 21h

mov ax, @data 
mov ds , ax 
lea dx, buffer
mov ah, 09 ;output
int 21h

endp
end main   

;Task 2
Data Segment
  arr1 db 8,2,7,4,3
Data Ends

Code Segment
  Assume cs:code, ds:data

  Begin:
    mov ax, data
    mov ds, ax
    mov es, ax
    mov bx, OFFSET arr1
    mov cx, 5
    mov dx, cx
    L1:      
       mov si, 0
       mov ax, si
       inc ax
       mov di, ax
       mov dx, cx
    L2:
       mov al, [bx][si]
       cmp al, [bx][di]
       jg L4
    L3:
       inc si
       inc di
       dec dx
       cmp dx, 00
       je L1
       jg L2
    L4:
       mov al, [bx][si]
       mov ah, [bx][di]
       mov [bx][si], ah
       mov [bx][di], al
       inc si
       inc di       
       dec dx
       cmp dx, 00
       je L1
       jg L2
    Exit:
       mov ax, 4c00h
       int 21h
Code Ends
End Begin

;Task 3
DATA SEGMENT
NUM1 DB 5
NUM2 DB 9
NUM3 DB 7
LRGT DB ?
ENDS
CODE SEGMENT
ASSUME DS:DATA CS:CODE
START:
MOV AX,DATA
MOV DS,AX
MOV AL,NUM1
MOV LRGT,AL
CMP AL,NUM2
JGE SKIP1
MOV AL,NUM2
MOV LRGT,AL
SKIP1:
MOV AL,LRGT
CMP AL,NUM3
JGE SKIP2
MOV AL,NUM3
MOV LRGT,AL
SKIP2:
MOV AH,4CH
INT 21H
ENDS
END START