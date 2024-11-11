public class LinkedList {

    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void removeElement(int data) {
        if (head == null) {
            System.out.println("List is empty; nothing to remove.");
            return;
        }
        if (head.data == data) {
            head = head.next; // Update head to the next node
            return;
        }
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found");
            return;
        }
        previous.next = current.next;
    }

    public void insertElement(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int queryHead () {
        if (head == null) {
            System.out.println("List is empty; nothing to query.");
            return -1;
        }
        return head.data;
    }

    public int length () {
        if (head == null) {
            return 0;
        } else {
            Node current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public int findnth (int n) {
        if (head == null) {
            System.out.println("List is empty; nothing to find.");
            return -1;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < n) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Element not found");
            return -1;
        }
        return current.data;
    }

    public bool detectCycle () {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
