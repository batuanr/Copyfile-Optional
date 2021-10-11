public class Main {
    public static void main(String[] args) throws Exception {
        try {
            IO.copyBinaryFile("demo.txt", "copy.txt");
        }catch (Exception e){
            System.out.println("lỗi rồi");
        }
    }
}
