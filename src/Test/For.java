package Test;

public class For {
    public static void main(String[] args) {
        int[] data = {1,2,3};
        for(int i=0;i<data.length;i++){
            System.out.println("for:"+data[i]);
        }
        for(int i:data){
            System.out.println("foreach:"+i);
        }
    }
}
