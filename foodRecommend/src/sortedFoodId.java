import java.io.Reader;
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortedFoodId {

	public static void sortFoodScore(List<List<String>> userFoodScore,int userId,int topN) {

		  Comparator<List> comparator = new Comparator<List>(){
			   public int compare(List s1, List s2) {
//				   List s1 = (List) o1;
//				   List s2 = (List) o2;
				   String str1=(String) s1.get(2);
				   String str2=(String) s2.get(2);
				   long ls1 = Long.parseLong(str1);
				   long ls2 = Long.parseLong(str2);
				   if (ls1 > ls2)
					   return 1;
				   else if (ls1 < ls2)
				   		return -1;
				   else 
					   return 0; 
			   }

			  };
		
		//首先要根据 要查找的用户id来找出对应用户的所有数据
	 ArrayList<ArrayList<String>> specialUserData=new ArrayList<ArrayList<String>>();
	 
	 int totalNum=userFoodScore.size();
//	 int foodId;
//	 long score;
//	 List tempList = null;
	for(int i=0;i<totalNum;i++) {
		ArrayList tempList = (ArrayList) userFoodScore.get(i);
		specialUserData.add(tempList);
		
		/*for (int j=0; j<userFoodScore.get(i).size(); j++){
			
		}
		 if(Integer.parseInt(userFoodScore.get(i).get(0))==userId)
		 {
			 tempList=userFoodScore.get(i);
			 foodId=Integer.parseInt((String) tempList.get(1));
			 score=Integer.parseInt((String) tempList.get(2));
			 userFoodScoreFormat transf=new userFoodScoreFormat(userId, foodId, score);

			 specialUserData.add(transf);
			 tempList=null;
		 }*/
	}
 
//对该用户的Score项进行排序
			 
	 //SortByScore comp=new SortByScore();
	 Collections.sort(specialUserData,comparator);
	 display(specialUserData);
	 
//     System.out.println(specialUserData);
//  for (List List : specialUserData) {
////	  System.out.println(List);
//  }
 }
	 static void display(ArrayList<ArrayList<String>> specialUserData){
		 for(ArrayList al:specialUserData)
		 System.out.println(al);
		 }
}

