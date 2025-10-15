package com.pluralsight;

import java.time.LocalDate;

public class Task {
    // list of classmates in the test //

    // Instance variable
    private String title;
    private LocalDate dueDate;
    private boolean complete;
    private String urgency;//
    private String notificationMessage;
    private boolean reminder;
    public Task (String title) {
        this.title = title;
    }
    public String toString() {
        return "✓" + title;
    }
    public void markCompleted() {
    }
    // String title
    // LocalDate due  date
    // Boolean
    // Urgency
    // Reminder Yes or no (boolean)
    // String NotificationMessage
}
