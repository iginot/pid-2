import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

public class IOoperations {

    Texts screenWriter;

    public IOoperations()
    {
        screenWriter = new Texts();
    }

    public Member[] loadNewMembers(){
        Gson gson = new Gson();
        ListOfNewMembers listFromTheFile = null;

        try (Reader reader = new FileReader("example-member-list.json")) {

            listFromTheFile = gson.fromJson(reader, ListOfNewMembers.class);

        } catch (IOException e) {
            screenWriter.membersImportFailed();
        }
        return listFromTheFile.getMembers();
    }

    public void saveAttendance(HashMap<String, Boolean> attendanceSheet)
    {
        Gson gson = new Gson();
        HashMap<String, Boolean> attendanceSheetToExport = attendanceSheet;

        try (FileWriter writer = new FileWriter("attendance.json")) {
            gson.toJson(attendanceSheetToExport, writer);
            screenWriter.attendanceExportedSuccessfully();
        } catch (IOException e) {
            screenWriter.attendanceExportFailed();
        }
    }

    public HashMap<String, Boolean> loadAttendance()
    {
        Gson gson = new Gson();
        HashMap<String, Boolean> loadedAttendance = new HashMap<>();

        try (Reader reader = new FileReader("attendance.json")) {

            loadedAttendance = gson.fromJson(reader, HashMap.class);
            screenWriter.attendanceImportedSuccessfully();

        } catch (IOException e) {
            screenWriter.attendanceImportFailed();
        }
        return loadedAttendance;
    }
}
