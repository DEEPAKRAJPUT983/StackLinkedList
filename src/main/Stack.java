package main;
    public class Stack {

        private static class Node{
            private int data;
            private Node next;
            public Node(int data, Node next ){
                this.data = data;
                this.next = next;
            }

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }
        private Node top = null;
        private int size = 0;

        public void push(int data){
            Node newNode = new Node(data, this.top);
            this.top = newNode;
            this.size++;
        }
        public int pop(){
            int response = -1;
            if(this.top != null) {
                response = this.top.getData();
                this.top = this.top.getNext();
                this.size--;
            }
            else{
                System.out.println("Stack is Empty!");
            }
            return response;
        }

        public static void main(String[] args) {
            Stack stack = new Stack();
            System.out.println(stack);
            for (int i = 0; i < 5 ; i++) {
                stack.push(i+1);
            }
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);

        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("[");
            Node temp = this.top;
            while (temp != null) {
                result.append(temp.getData());
                if(temp.getNext() != null){
                    result.append("-->");
                }
                temp = temp.getNext();
            }
            result.append("]");
            return result.toString();
        }
    }
