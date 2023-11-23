package com.davisbase.commands.output.impl;

import com.davisbase.commands.output.CommandOutput;

public class InvalidCommandOutput extends CommandOutput {

    @Override
    public void display() {
        System.out.println("Invalid query. Type \"help\" to display supported commands.");
    }
    
}