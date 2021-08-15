package reporting;

public class ReportFormatter {

    String ReportFormatter;

    public ReportFormatter(Object object, FormatType formatType){
        switch (formatType){
            case XML:
                ReportFormatter = convertObjecToXML(object);
                break;
            case CSV:
                ReportFormatter = convertObjecToCSV(object);
                break;
        }
    }

    private String convertObjecToXML(Object object){
        return "XML : <title> "+object.toString()+"</title>";
    }

    private String convertObjecToCSV(Object object){
        return "CSV : ,,, "+object.toString()+",,,";
    }

    protected String getFormattedValue(){
        return ReportFormatter;
    }

}
