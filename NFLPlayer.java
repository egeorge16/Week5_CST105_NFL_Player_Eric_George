 /**Program: NFLPlayer
 * File: NFLPlayer.java
 * Summary: Create a NFL player object with 
 * multiple getters and setters for various
 * player stats.
 * Author: Eric George
 * Date: December 9, 2018
 */
public class NFLPlayer {
    //Declare variable to be used for players
    public String name;
    public int age;
    public double height;
    public double weight;
    public int passingTouchDowns;
    public int rushingTouchDowns;
    public int passingAttempts;
    public int rushingAttempts;
    public double passingYards;
    public double rushingYards;
    public int fumbles;
    public int lostFumbles;
    public int completions;
    public double rating;
    //Create Player object with no args
    public NFLPlayer() {
    }
    //Create Player object with args defined
    public NFLPlayer(String name, int age, double height, double weight, int passingTouchDowns, int passingAttempts,
            int rushingAttempts, int rushingTouchDowns, double passingYards, double rushingYards, int fumbles,
            int lostFumbles, int completions, double rating) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.passingTouchDowns = passingTouchDowns;
	this.rushingTouchDowns = rushingTouchDowns;
	this.passingAttempts = passingAttempts;
	this.rushingAttempts = rushingAttempts;
	this.passingYards = passingYards;
	this.rushingYards = rushingYards;
	this.fumbles = fumbles;
	this.lostFumbles = lostFumbles;
	this.completions = completions;
	this.rating = rating;
    }
    //Overide toString method
    @Override
    public String toString() {
        return name;
    }  
    //Establish getters and setters for player stats
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getPassingTouchDowns() {
        return passingTouchDowns;
    }
    public void setPassingTouchDowns(int passingTouchDowns) {
        this.passingTouchDowns = passingTouchDowns;
    }
    public int getRushingTouchDowns() {
        return rushingTouchDowns;
    }
    public void setRushingTouchDowns(int rushingTouchDowns) {
        this.rushingTouchDowns = rushingTouchDowns;
    }
    public int getPassingAttempts() {
        return passingAttempts;
    }
    public void setPassingAttempts(int passingAttempts) {
        this.passingAttempts = passingAttempts;
    }
    public int getRushingAttempts() {
        return rushingAttempts;
    }
    public void setRushingAttempts(int rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
    }
    public double getPassingYards() {
        return passingYards;
    }
    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }
    public double getRushingYards() {
        return rushingYards;
    }
    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }
    public int getFumbles() {
        return fumbles;
    }
    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
    public int getLostFumbles() {
        return lostFumbles;
    }
    public void setLostFumbles(int lostFumbles) {
        this.lostFumbles = lostFumbles;
    }
    public int getCompletions() {
        return completions;
    }
    public void setCompletions(int completions) {
        this.completions = completions;
    }
    public int getPassingTouchDownPercent() {
        return passingTouchDowns / passingAttempts;
    }
    public double getPassingYardAverage() {
        return passingYards / passingAttempts;
    }
    public double getRushingYardAverage() {
        return rushingYards / rushingAttempts;
    }
    public double getCompletionPercent() {
        return completions / passingAttempts;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    //Create main method for testing
    public static void main(String[] args) {
        //Test no arg first on Brady
        NFLPlayer brady = new NFLPlayer();
        brady.setName("Tom Brady");
        System.out.println("Testing no-arg constructor, setters, & toString method:\n" + brady.toString());
        //Test arg second on Rodgers
        NFLPlayer rodgers = new NFLPlayer("Aaron Rodgers", 35, 73, 225, 0, 1, 261, 7, 0, 1268, 4, 1, 0, 99.6);
        rodgers.setHeight(74);
        rodgers.setPassingTouchDowns(23);
        System.out.println("\nTesting narg constructor, getters, & setters:\nRodgers is " + rodgers.getHeight()
                + " inches tall and he has " + rodgers.getPassingTouchDowns() + " touchdowns from passing, and his rating is "
                + rodgers.getRating());
    }
}

