package linkedList;

class SingleNode{
    int value;
    SingleNode next;

    public SingleNode(){}
    public SingleNode(int value){this.value=value;}
    public SingleNode(int value, SingleNode node){this.value=value; this.next=node;}
}

public class ReverseTheLinkedList {
    public static void main(String[] args) {
        SingleNode singleNode = new SingleNode(1);
        SingleNode singleNode1 = new SingleNode(2, singleNode);
        SingleNode singleNode2 = new SingleNode(3, singleNode1);
        SingleNode singleNode3 = new SingleNode(4, singleNode2);
        SingleNode singleNode4 = new SingleNode(5, singleNode3);
        printNodes(singleNode);
        printNodes(reverseNode(singleNode));

    }

    public static void printNodes(SingleNode iterativeNode){
        while (iterativeNode!=null){
            System.out.println(iterativeNode.value);
            iterativeNode=iterativeNode.next;
        }
    }

    public static SingleNode reverseNode(SingleNode node){
        SingleNode currentNode = node;
        SingleNode previousNode= null;

        while (currentNode!=null){
            SingleNode tempNode = currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=tempNode;
        }

        return currentNode;
    }

}
