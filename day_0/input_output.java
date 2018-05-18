import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
  System.out.println("Enter your name: ");
  InputStreamReader inp = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(inp);
  String name = br.readLine();
  System.out.println("Your name is: "+name);

  }
}