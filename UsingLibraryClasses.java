import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
/**
 * Write a description of class UsingLibraryClasses here.
 *
 * @author (Larisa Saitova)
 * @version (1.0)
 */
public class UsingLibraryClasses
{
    // instance variables - replace the example below with your own
    private String name;
    private Random age;
    private HashMap<String, String> responder;
    private HashSet <String> mySet;

    /**
     * Constructor for objects of class UsingLibraryClasses
     */
    public UsingLibraryClasses(String Name, int Age)
    {
        // initialise instance variables
              age = new Random();
              name=Name;
            responder = new HashMap<>();
            mySet = new HashSet<>();
    }
    
  
    /**
     * This method creates a fixed up version of the users string 
     * with only lower case letters and no spaces
     */
    public void fixName()
    {
        name=name.toLowerCase();
        name=name.trim();
    }
    /**
     * Changes the number age to a random number within 0 
     * and the entered age
     */
    public void changeAge(){
    int 
    int Age = age.nextInt(30);
    }
    
    /**
     * Using HashMap put method to create a pair object
     * @param writeHere your statement
     */public void putInStatement(String writeHere){
    responder.put("Hello","Hi. How can I help you!");
    }
    
    /**
     * @return the value of the key entered 
     */public String getResponse(){
    String response = responder.get("Hello");
    return response;
    }
    public void addSet (){
    mySet.add("Blue");
    mySet.add("Red");
    mySet.add("Yellow");
    for(String HashSet: mySet){
    System.out.println(HashSet);
    }
    }
}
