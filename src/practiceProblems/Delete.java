package practiceProblems;

import java.util.logging.Logger;

class Delete {

    public void printCount() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   "  + i );
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class Runner extends Thread{

    boolean bExit = false;

    public void exit (boolean bExit){
        this.bExit = bExit;
    }

    @Override
    public void run() {

        while(!bExit) {

            System.out.println("Thread is running");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                //Logger.getLogger(ThreadTester.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}




