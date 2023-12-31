package com.davisbase.output.impl;

import com.davisbase.output.DDLOutput;

public class CreateIndexOutput extends DDLOutput {

    public CreateIndexOutput(boolean status) {
        super(status);
    }

    @Override
    public void display() {
        if (getStatus()) {
            System.out.println("Create Index is executed successfully");
        } else {
            System.out.println("Create Index operation failed");
        }
    }

}
