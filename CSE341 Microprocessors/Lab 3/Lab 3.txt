;Task 01 Take a character input and display it. Display the message "Please insert a character: " when taking an input.

; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "press any key...$" 
    str db "Please insert a character:$" 
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here     
            
    lea dx, str
    mov ah, 9
    int 21h        
            
    ;Input
    mov ah,1 
    int 21h 
    
    ;Output
    mov dl,al ;Input Goes to al
    mov ah,2  
    int 21h
               
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 02 Perform addition/subtraction/division/multiplication by taking inputs from the user.

; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "press any key...$" 
    a db "Enter First Value:$"
    b db "Enter Second Value:$"
    c db "Summation:$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here
          
    ;First Number
    lea dx, a
    mov ah, 9
    int 21h          
    
    ;First Number Input
    mov ah,1 
    int 21h 
    mov bh , al  
    
    mov dl, 0AH
    mov ah,2 
    int 21h  
    mov dl, 13
    int 21h
    
    ;Second Number
    lea dx, b
    mov ah, 9
    int 21h        ; output string at ds:dx   
    
    ;Second Number Input
    mov ah,1 
    int 21h 
    mov bl , al 
    
    
    sub bh , 030h
    sub bl , 030h   
    
    
    add bh , bl   
    add bh , 030h
    
    mov dl, 0AH
    mov ah,2 
    int 21h  
    mov dl, 13
    int 21h
    
    lea dx, c
    mov ah, 9
    int 21h  
    
    mov dl,bh 
    mov ah,2  
    int 21h 
    
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 03 Write instructions to do the following. a. Read a character, and display it at the next position on the same line. b. Read an uppercase letter (omit error checking), and display it at the next position on the same line in lower case.

; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "press any key...$"
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here
    
    ;TASK 03(a)
    mov ah,1 
    int 21h 
    
    mov dl,al 
    mov ah,2  
    int 21h 
    
    mov dl, 0AH
    mov ah,2 
    int 21h  
    mov dl, 13
    int 21h
    
    ;Task 03(b)
    
    mov ah,1 
    int 21h 
    mov bl, al
    
    add bl, 32    
    mov dl,bl 
    mov ah,2  
    int 21h 
    
    
    
    
   
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


Task 04 Read an uppercase letter (omit error checking), and display it at the next position on the next line in lower case.

; multi-segment executable file template.

data segment
    ; add your data here!
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here 
    
    ;Taking input
    mov ah,1
    int 21h
    mov cl , al
    
    ;New Line 
    mov dl, 0AH
    mov ah , 2
    int 21h  
    
    ;Converting
    mov bl, cl
    add bl, 32
    
    ;Output    
    mov dl,bl 
    mov ah,2  
    int 21h 

    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 05 Write a program to: (a) display a "?" (b) read two decimal digits whose sum is less than 10, (c) display them and their sum on the next line, with an appropriate message.

; multi-segment executable file template.

data segment
    ; add your data here!
    s1 db "THE SUM OF $"
    s2 db " AND $"
    s3 db " IS $"
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here   
    
    ;Printing '?'
    MOV DL, 03FH  ;character is '?'     
    mov ah , 2
    INT 21h  ;display character 
    
    ;Input 1
    mov ah,1
    int 21h
    mov cl , al
    mov bl, cl 
    
    ;Input 2
    mov ah,1
    int 21h
    mov ch , al
    
    ;Sum and Sub to convert
    mov dl , cl
    add cl, ch
    sub cl, 030h
    
    ;New Line
    mov dl, 0AH
    mov ah , 2
    int 21h 
    
    
    mov dL,0DH ;carriage return
    int 21h ;execute carriage return
    mov dL,0AH ;line feed
    int 21h ;execute line feed
    
    
    ;PRINTING
    lea dx, s1
    mov ah, 9
    int 21h
    
    mov dl,bl
    mov ah,2
    int 21h
    
    lea dx, s2
    mov ah, 9
    int 21h
    
    mov dl,ch
    mov ah,2
    int 21h 
    
    lea dx, s3
    mov ah, 9
    int 21h
    
    
    ;Print of Summation
    mov dl,cl
    mov ah,2
    int 21h   
         
ends

end start ; set entry point and stop the assembler.


;Task 06 Write a program to: (a) prompt the user, (b) read first, middle, and last initials of a person's name, and then (c) display them down the left margin.

; multi-segment executable file template.

data segment
    ; add your data here!
    str db "ENTER THREE INITIALS: $"
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here  
    
    ;Printing Prompt
    lea dx, str
    mov ah, 9
    int 21h
    
    ;Taking Three Inputs
    mov ah,1 
    int 21h
    mov bh , al
    
    mov ah,1 
    int 21h
    mov bl , al
    
    mov ah,1 
    int 21h
    mov cl, al
    
    ;Printing
    mov dl, 0AH
    mov ah , 2
    int 21h
    mov dL,0DH 
    int 21h 
    mov dL,0AH 
    int 21h 
    
    mov dl,bh
    mov ah,2
    int 21h
    
    mov dl, 0AH
    mov ah , 2
    int 21h
    mov dL,0DH 
    int 21h 
    mov dL,0AH 
    int 21h 
    
    mov dl,bl
    mov ah,2
    int 21h 
    
    mov dl, 0AH
    mov ah , 2
    int 21h
    mov dL,0DH 
    int 21h 
    mov dL,0AH 
    int 21h 
    
    mov dl,cl
    mov ah,2
    int 21h
       
ends

end start ; set entry point and stop the assembler.


;Task 07 Write a program to read one of the hex digits A-F, and display it on the next line in decimal.

; multi-segment executable file template.

data segment
    ; add your data here!
    s1 db "ENTER A HEX DIGIT: $" 
    s2 db "IN DECIMAL IT IS: $"
   
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here
    ;Printing Prompt & Input
    lea dx, s1
    mov ah, 9
    int 21h
    
    mov ah,1 
    int 21h
    mov bh , al
    
    ;Second Line and Prompt
    mov dl, 0AH
    mov ah , 2
    int 21h
    mov dL,0DH 
    int 21h 
    mov dL,0AH 
    int 21h
    
    lea dx, s2
    mov ah, 9
    int 21h
    
    ; Printing 1 as first number will always be 1
    mov ah , 2
    mov dl , 31h 
    int 21h
    
    
    ;Printing Second Number by subtracting 11
    mov ah , 2
    sub bh , 11h
    mov dl , bh
    int 21h        
    
ends

end start ; set entry point and stop the assembler.


;Task 08 Write a program to display a 10 x 10 solid box of asterisks.

; multi-segment executable file template.

data segment
    ; add your data here!
    s db '**********',0DH,0AH,'$'
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
; set segment registers:
    mov ax, data
    mov ds, ax
    mov es, ax

    ; add your code here 
    
    lea dx, s
    mov ah, 9
    
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
    int 21h
     
ends

end start ; set entry point and stop the assembler.

;Task 09 ADD AL, BL. Where AL contains 80h, BL contains 80h. Identify the status of different status flags.

MOV AL,80h
MOV BL,80h
ADD AL,BL

;80h= 10000000b
;80h= 10000000b
;-----------------------
;100h=100000000b

  
;Status Flag
  
; Zero Flag= 1 
; Sign Flag= 1 
; Carry Flag= 1
; Parity Flag= 0 
; Auxilary Flag= 1 
; Overflow Flag= 1         


;Task 10 Suppose that AX and BX both contain positive numbers and ADD AX, BX is executed. Show that there is a carry into the msb but no carry out of the msb if, and only if, signed over flow occurs.

;descriptive answer

;Task 11 Suppose AX and BX both contain negative numbers, and ADD AX,BX is executed. Show that there is a carry out of the msb but no carry into the msb if, and only if, signed overflow occurs.

;descriptive answer