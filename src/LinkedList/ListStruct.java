package LinkedList;

public class ListStruct {
    Knot head = null;
    Knot tail = null;

    void added(int node){
        Knot nodeX = new Knot();
        nodeX.value = node;
        nodeX.next = null;

        if (head == null){
            head = nodeX;
            tail = nodeX;
            System.out.println("Listeye İlk Düğüm Eklendi");
        }else {
            tail.next = nodeX ;
            tail = nodeX;
            System.out.println("Listeye Yeni Bir Düğüm Eklendi");
        }
    }
    void knotList(){
        if (head == null){
            System.out.println(" Liste Boş ");
        }else {
            Knot temp = head;
            System.out.print("\nStart -> ");
            while (temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;

            }
            System.out.print(" Stop");
        }
    }
}
