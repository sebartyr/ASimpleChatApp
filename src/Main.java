import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(bf.readLine());
    }
}