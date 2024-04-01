// Interface
public interface FacialRecognition {
    void captureImage();
    void detectFaces();
    String recognizeFace();
}

// Abstract Class
public abstract class AbstractFacialRecognition implements FacialRecognition {
    // Common functionality
    public void processImage() {
        // Implement image processing logic
    }
    
    public void accessDatabase() {
        // Implement database access logic
    }
}

// Concrete Class
public class SmartDoorbell extends AbstractFacialRecognition {
    // Implement methods from FacialRecognition interface
    public void captureImage() {
        // Capture image using camera
    }
    
    public void detectFaces() {
        // Detect faces in captured image
    }
    
    public String recognizeFace() {
        // Recognize face using facial recognition algorithm
        return "John Doe"; // Dummy implementation
    }
    
    // Additional methods for doorbell functionality
    public void ringDoorbell() {
        // Ring the doorbell
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        SmartDoorbell doorbell = new SmartDoorbell();
        doorbell.captureImage();
        doorbell.detectFaces();
        String recognizedPerson = doorbell.recognizeFace();
        
        if (recognizedPerson != null) {
            System.out.println("Welcome, " + recognizedPerson + "!"); // Open the door
            doorbell.ringDoorbell();
        } else {
            System.out.println("Unknown person detected!"); // Do not open the door
        }
    }
}
