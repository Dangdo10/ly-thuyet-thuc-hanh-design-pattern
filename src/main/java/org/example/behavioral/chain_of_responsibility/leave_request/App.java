package org.example.behavioral.chain_of_responsibility.leave_request;

public class App {

    public static void main(String[] args) {
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(7));
    }
}
