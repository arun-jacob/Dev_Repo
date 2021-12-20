public class stack {
    public static void main(String[] args) {
        int head=-1;

        int a[]=new int[10];
        int element=1;
        head =add(head,element,a);
        //System.out.println(head);
        System.out.println(a);
    }

static int add(int head,int element,int[]a){

a[head+1]=element;
return head+1;

}

static int pop(int[] a,int head){

for(int i=0;i<head;i++){
a[i]=a[i+1];

}

return head-1;

}

}
