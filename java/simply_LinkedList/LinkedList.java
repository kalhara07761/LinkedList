public class LinkedList {
    Node head;
    //add  element at the end
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    // add a element at the end 
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;
    }
    //inster at any location 
    public void insterAt(int data , int index){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        //if index is "0" using insterAtStart methord to add the value to the list
        if(index == 0){
            insertAtStart(data);
        }
        else{

        Node n = head;

        for (int i=0 ; i < index -1 ; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }

    //delete element from the list 
    public void delete(int index){
        if(index == 0){

            head = head.next;

        }else{

            Node n = head;
            Node n1 = null;

            for (int i=0 ; i < index -1 ; i++){
                n = n.next;
            }

            n1 = n.next;
            n.next = n1.next;
            System.out.println("n1 : " + n1);
        }
    }

    //print methord 
    public void print() {
        Node node = head;
        ClearConsole();
        System.out.println("------------------------------------------");
        System.out.println("-  value : address of the next node ===> -");
        System.out.println("------------------------------------------");
        while(node.next!=null){
            // value : address of the next node ===>
            System.out.print(node.data + " : " + node.next +  " ===> ");
            node =  node.next;
        }
        //last not of the list
        System.out.println(node.data +" : null");
    }

    // clear console / terminal before printing the output
    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
