import java.io.*;

public class IO {
    public static void main(String[] args) {

    }
    public static void copyBinaryFile(String source, String target) throws Exception{
        File file1 = new File(source);
        File file2 = new File(target);
        InputStream is = null;
        OutputStream os = null;
        try {
            if(!file1.exists()){
                throw new FileNotFoundException();
            }
            if (file2.exists()){
                throw new Exception("có file rồi");
            }
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes)) > 0){
                os.write(bytes, 0 ,length);
            }
        }
        finally {
            is.close();
            os.close();
        }
    }
}
