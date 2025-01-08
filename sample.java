public class sample {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "sanjana";
        String result = str+ " " +str2;
        System.out.println(result+ " How are you!!");
        character(result);   
}
     public static void character(String result){
        for(int i=0;i<result.length();i++){
            System.out.print(result.charAt(i) + " ");
     }
}
}
