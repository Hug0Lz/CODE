
import java.util.ArrayList;
import java.util.List;
public class TaskManager {
    private List<String> tasksList;
    public TaskManager() {
        tasksList = new ArrayList<>();
    }
    public void addTask(String task) {
        tasksList.add(task);
    }

    public void removeTask(String task){
        removeTask(task);
    }
    public void printTasks() {
        System.out.println("Lista de tareas:");
        for (String task : tasksList) {
            System.out.println("- " + task);
        }
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasksList=" + tasksList +
                '}';
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Hacer la compra");
        taskManager.addTask("Estudiar para el examen");
        taskManager.printTasks();
    }
}
