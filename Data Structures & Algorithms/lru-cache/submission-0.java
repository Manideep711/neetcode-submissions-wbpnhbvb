class Node{
    public int key;
    public int value;
    public Node prev;
    public Node next;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }
}

class LRUCache {
private Map<Integer,Node> cacheMap;
private Node head;
private Node tail;
private int capacity;
   public void add(Node node){
    Node nextNode=head.next;
    head.next=node;
    node.prev=head;
    node.next=nextNode;
    nextNode.prev=node;
   }
   public void remove(Node node){
    Node prev=node.prev;
    Node next=node.next;
    prev.next=next;
    next.prev=prev;
   }
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.cacheMap=new HashMap<>();
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    
    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node node=cacheMap.get(key);
        remove(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {

    if (cacheMap.containsKey(key)) {
        Node existingNode = cacheMap.get(key);
        remove(existingNode);
        cacheMap.remove(key);
    }

    if (cacheMap.size() == capacity) {
        Node lru = tail.prev;
        remove(lru);
        cacheMap.remove(lru.key);
    }

    Node newNode = new Node(key, value);
    add(newNode);
    cacheMap.put(key, newNode);
}
}
