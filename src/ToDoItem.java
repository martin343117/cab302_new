public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    public ToDoItem(String des){
        description=des;
        isDone=false;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String des){
        description= des;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public void setIsDone(boolean done){
        isDone=done;
    }
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}