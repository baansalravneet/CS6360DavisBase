package com.davisbase.commands;

import java.util.regex.Pattern;

public enum CommandType {
    EXIT("(?i)^exit\\s?.*"),
    HELP("(?i)^help\\s?.*"),
    CREATE_TABLE("(?i)^create table\\s?.*"),
    SHOW_TABLE("(?i)^show table\\s?.*"),
    DROP_TABLE("(?i)^drop table\\s?.*"),
    CREATE_INDEX("(?i)^create index\\s?.*"),
    INSERT("(?i)^insert\\s?.*"),
    DELETE("(?i)^delete\\s?.*"),
    UPDATE("(?i)^update\\s?.*"),
    SELECT("(?i)^select\\s?.*");

    private final String regex;

    CommandType(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public static CommandType getCommandType(String input) {
        for (CommandType commandType : CommandType.values()) {
            if (Pattern.matches(commandType.getRegex(), input)) {
                return commandType;
            }
        }
        // Return a default value or throw an exception if no match is found
        throw new IllegalArgumentException("No matching command type for input: " + input);
    }

}
