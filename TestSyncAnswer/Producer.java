//Problem requires display to vary
//Introduced Collections.shuffle() method to shuffle the items in the messages list

import java.util.*;
import java.util.concurrent.*;


class Producer
    implements Runnable
{
    private BlockingQueue<String> drop;
    List<String> messages = Arrays.asList(
        "Mares eat oats",
        "Does eat oats",
        "Little lambs eat ivy",
        "Wouldn't you eat ivy too?");
		// 	 Collections.shuffle(messages);

	//System.out.println(messages);
        
    public Producer(BlockingQueue<String> d) { this.drop = d; }
    
    public void run()
    {
        try
        {
	
		Collections.shuffle(messages); //Added Collection.shuffle method to change display
        	for (String s : messages)
                drop.put(s);
            drop.put("DONE");
        }
        catch (InterruptedException intEx)
        {
            System.out.println("Interrupted! " + 
                "Last one out, turn out the lights!");
        }
    }    
}

