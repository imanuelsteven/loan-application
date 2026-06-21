package com.fif.loanapplication.exception;

import java.rmi.server.UID;

public class LoanApplicationNotFoundException extends RuntimeException {
    public LoanApplicationNotFoundException(UID uid) {
        super("Loan data not found with unique identifier : " + uid);
    }

}
