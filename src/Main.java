public class Main {
    public static void main(String[] args) {
        //1

        int A = 20, B = 20;
        int x;

        if(A >= 100){
            if(B <= 50)
                x = 1;
            else
                x = 0;
        }

        else
            x = 0;

        System.out.println(x);

        //2

        int y;

        if(A >= 100){
            if(B <= 50)
                y = 1;
            else
                y = 0;
        }
        else if (B >= 100){
            if (A <= 50)
                y = 1;
            else
                y = 0;
        }
        else
            y = 0;

        System.out.println(y);

    }
}