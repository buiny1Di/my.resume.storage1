package storage;

import model.Resume;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ResumeStorage extends AbstractArrayStorage{


    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    protected void fillDeletedEl(int index) {
        storage[index] = storage[size - 1];
        storage[size - 1] = null;

    }

    @Override
    protected void insertEl(Resume r, int index) {
        storage[size] = r;
    }
}
