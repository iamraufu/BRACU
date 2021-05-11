;Task 01 Write a count-controlled loop to display a row of 80 stars.

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
    mov bh , 0 
    mov ah , 2
    mov dl , '*'
    
    begin:
        cmp bh , 80
        jge end
        int 21h
        inc bh
        jmp begin
        
    end:       
        
ends

end start ; set entry point and stop the assembler.


;Task 02 Write a sequence of instructions to do each of the following:
;a. Put the sum of 1 + 4 + 7+ .. + 148 in AX.

; multi-segment executable file template.

data segment
    ; add your data here!
    
ends

stack segment
    dw   128  dup(0)
ends

code segment
start:
    mov bx , 1
    mov ax , 0
    
    begin:
        cmp bx , 7
        jg end
        add ax , bx
        add bx , 3
        jmp begin
        
    end:   
    
ends

end start ; set entry point and stop the assembler.


;b. Put the sum 100 + 95 + 90 + ... + 5 in AX.

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
            
    
    mov bx , 100
    mov ax , 0
    
    begin:
        cmp bx , 5
        jl end
        add ax , bx
        sub bx , 5
        jmp begin
        
    end:    
ends

end start ; set entry point and stop the assembler.


;Task 03 Read a five character password and overprint it by executing a carriage return and displaying five X's. You need not store the input characters anywhere.

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
    
    mov bx , 1
    
    begin:
    cmp bx , 5
    jg end

    MOV AH, 1  ;read character function 
    INT 21h ;character in AL
    add bx , 1     
    jmp begin
    
    end:
    
    mov ah , 2
    mov dL,0DH 
    int 21h 
 
    mov cx , 1
    
    print:
    cmp cx , 5
    jg pend
    mov ah , 2
    mov dl , 'X'
    int 21h
    add cx , 1
    
    jmp print
    
    pend:
    
      
ends

end start ; set entry point and stop the assembler.


;Task 04 The following algorithm may be used to carry out multiplication of two positive numbers M and N by repeated addition. 

; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "The product is:   $"
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
    
    
    ;input
    mov ah, 1
    int 21h   
    sub al, 48
    mov bh, al
    mov ch, al
    
    ;input
    mov ah, 1
    int 21h
    sub al, 48
    mov bl, al
    

    st_1:
        dec bl 
        cmp bl, 0
        jle end_1
        add bh,ch       
        jmp st_1
    end_1:
    
            
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 05 Write a program to display the extended ASCII characters (ASCII codes 80h to FFh).

; multi-segment executable file template.

data segment
    ; add your data here!
    pkey db "The product is:   $"
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
    
    mov bx, 80h
    mov cl, 0
    st_1: 
        cmp bx, 0ffh
        jg end_1
        mov ah, 2
        mov dx, bx
        cmp cl, 10
            jne nonewl
            mov ah, 2
            mov dx, 10
            int 21h
            mov ah, 2
            mov dx, 13
            int 21h
            mov cl, 0 
            nonewl:
            int 21h
        inc bx
        inc cl      
        jmp st_1
    end_1:
    
            
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.