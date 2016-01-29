import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
     
/**
 * @author 码农小江
 * H20121012.java
 * 2012-10-12下午11:40:21
 */
public class readTxtFile {
    /**
     * 功能：Java读取txt文件的内容
     * 步骤：1：先获得文件句柄
     * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
     * 3：读取到输入流后，需要读取生成字节流
     * 4：一行一行的输出。readline()。
     * 备注：需要考虑的是异常情况
     * @param filePath
     * @return 
     */
    public static List<List<String>> readTxtFile1(String filePath){
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    List<List<String>> listDatas = new ArrayList<List<String>>();  
                    while((lineTxt = bufferedReader.readLine()) != null){
                    	
                    	  String[] split = lineTxt.split(" ");  
                          List<String> lineDatas = new ArrayList<String>(Arrays.asList(split));  
//                          lineDatas.remove(0);//删除第一个元素,比如：@、#  
                          listDatas.add(lineDatas);  
                    	
//                        System.out.println(lineDatas);
                    }
                    System.out.println(listDatas.size());
                    return listDatas;
//                    read.close();
        }else{
            System.out.println("找不到指定的文件");
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
		return null;
     
    }     
//    public static void main(String argv[]){
//        String filePath = "G:/HHX/美食推荐/txt/info.txt";
////      "res/";
//        readTxtFile1(filePath);
//    }

}
