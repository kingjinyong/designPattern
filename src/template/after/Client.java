package template.after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result + number;
            }
        });
        System.out.println(result);
    }
}
