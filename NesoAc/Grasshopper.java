public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        /*
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        //two = null;
        //one = null;
        
        System.out.println(one.name);
        System.out.println(two.name);
        */
        
        int x = 5, j = 0;
        for (int i = 0; i < 3;) {
            do {
                i++;
                x++;
                if (x > 10)
                    break;
                x += 4;
                j++;

            } while (j <= 2);
        }
        
        System.out.println(x);


    }

    private String name;
}