import main.omnihome.singleton.CloudConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Smart Hub OmniHome initialization starts ------ ");
        CloudConnection connection1 = CloudConnection.getInstance();
        CloudConnection connection2 = CloudConnection.getInstance();

        System.out.println("First CloudConnection instance memory address at: " + connection1);
        System.out.println("Second CloudConnection instance memory address at: " + connection2);
        if (connection1 == connection2) {
            System.out.println("Both instances are the same object.");
        }

        connection1.connect();
    }
}