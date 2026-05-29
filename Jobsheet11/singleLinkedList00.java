package Jobsheet11;

public class singleLinkedList00 {
    Node00 head;
    Node00 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node00 tmp = head;
            System.out.println("Isi Linked List :\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, mahasiswa00 input) {
        Node00 ndInput = new Node00(input, null);
        Node00 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void inserAt(int index, mahasiswa00 input) {
        if (index < 0) {
            System.out.println("Indeks Salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node00 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node00(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    
}
