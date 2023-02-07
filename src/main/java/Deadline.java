import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    private LocalDateTime by;

    public Deadline(String description, String by) {
        super(description);
        this.by = LocalDateTime.parse(by, DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy"));
    }

    @Override
    public String toString () {
        return "[D]" + super.toString() + "(by: " + this.by.format(DateTimeFormatter.ofPattern("HH:mm, EEEE, MMM dd yyyy")) + ")";
    }
}
