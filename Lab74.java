interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {

    @Override
    public void performEvent() {
        System.out.println("Performing event...");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse clicked event");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse pressed event");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse released event");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse moved event");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse dragged event");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key pressed event");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key released event");
    }
}

public class Lab74 {
    public static void main(String[] args) {
        EventDemo eventDemo = new EventDemo();
        eventDemo.performEvent();
        eventDemo.mouseClicked();
        eventDemo.mousePressed();
        eventDemo.mouseReleased();
        eventDemo.mouseMoved();
        eventDemo.mouseDragged();
        eventDemo.keyPressed();
        eventDemo.keyReleased();
    }
}