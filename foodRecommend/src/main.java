import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String argv[]){
    	
        String filePath = "G:/HHX/ÃÀÊ³ÍÆ¼ö/txt/user-food-score.txt";
        readTxtFile infoUser=new readTxtFile();
        List<List<String>> DataString= infoUser.readTxtFile1(filePath);
        sortedFoodId test=new sortedFoodId();
        test.sortFoodScore(DataString, 0002, 2);
         
    }
	
}
