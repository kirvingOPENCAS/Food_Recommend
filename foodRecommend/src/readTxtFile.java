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
 * @author ��ũС��
 * H20121012.java
 * 2012-10-12����11:40:21
 */
public class readTxtFile {
    /**
     * ���ܣ�Java��ȡtxt�ļ�������
     * ���裺1���Ȼ���ļ����
     * 2������ļ��������������һ���ֽ���������Ҫ��������������ж�ȡ
     * 3����ȡ������������Ҫ��ȡ�����ֽ���
     * 4��һ��һ�е������readline()��
     * ��ע����Ҫ���ǵ����쳣���
     * @param filePath
     * @return 
     */
    public static List<List<String>> readTxtFile1(String filePath){
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//���ǵ������ʽ
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    List<List<String>> listDatas = new ArrayList<List<String>>();  
                    while((lineTxt = bufferedReader.readLine()) != null){
                    	
                    	  String[] split = lineTxt.split(" ");  
                          List<String> lineDatas = new ArrayList<String>(Arrays.asList(split));  
//                          lineDatas.remove(0);//ɾ����һ��Ԫ��,���磺@��#  
                          listDatas.add(lineDatas);  
                    	
//                        System.out.println(lineDatas);
                    }
                    System.out.println(listDatas.size());
                    return listDatas;
//                    read.close();
        }else{
            System.out.println("�Ҳ���ָ�����ļ�");
        }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
        }
		return null;
     
    }     
//    public static void main(String argv[]){
//        String filePath = "G:/HHX/��ʳ�Ƽ�/txt/info.txt";
////      "res/";
//        readTxtFile1(filePath);
//    }

}
