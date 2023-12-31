package com.davisbase.output.impl;

import com.davisbase.output.DMLOutput;

public class UpdateOutput extends DMLOutput {

    public UpdateOutput(boolean status, int numberOfRecords) {
        super(status, numberOfRecords);
    }

    @Override
    public void display() {
        if (this.getStatus()) {
            System.out.printf("Successfully Updated %d records", this.getNumberOfRecords());
        } else {
            System.out.println("Update Operation failed");
        }
    }

}
