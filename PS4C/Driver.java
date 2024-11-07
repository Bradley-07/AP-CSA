/**
 * Bradley Phan
 * Problem set 4C
 * Oct 28th 2024
 */


public class Driver{
    public static void main(String[]args){
        
    double total = Review.totalSentiment("SimpleReview.txt");
    //System.out.println(total);
    
    int rating = Review.starRating("SimpleReview.txt");
    //System.out.println(rating);
    
    String fakeReview = Review.fakeReview("SimpleReview.txt");
    System.out.print(fakeReview);
    
        

    }
}
