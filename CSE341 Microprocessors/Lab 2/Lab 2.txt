;TASK 01 Take input in the register AX, and then move it to BX using the MOV instruction.
   mov ax , 10
   mov bx, ax
   
;TASK 02 Swap two numbers, using a maximum of 3 registers.
   mov ax , 5
   mov bx , 2
   mov cx, ax
   mov ax, bx
   mov bx, cx
   
;TASK 03 Add two numbers using two registers. 
   mov ax, 10
   mov bx, 5
   add ax , bx
   
;TASK 04 Subtract two numbers using two registers. 
   mov ax, 5
   mov bx, 3
   sub ax , bx  

;TASK 05 Swap two numbers using ADD/SUB instructions only. 
   mov ax,5
   mov bx,3
   add ax,bx 
   sub bx,ax 
   sub ax,bx
   
;TASK 06 Perform the following arithmetic instructions. A, B, C are three variables to be declared beforehand 
   
;1. A = B - A 
   mov ax , 3
   mov bx , 2                                      
   mov cx , 5
   sub bx, ax
   mov ax, bx
   
;2. A = -(A + 1) 
   add ax , 1
   neg ax
   
;3. C = A + (B + 1)    
   mov ax , 3
   mov bx , 2
   mov cx , 5
   inc bx
   add ax , bx
   mov cx, ax  
   
;4. A = B - (A - 1); use dec 
   mov ax , 3
   mov bx , 2
   mov cx , 5
   dec ax
   sub bx , ax
   mov ax , bx
   
;TASK 07 Perform the following arithmetic operations
   
;1. X * Y 
   mov al , 2
   mov bl , 3
   mul bl
          
;2. X / Y 
   mov al , 9
   mov bl , 3 
   div bl

;3. X * Y / Z 
    mov al , 2
    mov bl , 3
    
    mul bl
    mov ax , al
    mov bl , 5
    div bl 

;Task 08 Perform the following arithmetic operations

;1. 236DF * AF
    ;Not Possible

;2. 8A32F4D5 / C9A5
    ;Not Possible

;3. CA92 * BAF9
    mov ax, CA92
    mov bx, BAF9
    mul bx

;4. C2A2 * ABCD / BED
    mov ax, C2A2
    mov bx, ABCD
    mul bx
    mov cx, BED
    div cx

;Task 09 Write two examples for each combination of registers possible for the 'mov' instruction.

;General Registers:     
     mov ax,ax
     mov ax,bx

     mov cs,ax
     mov ds,bx

     mov si,ax
     mov di,bx

;Segment Register:
     mov ax,cs,
     mov bx,ds

     mov si,cs
     mov di,ds

;Memory Location:
     mov ax,di
     mov bx,si

     mov cs,di
     mov ds,si
     
;Task 10 Write two examples for each combination of registers possible for the 'add' and 'sub' instructions.

;General Registers:     
     add ax,ax
     add ax,bx

     add si,ax
     add di,bx

     sub ax,ax
     sub ax,bx

     sub si,ax
     sub di,bx

;Memory Location:
     add ax,di
     add bx,si

     add cs,di
     add ds,si

     sub ax,di
     sub bx,si

     sub cs,di
     sub ds,si

;Task 11 Perform the following arithmetic operation: (1 + 2) * (3 – 1) / 5 + 3 + 2 – (1 * 2)
    mov ax, 1
    mov bx, 2
    mov cx, 3
    mov dx, 5
    add ax,bx
    mov di,ax
    sub cx,ax
    mov si,cx
    mul si
    add dx,cx
    add dx,bx
    mul ax
    sub dx,ax