public class compress {
    public static void main(String[] args) {
        String str = "aaaaabbbbccccdeefgggghhhiiijkkkkklllmmmmmmmmmmmmnnnnoooopppppqqqrrrrrrsssssstuuuuuuuvvvvwwwwwxxxxyyyz";
        String compressed = compressString(str);
        System.out.println(compressed);
    }
    public static String compressString(String str){
        StringBuilder compressed = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            Integer c=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                c++;
                i++;
            }
            compressed.append(str.charAt(i));
            if(c>1){
            compressed.append(c.toString());
    }}
    return compressed.toString();
    }
    
}
