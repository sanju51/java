

public class substring {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String sub = str.substring(7);
        System.out.println(sub);
        
        String res[]={"apple","banana","zygh","orange"};
        String largest=res[0];
        for(int i=1; i< res.length; i++){
            if(largest.compareTo(res[i])<0){
            largest=res[i];
            }
        }
        System.out.println(largest);

}}
