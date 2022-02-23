package NodePack;
public class MainNode {

  public static void main(String[] args) {
    Node node1 =new Node(); // Node creation
    node1.num = 14; // Assign a value to a node

    Node node2 = new Node();
    node2.num = 59;

    node1.next = node2; // node1 node2'yi gösteriyor
    node2.next = null; // Son düğüm bir şey göstermiyorsa null denilir.

    Node temp = node1;

    while (temp != null){ // Düğümlerin üzerinde dolaşma işlemi (travers)
      System.out.println(temp.num);
      temp = temp.next;
    }

  }
}