package sample;

/**
 * Created by stevenburris on 9/27/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        String checkBox = "[]";
        if (isDone) {
            checkBox = "[x]";
        }
        return String.format("%s %s", checkBox, text);
    }
}
