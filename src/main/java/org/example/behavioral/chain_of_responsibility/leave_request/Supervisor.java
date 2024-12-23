package org.example.behavioral.chain_of_responsibility.leave_request;

public class Supervisor extends Approver {

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 3;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
    }
}
