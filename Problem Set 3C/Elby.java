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
    public String getResponse(String statement) {
        String response = "";

        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("dog")>=0 ||statement.indexOf("cat")>=0){
         response = "Tell me more about your pets";
        } else if (statement.indexOf("Bradley")>=0|| statement.indexOf("Mr")>=0){
        response = "He sounds like a great guy";
        } else if(statement.trim().length()==0){
        response = "Say something please";
        } else if (statement.indexOf("eat")>=0|| statement.indexOf("foods")>=0){
        response = "hmm, that sounds delicious";
        } else if (statement.indexOf("did")>=0){
        response = "impressive!!";
        }
        else {
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
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4){
            response = "wow";
        } else if (whichResponse == 5){
        response = "nice";
        } else if (whichResponse == 6){
        response = "Really??";
        }
        

        return response;
    }
}