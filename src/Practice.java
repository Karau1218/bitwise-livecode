public class Practice {
    public static void main(String[] args) {
        int color = 0xc4246D;
        int blueMask = 0x000FF;

        int blue = color & blueMask;

        int greenMask = 0x00FF00;
        int green = (color & greenMask) >> 8;

            System.out.println(Integer.toHexString(green)); 
 
          System.out.println(Integer.toHexString(blue)); // you get 6D
          int x = 21;
       // int x = 0b10101;
        
        int p = 0b11001;

        int q = x & p;
        System.out.println(Integer.toBinaryString(q)) ;
       
        int y = 0xcf4e;
        int z = 94;


       System.out.println(Integer.toBinaryString(z)) ; // prints out as binary 
       System.out.println(Integer.toHexString(z)) ; // prints out as hex 
       System.out.println(Integer.toHexString(z)) ; // prints out as hex 


    }
}
    