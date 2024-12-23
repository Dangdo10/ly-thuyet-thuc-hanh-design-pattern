package org.example.behavioral.chain_of_responsibility.leave_request;

public class LeaveRequest {
    private int days;

    public LeaveRequest(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
