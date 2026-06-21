package com.fif.loanapplication.exception;

import java.rmi.server.UID;

public class RepaymentScheduleNotFoundException extends RuntimeException {
    public RepaymentScheduleNotFoundException(UID uid) {
        super("Repayment data not found with unique identifier : " + uid);
    }

}
