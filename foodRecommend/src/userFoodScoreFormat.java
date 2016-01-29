class userFoodScoreFormat {
int userId;
int foodId;
long score;
userFoodScoreFormat(int userId,int foodId,long score){
	this.userId=userId;
	this.foodId=foodId;
	this.score=score;
}
public String toString(){
return userId+" "+foodId+" "+score;
}
}
