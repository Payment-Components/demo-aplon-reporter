import gr.datamation.swift.report.SwiftMessageReport;

import java.io.File;

public class DefaultReportToFile {
    public static void main(String[] args) {
        String message = "{1:F21AAAAGRA0AXXX0038089609}{4:{177:0906100929}{451:0}}{1:F01BBBBGRA0AXXX0038089609}{2:O1020731090610LPLPXXXX4C0900002194660906100331N}{3:{108:MT102 002 OF 026}{119:STP}}{4:\n" +
                ":20:00049\n" +
                ":23:SPAY\n" +
                ":50A:/9631357\n" +
                "YMBKJPJT\n" +
                ":71A:SHA\n" +
                ":21:02AA14\n" +
                ":32B:USD55443322,44\n" +
                ":59A:/732-896-C\n" +
                "BMSXMXMM\n" +
                ":33B:USD55443322,44\n" +
                ":32A:011231USD55443322,44\n" +
                ":19:55443322,44\n" +
                "-}{5:{CHK:AF7608BD6DED}{TNG:}}{S:{SPD:}{SAC:}{COP:P}}\n";

        SwiftMessageReport smr = new SwiftMessageReport(
                new File(".").getPath() + "/src/main/resources/templates/SWIFT_REPORT.jasper");
        try {
            smr.createReportFile(message, "mt103_bic_descriptions.pdf");
            //argument 1 is the swift message plain text, argument 2 is the output file name
        } catch (Exception e) {
            System.err.println("Failed to parse the message and create a report due to exception: " + e.getMessage());
        }
    }
}
