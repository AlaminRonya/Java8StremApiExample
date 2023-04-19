package com.alamin.oop_abstract;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{
    private static final Pattern PATTERN = Pattern.compile("^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n" +
            ")*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
