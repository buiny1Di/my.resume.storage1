package storage;

import model.Resume;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ResumeStorageTest.class,
                SortedResumeStorageTest.class,
                ListStorageTest.class,
                MapResumeStorageTest.class
        })
public class AllStorageTest {

}
