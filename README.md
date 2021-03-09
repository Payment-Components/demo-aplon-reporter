# aplonReported (SDK)
aplonReporter is a Java SDK that provides provides an easy way to generate pretty PDF reports from a SWIFT MT Message.

### Usage 
In the sample project you will find in the resources the [templates folder](./src/main/resources/templates) which contains the report file, the logo for the report and some extra property files that are explained bellow. Also you can find some code samples that shows you how to: 

- [Generate a PDF file from an MT103](./src/main/java/DefaultReportToFile.java)
- [Generate a PDF byte[] from an MT103](./src/main/java/DefaultReportToStream.java)

The output of the above classes is [this pdf](mt103-default.pdf)

### Customizing the PDF

#### change the default message title
By default the messages and fields titles are as given by SWIFT. In case you want to change the default title for a specific message or field, then simply create a new file named titles.properties and put there in a key=value format the values you want to override. For example to change the MT103 description and the description of field 13C of an MT103 create a file like [this](./src/main/resources/templates/titles.properties):

```
103=Custom desc for MT103 message
103_13C=Custom desc for Sender's reference
```

To generate the PDF report the SDK is using JasperReports. You will be given the source code of the report so to customize the look and fill to fit your needs. You can also add new custom fields in the report, and here is an example on how to use this functionality.

- [Generate a PDF with custom fields](./src/main/java/DefaultReportToFileWithExtraProperties.java)

