package uaslp.objetos.parcial1.listas;

public class LinkedListIterator {

    private Node currentnode;

    public LinkedListIterator(Node startNode){
        currentnode = startNode;
    }

    public boolean hasNext(){
        return currentnode !=  null;
    }

    public String next(){

        String data = currentnode.data;
        currentnode= currentnode.next;
        return data;
    }
}
