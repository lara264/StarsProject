/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [          ] <-- you
 * @version [          ] <-- today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {           
                if (i == 0 || i == h-1 || i+j == h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starXBox(int h) {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==h-1 || i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void twoStarBoxes(int h, int w) {
        int middleH = h/2;
        int middleW = w/2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                if ((j < middleW && i < middleH) || (j >= middleW && i >= middleH)) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }  
    }
    
    public static void starTriangle(int h) {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {               
                if (i == j || j == 0 || i == h-1 || i > j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        } 
    }
    
    public static void emptyTriangle(int h) {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {               
                if (i == j || j == 0 || i == h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        } 
    }
    
    public static void starTriangleUR(int h) {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {               
                if (i == j || j > i) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
    
    public static void isoscelesStarTriangleH(int h) {
        int w = 2*h - 1;
        
        int x = w/2;
        int y = w/2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {         
                if (x <= j && y >= j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            x--;
            y++;
            System.out.println();
        }   
    }
    
    public static void checkerBoard(int h, int w) {
        biggerCheckerBoard(h, w, 1);
    }
    
    public static void biggerCheckerBoard(int h, int w, int s) {
        for (int i=0; i<h*s; i++)
        {
            for (int j=0; j<w*s; j++)
            {               
                int a = i/s;
                int b = j/s;
                
                if ((a+b)%2 == 0) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        } 
    }
    
    public static void upsideDownCheckeredTriangle(int h) {
        int w = 2*h - 1;
        
        int x = 0;
        int y = w-1;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {         
                if ((x <= j && y >= j) && (i+j)%2 == 0) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            x++;
            y--;
            System.out.println();
        }   
    }
    
    public static void primeStars(int h) {        
        int x = 0;
        int count = 0;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {               
                if (isPrime2(x) && count < h) {
                    for(int y = 0; y <x; y++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    count++;
                }
                x++;
                //System.out.print(i + "" + j + " ");
            }
        }  
        
    }
    
    public static boolean isPrime2(int n)
    {
        if (n < 2) return false;
        if (n==2)        return true;
        else if (n%2==0) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n%i == 0) return false;
        }
        
        return true;
    }
    
    public static void fibonacciStars(int h) {
        //run fibanacci sequence to find how long the width should be
        int a = 0;
        int b = 1;
        int c = 1;
        
        int count = 0;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<h; j++)
            {               
                if (count < h) {
                    for (int random = 0; random < c; random++) {
                        System.out.print("*");
                    }
                    c = a+b;
                    a = b;
                    b = c;
                    System.out.println();
                    count++;
                }
                else System.out.print(" ");
                
                //System.out.print(i + "" + j + " ");
            }
            //System.out.println();
        } 
    }
    
    public static void starFlag() {
        //17 stars across, 20 R across
        //7 stars down, 4 Rs down 
        //37 stars across on bottom 3 rows, except row between them too
        
        //stars end at 7, 17
        
        for (int i=0; i<14; i++)
        {
            for (int j=0; j<38; j++)
            {               
                if (j < 17 && i < 7) System.out.print("*");
                else if (i%2 == 0) System.out.print("R");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        } 
        
    }

    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        starXBox(8);
        System.out.println();
        
        twoStarBoxes(6, 8);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(8);
        System.out.println();
        
        starTriangleUR(5);
        System.out.println();
        
        isoscelesStarTriangleH(10);
        System.out.println();
        
        checkerBoard(9, 15);
        System.out.println();
        
        biggerCheckerBoard(9, 8, 5);
        System.out.println();
        
        upsideDownCheckeredTriangle(7);
        System.out.println();
        
        primeStars(7);
        System.out.println();
        
        fibonacciStars(9);
        System.out.println();
        
        starFlag();
        System.out.println();
    }
     
}