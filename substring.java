public class substring {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String sub = str.substring(7);
        System.out.println(sub);
        substring(str,3,9);
        }
        public static void substring(String str, int start, int end) {
            String hu="";
            for(int i=start; i<end ; i++)
            {
                hu += str.charAt(i);
            }
            System.out.println(hu);
        }
}
