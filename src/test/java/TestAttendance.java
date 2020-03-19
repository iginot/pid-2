import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAttendance {

    Attendance attendanceManager = new Attendance();

    @Test
    public void testIntegrityOfDatabaseAfterExport(){
        int databaseSizeBeforeExport = attendanceManager.attendanceDatabaseSize();
        attendanceManager.attendanceExport();
        int databaseSizeAfterExport = attendanceManager.attendanceDatabaseSize();
        assertEquals(databaseSizeAfterExport, databaseSizeBeforeExport);
    }

    @Test
    public void testAttendanceImport(){
        int databaseSizeBeforeImport = attendanceManager.attendanceDatabaseSize();
        attendanceManager.attendanceImport();
        int databaseSizeAfterImport = attendanceManager.attendanceDatabaseSize();
        assertTrue(databaseSizeAfterImport >= databaseSizeBeforeImport);
    }

    @Test
    public void testDuplicateAttendanceImport(){
        attendanceManager.attendanceImport();
        int databaseSizeBeforeDuplicateImport = attendanceManager.attendanceDatabaseSize();
        attendanceManager.attendanceImport();
        int databaseSizeAfterDuplicateImport = attendanceManager.attendanceDatabaseSize();
        assertEquals(databaseSizeAfterDuplicateImport, databaseSizeBeforeDuplicateImport);
    }
}
