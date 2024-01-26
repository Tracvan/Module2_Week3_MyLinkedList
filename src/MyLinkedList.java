public class MyLinkedList<E> {
    private Node head;

    public int getSize() {
        return size;
    }

    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(E element) {
        Node newNode = new Node(element);
        Node current = head;
        if (head == null) {
            head = newNode;
            size++;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }

    public void addFirst(E e) {
        Node addFirstNode = new Node(e);
        addFirstNode.next = head;
        head = addFirstNode;
        size++;
    }

    public boolean remove(Object e) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.data.equals(e)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }
    public E remove(int index) {
      if( index < 0 || index > size){
          throw new IndexOutOfBoundsException();
      }
      E removedElement = null;
      if(index == 0){
          removedElement = (E)head.data;
          head = head.next;
          size--;
          return removedElement;
      }
      Node current = head;
      for(int i=0; i<index-1; i++){
          current = current.next;
      }
      current.next = current.next.next;
      size--;
      return removedElement;
    }
    public int size(){
        return size;
    }
    public E clone(){
        Node newList = new Node(size);
        newList = head;
        for ( int i=0; i<size; i++){
            newList = newList.next;
        }
        return (E)newList;
    }
    public boolean contains(E o){
        boolean result = false;
        Node current = head;
        for(int i=0; i<size; i++){
            if(current.data.equals(o)){
                result = true;
                break;
            }
        }
        return result;
    }
    public int indexOf(E o){
        Node current = head;
        int result = -1;
        for(int i = 0; i<size; i++){
            if(current.data.equals(o)){
                result = i;
                break;
            }
            current = current.next;
        }
        return result;
    }
    public E get(int i){
        if(i<0 || i >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;

        for (int j = 0; j<i; j++){
            current = current.next;
        }
        return (E)current.data;
    }
    public E getFirst(){
        return (E)head.data;
    }
    public E getLast(){
        Node current = head;
        for(int i = 0; i<size-1; i++){
            current = current.next;
        }
        return (E)current.data;
    }
    public void clear(){
        head = null;
        size =0;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

}