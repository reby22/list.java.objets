package uaslp.objetos.parcial1;

import uaslp.objetos.parcial1.listas.LinkedList;
import uaslp.objetos.parcial1.listas.LinkedListIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList team1=new LinkedList();
        LinkedList team2=new LinkedList();

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomon");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        LinkedListIterator iterator;

        iterator=team1.getIterator();

        while(iterator.hasNext())
        {
            String name=iterator.next();
            System.out.println(name);
        }
    }
}
