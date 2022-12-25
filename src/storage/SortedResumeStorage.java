package storage;

import model.Resume;

import java.util.Arrays;
import java.util.Objects;

public class SortedResumeStorage extends AbstractStorage{
    @Override
    protected void fillDeletedEl(int index) {

        if (!isOverflow()) {

        }

    }

    @Override
    protected void insertEl(Resume r, int index) {
        int insertIdx = -index - 1;
        if (index >= 0) {
            insertIdx = -insertIdx;
        }
        System.arraycopy(storage, insertIdx, storage, insertIdx + 1, size - insertIdx);
        storage[insertIdx] = r;
        size++;
    }

    public void save(Resume r) {
        final int index = getIndex(r.getUuid());
        insertEl(r, -1);
        System.out.println("Sorry! but resume whith uuid " + r.getUuid() + " already exist!");
    }


    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index >= 0) {
            int numMoved = size - index - 1;
            if (numMoved > 0) {
                System.arraycopy(storage, index + 1, storage, index, numMoved);
            }
            size--;
        }
        System.out.println("Sorry! but resume whith uuid " + uuid + " is absent!");
    }


    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if (index >= 0) {
            storage[index] = r;
            return;
        }
        System.out.println("Sorry! but " + r.getUuid() + " is absent!");
    }


    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index >= 0) {
            return storage[index];
        }
        System.out.println("Sorry! but resume whith uuid " + uuid + " is absent!");
        return null;
    }
    protected int getIndex(String uuid) {
        Resume searchKey = new Resume(uuid);
        searchKey.setUuid(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }
}
