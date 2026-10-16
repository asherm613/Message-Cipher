import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        int w = 0;
        int k = 0;
        int z = 0;
        int u = 0;
        int l = 0;
        int x = 0;
        String g;
        String h;
        boolean state = true;
        String[] decode = {
    "", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
    ".", ",", "!", "?", "'", "\"", ":", ";", "-", "_",
    "(", ")", "[", "]", "{", "}", "/", "\\", "@", "#",
    "$", "%", "^", "&", "*", "+", "=", "<", ">"
    };
int randomIndex = (int)(Math.random() * decode.length);
        ArrayList<Object> output = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose encryption method:\n type 1 for number to letter:\n type 2 for length based: \n type 3 for reverse word: ");
        int select = scan.nextInt();
        if (select == 1) {
            System.out.print("1 for encrypt 2 for decrypt: ");
            z = scan.nextInt();
            if (z == 1) {
            while (state) {
            g = scan.nextLine();
            for (w = 0; w < 57; w++) {
                for (u = 0; u <= g.length()-1; u++) {
                    if (g.substring(u, u + 1).toUpperCase().equals(decode[w]) && !(g.equals("exit"))) {
                    System.out.print(w + " ");
                    output.add(w);
                    output.add(" ");
                    }
                }
            }
            if (g.equals("exit")) {
                state = false;
            }
            }
        }
            else if (z == 2) {
            while (state) {
            l = scan.nextInt();
            for ( w = 0; w < 57; w++) {
                if (l == w && !(l == -1)) {
                    System.out.println(decode[w]);
                    output.add(decode[w]); 
                }
            }
            if (l == -1) {
                state = false;
            }
        }
        }
    }
        if (select == 2) {
            System.out.print("1 for encrypt 2 for decrypt: ");
            z = scan.nextInt();
            scan.nextLine();
            if (z == 1) {
                System.out.println(" ");
                while (state) {
                g = scan.nextLine();
                for (w = 0; w < 57; w++) {
                    if (g.substring(0, 1).toUpperCase().equals(decode[w]) && !(g.equals("exit"))) {
                    for (x = 0; x < w; x++)
                        System.out.print(decode[randomIndex]);
                        output.add(decode[randomIndex]);
                    }
            if (g.equals("exit")) {
                state = false;
            }
        }
        }
    }
            if (z == 2) {
            while (state) {
            g = scan.nextLine();
            for ( w = 0; w < 57; w++) {
                if (g.length() == w && !(g.equals("exit"))) {
                    System.out.println(decode[w]);
                    output.add(decode[w]); 
                }
            }
            if (g.equals("exit")) {
                state = false;
            }
        }
        }
        }
        if (select == 3) {
            scan.nextLine();
            h = scan.nextLine();
            for (k = h.length() -1; k >= 0; k--) {
                System.out.print(h.substring(k, k+1));
            }
        }
        else {   
    for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i));
            }
        }
    }
}