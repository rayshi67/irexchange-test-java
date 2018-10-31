package au.com.irexchange.service;

public interface CountService {
	
    /**
     * Initialize the circle with children allocated with IDs
     */
    void initialize();
    
    /**
     * Kick off the process to remove children until the last one
     */
    void process();
    
    /**
     *  Print out the summary report
     */
    void report();

}
