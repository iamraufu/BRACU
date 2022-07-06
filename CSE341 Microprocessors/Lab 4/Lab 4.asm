;Task 01 Take a number in AX, and if it?s a negative number, replace it by 5.

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
    mov ax , 2
    neg ax
    jl negative
    jmp exit
    
    negative:
    mov ax , 5
    
    exit:        
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 02 Suppose AL and BL contain extended ASCII characters. Display the one that comes first in the character sequence.

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
    
    mov ah , 1
    int 21h
    mov cl , al
    
    mov ah , 1
    int 21h
    mov ch , al
    
    cmp cl , ch
    jle if_
    jmp else_
    
    if_:
        mov dl , cl
        jmp display_
    
    else_:
        mov dl , ch
    
    display_: 
        mov ah , 2
        int 21h
            
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 03 If AX contains a negative number, put -1 in BX; if AX contains 0, put 0 In BX; if AX contains a positive number, put 1 in BX.

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
    
    mov ax , 2
    neg ax
    cmp ax , 0
    
    jl n
    je e
    jg p
    
    n:
        mov bx , 1
        neg bx
        jmp exit
        
    e:
        mov bx , 0
        jmp exit
        
    p:
        mov bx , 1
        
    exit:
            
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


; Task 04 If AL contains 1 or 3, display “o”; if AL contains 2 or 4 display "e".

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
    
    ;mov al , 1
    ;mov al , 3
    ;mov al , 2
    mov al , 4
    
    cmp al , 1
    je DisO
    cmp al , 3
    je DisO
    cmp al , 2
    je DisE
    cmp al , 4
    je DisE
    
    DisO:
        mov ah , 2
        mov dl , 'o'
        int 21h
        jmp exit
        
    DisE:
        mov ah , 2
        mov dl , 'e'
        int 21h
        jmp exit
        
    exit:
            
   
ends

end start ; set entry point and stop the assembler.


; Task 05 Read a character, and if it's an uppercase letter, display it.

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
    
    mov ah , 1
    int 21h
    
    cmp al , 61h
    jl print
    jmp exit
    
    print:
    mov ah , 2
    mov dl , al
    int 21h
    
    exit:
            
    
ends

end start ; set entry point and stop the assembler.


;Task 06 Read a character. If it's "y" or "Y", display it; otherwise, terminate the program.

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
            
    mov ah , 1
    int 21h
    
    cmp al , 59h
    je printY
    
    
    cmp al , 79h
    je printY
    jmp exit
    
    printY:
    mov ah , 2
    mov dl , al
    int 21h 
    exit:
    
ends

end start ; set entry point and stop the assembler.


;Task 07 Write an assembly program to check whether a number is even or odd.

; multi-segment executable file template.

data segment
    ; add your data here!
    e db "Even$"
    o db "Odd$" 
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
    
    mov ah , 1
    int 21h
    mov ah , 0
    mov ax , al
    mov bl ,2
    
    cmp al , 0 
    je printEven
    
    div bl
    cmp ah , 0
    je printEven
    
    LEA DX,o 
    mov AH,9 
    int 21h
    jmp exit 
    
    
    
    printEven:  
    LEA DX,e 
    mov AH,9 
    int 21h 
    
    exit: 
    
ends

end start ; set entry point and stop the assembler.


; Task 08 Write a program to input any alphabet and check whether it is vowel or consonant.

; multi-segment executable file template.

data segment
    ; add your data here!
    e db "Vioel$"
    o db "Constant$"
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
            
    mov ah , 1
    int 21h
    
    cmp al , 'A'
    je printEven
    cmp al , 'E'
    je printEven
    cmp al , 'I'
    je printEven
    cmp al , 'O'
    je printEven
    cmp al , 'U'
    je printEven
    
    cmp al , 'a'
    je printEven
    cmp al , 'e'
    je printEven
    cmp al , 'i'
    je printEven
    cmp al , 'o'
    je printEven
    cmp al , 'u'
    je printEven
    
    LEA DX,o 
    mov AH,9 
    int 21h 
    jmp exit
   
   
    printEven:  
    LEA DX,e 
    mov AH,9 
    int 21h 
    
    exit:
    
     
ends

end start ; set entry point and stop the assembler.


;Task 09 Write a program to check whether a number is divisible by 5 and 11 or not.

; multi-segment executable file template.

data segment
    ; add your data here!
    msg1 db "It is divisible by 5 and 11$"
    msg2 db "It is not divisible by 5 and 11$"
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
    mov cx , 23
    mov bh , 5
    mov bl , 11
    
    mov ax , cx
    div bh
    cmp ah , 0
    je check11
    jmp noPrint
    
    check11:
        mov ax , cx
        div bl
        cmp ah , 0
        je print
        jmp noPrint
        
    print:
        
        lea dx, msg1
        mov ah, 9
        int 21h
        jmp exit 
        
    noPrint:
        lea dx, msg2
        mov ah, 9
        int 21h
        jmp exit
        
    exit:
    
    
ends

end start ; set entry point and stop the assembler.


; Task 10 Write a program to find the maximum and minimum between three numbers.


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
            
   
ends

end start ; set entry point and stop the assembler.


;Task 11 Write a program that takes as input all sides of a triangle and check whether triangle is valid or not. If the sides form a triangle, print “Y”, otherwise print “N”.

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
            
    lea dx, pkey
    mov ah, 9
    int 21h        ; output string at ds:dx
    
    ; wait for any key....    
    mov ah, 1
    int 21h
    
    mov ax, 4c00h ; exit to operating system.
    int 21h    
ends

end start ; set entry point and stop the assembler.


;Task 12 Write a program that takes a digit as an input and outputs the following. If the digit is within 0-3, it prints “i”, If it?s within 4-6, it prints “k”, If it?s within 7-9, it prints “l” and if it?s 10, it prints “m”.

; multi-segment executable file template.

data segment
    ; add your data here!
    input db "Input: $"
    output db "Output: $"
    i db "i$"
    k db "k$"
    l db "l$"
    m db "m&"
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
    lea dx, input
    mov ah, 9
    int 21h
    
    mov ah, 1
    int 21h
    
    cmp al , 30h
    je printI
    cmp al , 31h
    je printI
    cmp al , 32h
    je printI
    cmp al , 33h
    je printI
    
    
    cmp al , 34h
    je printK
    cmp al , 35h
    je printK
    cmp al , 36h
    je printK
    
    cmp al , 37h
    je printL
    cmp al , 38h
    je printL
    cmp al , 39h
    je printL
    
    cmp al , 40h
    je printM
    
    
  
    printI:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, i
        mov ah, 9
        int 21h
        jmp exit
        
    printK:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, k
        mov ah, 9
        int 21h
        jmp exit
        
    printL:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, l
        mov ah, 9
        int 21h
        jmp exit
        
    printM:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, m
        mov ah, 9
        int 21h
        jmp exit
        
        
    exit:
    
    
    
            
        
ends

end start ; set entry point and stop the assembler.


;Task 13 Write a case to print the name of the day of the week. Consider the first day of the week is Saturday.

; multi-segment executable file template.

data segment
    ; add your data here!
    input db "Input: $"
    output db "Output: $"
    sat db "Saturday$"
    sun db "Sunday$"
    mon db "Monday$"
    tue db "Tuesday$"
    wed db "Wednesday$"
    thu db "Thursday$"
    fri db "Friday$"
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
    lea dx, input
    mov ah, 9
    int 21h
    
    mov ah, 1
    int 21h
    
    cmp al , 31h
    je printSat
    cmp al , 32h
    je printSun
    cmp al , 33h
    je printMon
    cmp al , 34h
    je printTue
    cmp al , 35h
    je printWed
    cmp al , 36h
    je printThu
    cmp al , 37h
    je printFri
    
    
    printSat:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, sat
        mov ah, 9
        int 21h
        jmp exit
        
        
    printSun:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, sun
        mov ah, 9
        int 21h
        jmp exit
        
    printMon:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, mon
        mov ah, 9
        int 21h
        jmp exit
        
    printTue:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, tue
        mov ah, 9
        int 21h
        jmp exit
        
    printWed:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, wed
        mov ah, 9
        int 21h
        jmp exit
        
    printThu:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, thu
        mov ah, 9
        int 21h
        jmp exit
        
    printFri:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, fri
        mov ah, 9
        int 21h
        jmp exit
        
    exit:        
        
ends

end start ; set entry point and stop the assembler.


;Task 14 Write a case to print the total number of days in a month.

; multi-segment executable file template.

data segment
    ; add your data here!
    input db "Input: $"
    output db "Output: $"
    28days db "28 days$"
    30days db "30 days$"
    31days db "31 days$"
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
    lea dx, input
    mov ah, 9
    int 21h
    
    mov ah, 1
    int 21h
    
    cmp al , 31h
    je print31
    
    cmp al , 32h
    je print28
    
    cmp al , 33h
    je print31
    
    cmp al ,  34h
    je print30
    
    cmp al , 35h
    je print31
    
    cmp al , 36h
    je print30
    
    cmp al , 37h
    je print31
    
    cmp al ,  38h
    je print31
    
    cmp al ,  39h
    je print30
    
    cmp al ,  40h
    je print31
    
    
    print28:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h 
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, 28days
        mov ah, 9
        int 21h
        jmp exit
        
    print30:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h 
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, 30days
        mov ah, 9
        int 21h
        jmp exit
        
    print31:
        mov dl, 0AH
        mov ah , 2
        int 21h
        mov dL,0DH 
        int 21h 
        mov dL,0AH 
        int 21h 
        
        lea dx, output
        mov ah, 9
        int 21h
        
        lea dx, 31days
        mov ah, 9
        int 21h
        jmp exit
        
    exit:       
       
ends

end start ; set entry point and stop the assembler.
