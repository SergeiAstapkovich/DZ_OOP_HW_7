package OOP_HW_7;

public class LogOperationListener implements OperationListener {
    public void onOperationPerformed(String operation) {
        System.out.println("Операция " + operation);
    }
}
