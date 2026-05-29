package Jobsheet9;

public class StackSuratMahasiswa07 {
    suratMahasiswa07[] stack;
    int top;
    int size;

    StackSuratMahasiswa07(int size) {
        this.size = size;
        stack = new suratMahasiswa07[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(suratMahasiswa07 srt) {

        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    suratMahasiswa07 pop() {

        if (!isEmpty()) {
            suratMahasiswa07 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    suratMahasiswa07 peek() {

        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    boolean cariSurat(String nama) {

        for (int i = 0; i <= top; i++) {

            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }

        return false;
    }
}
