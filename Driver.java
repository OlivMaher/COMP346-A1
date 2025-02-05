/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         /*******************************************************************************************************************************************
          * TODO : implement all the operations of main class   																					*
          ******************************************************************************************************************************************/
        
        Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        
        Server objServer = new Server();                        /* Create a server object */
        Thread serverThread = new Thread(() -> objServer.run()); /* Create a server thread */
        serverThread.start();                                   /* Start the server thread */
        
        Client sendClient = new Client("sending");              /* Create a client object for sending transactions */
        Thread sendClientThread = new Thread(() -> sendClient.run()); /* Create a client thread for sending */
        sendClientThread.start();                               /* Start the sending client thread */
        
        Client receiveClient = new Client("receiving");         /* Create a client object for receiving transactions */
        Thread receiveClientThread = new Thread(() -> receiveClient.run()); /* Create a client thread for receiving */
        receiveClientThread.start();                            /* Start the receiving client thread */
        
        try {
            sendClientThread.join();                            /* Wait for the sending client thread to terminate */
            receiveClientThread.join();                         /* Wait for the receiving client thread to terminate */
            serverThread.join();                                /* Wait for the server thread to terminate */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\n Terminating network thread");
        objNetwork.disconnect(objNetwork.getClientIP());
        objNetwork.disconnect(objNetwork.getServerIP());
    }
}
