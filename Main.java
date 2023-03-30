import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> examScores= new HashMap<String, Integer>();
  	//put method o put something in our HashMaps
		//ex:"Math os pur key and 80 is the integer"
		examScores.put("Math",80);
		examScores.put("English",75);
		examScores.put("History",86);
		examScores.put("Sociology",76);
		//Also we may insert a new Key with a ddifferent value with pit.IfAbsent Method.
		examScores.putIfAbsent("Health and Nutrition",85);
		//Or we can replace a key with the replace method
		examScores.replace("Math",70);
		//	For Each loops with Hasmaps. eX: examScores.forEach((subject,score)->{System.out.println(Subject +"-"+score);
		//We can loop over our hasmap and update our value for each score.minusing 10 from each score of each subject/key.
		examScores.forEach((subject,score)->{
			examScores.replace(subject,score -10);
		});
		System.out.println(examScores.toString());
	}
}