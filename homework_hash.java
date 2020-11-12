import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;

public class homework_hash {

    //文件的hash值
    public static byte[] hashValue(InputStream is) throws Exception{
        byte[] buffer = new byte[1024];
        MessageDigest hash = MessageDigest.getInstance("SHA-1");
        int numread = 0;
        do{
            numread = is.read(buffer);
            if(numread>0){
                hash.update(buffer, 0, numread);
            }
        }while(numread!=-1);
        is.close();
        return hash.digest();
    }

    //读取文件的hash值
    public static void getHash(String path) throws FileNotFoundException{
        try{
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            byte[] sha1 = hashValue(is);
            String  result = "";
            for(int i =0;i<sha1.length;i++){
                result+=Integer.toString(sha1[i]&0xFF, 16);
            }
            System.out.println("hash value is " +result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //遍历
    public static void travel(String path) throws FileNotFoundException {
        File file = new File(path);
        File[] fl = file.listFiles();
        Arrays.sort(fl);
        for(int i=0;i<fl.length;i++) {
            if (fl[i].isFile()) {
                getHash(path + File.separator + fl[i].getName());
                System.out.println("file" + fl[i].getName());
            }
            if (fl[i].isDirectory()) {
                System.out.println("directory" + fl[i].getName());
                travel(path + File.separator + fl[i].getName());
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        try{
            String path = "/Users/zoechen/c++-vs code";
            travel(path);
            //getHash(path);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
