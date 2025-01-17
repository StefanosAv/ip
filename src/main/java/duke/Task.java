package duke;

public class Task {
    protected String description;
    protected boolean isDone;
    protected String tag;

    /**
     * Class constructor.
     *
     * @param description of the task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.tag = "";
    }

    /**
     * Returns "X" if the task is done or " " otherwise.
     *
     * @return "X" if the task is done or " " otherwise.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    /**
     * Returns true if the task is marked as done, or false otherwise.
     *
     * @return true if the task is marked as done, or false otherwise.
     */
    public boolean isDone() {
        return this.isDone;
    }

    /**
     * Marks the task as done.
     */
    public void mark() {
        this.isDone = true;
    }

    /**
     * Marks the task as not done.
     */
    public void unmark() {
        this.isDone = false;
    }

    /**
     * Sets the tag of the task.
     *
     * @param tag description of tag.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return ("[" + this.getStatusIcon() + "] " + this.description + "[tag: " + this.tag + "] ");
    }
}


