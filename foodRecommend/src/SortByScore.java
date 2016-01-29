import java.util.Comparator;
import java.util.List;

class SortByScore implements Comparator {
 public int compare(Object o1, Object o2) {
  userFoodScoreFormat s1 = (userFoodScoreFormat) o1;
  userFoodScoreFormat s2 = (userFoodScoreFormat) o2;
  return (int) (s1.score-s2.score);
//  String str1= o1.score;
//  String str2=(String) s2.get(2);
//  long ls1 = Long.parseLong(str1);
//  System.out.println("ls1 "+ls1);
//  long ls2 = Long.parseLong(str2);
//  System.out.println("ls2 "+ls2);
//  if (s1.score > s2.score)
//   return 1;
//  else
//	  return 0;
  
 }
}