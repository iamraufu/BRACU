/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author EFTYKHAR RAHMAN
 */
public class CircularArray {

    private int start;
    private int size;
    private Object[] cir;

    /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object[] lin, int st, int sz) {
        //TO DO

        start = st;
        size = sz;
        cir = new Object[lin.length];

        for (int i = 0; i < size; i++) {

            cir[st] = lin[i];

            st = (st + 1) % cir.length;
        }

    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        //TO DO

        for (int i = 0; i < cir.length; i++) {

            System.out.print(cir[i] + " ");
        }

        System.out.println();
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        //To DO

        for (int i = 0; i < size; i++) {

            System.out.print(cir[(i + start) % cir.length] + " ");
        }

        System.out.println();
    }

    public void printBackward() {
        //TO DO

        for (int i = size - 1; i >= 0; i--) {

            System.out.print(cir[(i + start) % cir.length] + " ");
        }

        System.out.println();
    }

    // With no null cells
    public void linearize() {
        //TO DO

        Object[] temp = new Object[size];

        for (int i = 0; i < size; i++) {

            temp[i] = cir[(i + start) % cir.length];
        }

        cir = temp;

        start = 0;

    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity) {
        //TO DO

        Object[] temp = new Object[newcapacity];

        for (int i = 0; i < size; i++) {

            temp[(i + start) % newcapacity] = cir[(i + start) % cir.length];
        }

        cir = temp;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity) {
        //TO DO

        Object[] temp = new Object[newcapacity];

        for (int i = 0; i < size; i++) {

            temp[i] = cir[(i + start) % cir.length];
        }

        start = 0;
        cir = temp;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos) {
        //TO DO

        if (size == cir.length) {

            resizeStartUnchanged(cir.length + 3);

        }

        for (int i = cir.length - 1; i > (start + pos) % cir.length; i--) {

            cir[i] = cir[i - 1];
        }

        cir[(start + pos) % cir.length] = elem;
        size++;
    }

    public void insertByLeftShift(Object elem, int pos) {
        //TO DO

        if (size == cir.length) {

            resizeStartUnchanged(cir.length + 3);
        }

        for (int i = 0; i < (start + pos) % cir.length; i++) {

            cir[i] = cir[i + 1];
        }

        cir[(start + pos) % cir.length] = elem;
        start--;
        size++;
    }

    /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos) {
        //TO DO

        for (int i = start + pos; i != (start + size) % cir.length; i = (i + 1) % cir.length) {

            cir[i] = cir[(i + 1) % cir.length];
        }

        size--;
    }

    /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos) {
        //TO DO

        for (int i = start + pos; i != start - 1; i--) {

            if (i < 0) {
                i = i + cir.length;
            }

            cir[i] = cir[i - 1];
        }

        size--;
        start++;
    }

    //This method will check whether the array is palindrome or not
    public void palindromeCheck() {
        //TO DO

        boolean result = true;

        for (int i = 0; i < size / 2; i++) {

            if (cir[(start + i) % cir.length] != cir[(start + size - 1 - i) % cir.length]) {

                result = false;
                break;
            }
        }

        if (result) {

            System.out.println("This is a palindrome.");
        } else {

            System.out.println("This is not a palindrome.");
        }
    }

    //This method will sort the values by keeping the start unchanged
    public void sort() {
        //TO DO

        for (int i = 0; i < size - 1; i++) {

            int min = (i + start) % cir.length;

            for (int j = i + 1; j < size; j++) {

                if ((int) cir[(j + start) % cir.length] < (int) cir[min]) {

                    min = (j + start) % cir.length;
                }
            }

            Object temp = cir[(i + start) % cir.length];
            cir[(i + start) % cir.length] = cir[min];
            cir[min] = temp;
        }
    }

    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k) {
        //TO DO

        if (size != k.size) {

            return false;
        }

        for (int i = 0; i < size; i++) {

            if (cir[(i + start) % cir.length] != k.cir[(i + k.start) % k.cir.length]) {

                return false;
            }
        }

        return true; // Remove this line
    }
}
