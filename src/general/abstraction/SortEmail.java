package general.abstraction;

import java.util.regex.Pattern;

public class SortEmail extends Sort{
    private static String REPORT_NAME = "EMAILS";
    private static Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    Pattern getPattern() {
        return EMAIL_PATTERN;
    }

    @Override
    String getReportName() {
        return REPORT_NAME;
    }
}
