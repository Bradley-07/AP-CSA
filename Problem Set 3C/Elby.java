public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    
    public int findKeyword(String statement, String goal, int startPos) {
  String phrase = statement.trim().toLowerCase();
  goal = goal.toLowerCase();

  
  int goalPos = phrase.indexOf(goal, startPos);

 
  while (goalPos >= 0) {
         
         String before = " ", after = " ";

         if (goalPos > 0) {
            before = phrase.substring(goalPos - 1, goalPos);
      }

      if (goalPos + goal.length() < phrase.length()) {
         after = phrase.substring(goalPos + goal.length(), 
                                  goalPos + goal.length() + 1);
      }

      

      
      if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&                
          ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
         return goalPos;
      }

      
      goalPos = phrase.indexOf(goal,goalPos + 1);
   }
   return -1;
}

public String transformYouMeStatement(String statement) {
    	
    	statement = statement.trim();
    	String lastChar = statement.substring(statement.length() - 1);
    	if (lastChar.equals(".")) {
        	statement = statement.substring(0, statement.length() - 1);
    	}

    	int posOfYou = findKeyword(statement, "you", 0);
    	int posOfMe  = findKeyword(statement, "me",  posOfYou + 3);

    	String restOfStatement = statement.substring(posOfYou + 3, posOfMe).trim();
    	return "What makes you think that I " + restOfStatement + " you?";
}

public String transformIWantToStatement(String statement) {
    	
    	statement = statement.trim();
    	String lastChar = statement.substring(statement.length() - 1);
    	if (lastChar.equals(".")) {
        	statement = statement.substring(0, statement.length() - 1);
    	}
    	int pos = findKeyword(statement, "I want to", 0);
    	String restOfStatement = statement.substring(pos + 9).trim();
    	return "What would it mean to " + restOfStatement + "?";
}

public String transformIWantStatement(String statement){
   
    	statement = statement.trim();
    	String lastChar = statement.substring(statement.length() - 1);
    	if (lastChar.equals(".")) {
        	statement = statement.substring(0, statement.length() - 1);
    	}
    	int pos = findKeyword(statement, "I want", 0);
    	String restOfStatement = statement.substring(pos + 6).trim();	
        return "Would you really be happy if you had "+ restOfStatement + "?";
}

public String transformIMeStatement(String statement) {
    	statement = statement.trim();
    	String lastChar = statement.substring(statement.length() - 1);
    	if (lastChar.equals(".")) {
        	statement = statement.substring(0, statement.length() - 1);
    	}
    	int pos = findKeyword(statement, "I", 0);
    	int pos2 = findKeyword(statement, "you", 0);
    	String restOfStatement = statement.substring(pos + 1, pos2).trim();	
        return "Why do you "+ restOfStatement + " me?";
    	//return "Why do you...";
}

    
    public String getResponse(String statement) {
        String response = "";
       if(statement.trim().length()==0){ 
        response = "please say something :( ";
        }else if (findKeyword(statement, "you", 0) >= 0 && findKeyword(statement, "you", 0) < findKeyword(statement, "me", 0)) {
            response = transformYouMeStatement(statement);
        } else if (findKeyword(statement, "I", 0) >= 0 && findKeyword(statement, "I", 0) < findKeyword(statement, "you", 0))  {
            response = transformIMeStatement(statement);       
        } else if (findKeyword(statement, "I want to", 0) >= 0) {
            response = transformIWantToStatement(statement);       
        } else if (findKeyword(statement, "I want", 0) >= 0) {
            response = transformIWantStatement(statement);       
        } else if (findKeyword(statement, "mother", 0) >= 0 
        || findKeyword(statement, "father", 0) >= 0 
        || findKeyword(statement, "sister", 0) >= 0
        || findKeyword(statement, "brother", 0) >= 0) {
            response = "Tell me more about your family.";
        } else if (findKeyword(statement, "dog", 0) >= 0 || findKeyword(statement, "cat", 0) >= 0)  {
            response = "Tell me more about your pets";
        } else if (findKeyword(statement, "no", 0) >= 0) {
            response = "Why so negative?";
        } else if (findKeyword(statement, "Bradley", 0) >= 0 || findKeyword(statement, "bradley", 0) >= 0)  {
            response = "I mess with Bradley, he seems interesting!";
        } else if (findKeyword(statement, "craving", 0) >= 0 || findKeyword(statement, "food", 0) >= 0)  {
            response = "You should try new food";
        } else if (findKeyword(statement, "sleep", 0) >= 0 || findKeyword(statement, "bed", 0) >= 0)  {
            response = "You should head to sleep";
        } else if (findKeyword(statement, "play", 0) >= 0 || findKeyword(statement, "sport", 0) >= 0)  {
            response = "Interesting sport, are you good at it?";
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "mhmm";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "thats crazy!!!";
        } else if (whichResponse == 5) {
            response = "Nah, no way....";
        } else if (whichResponse == 6) {
            response = "For real?";
        }

        return response;
    }
}