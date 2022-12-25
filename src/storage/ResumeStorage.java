package storage;

import model.Resume;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/*
public class ResumeStorage extends AbstractStorage {

    @Override
    protected void fillDeletedEl(int index) {

    }
}
/*
    @Override
    protected void insertEl(Resume r, int index) {
        if (index < 0) {
            storage[size] = r;
        } else {
            System.arraycopy(storage, index, storage, index + 1, size - index);
            storage[index] = r;
        }
        size++;
    }

    public void save(Resume r) {
        if (Objects.isNull(r.getUuid())) {
            System.out.println("Sorry! but uuid cannot be empty, try again!");
            return;
        }

        if (isOverflow()) {
            System.out.println("Storage is full");
            return;
        }

        } else {
            System.out.println("Sorry! but resume whith uuid " + r.getUuid() + " already exist!");
        }

    }
    public void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (!Objects.isNull(storage[i])) {
                if (Objects.equals(storage[i].getUuid(), uuid)) {
                    storage[i] = null;
                    size--;
                    return;
                }
            }
        }
        System.out.println("Resume which has " + uuid + ", isn't exist");
    }

    public void update(Resume r) {

        for (int i = 0; i < storage.length; i++) {
            if (!Objects.isNull(storage[i])) {
                if (Objects.equals(storage[i].getUuid(), r.getUuid())) {
                    storage[i] = r;
                    return;
                }
            }
        }
        System.out.println("Sorry! but resume whith uuid " + r.getUuid() + " isn't exist!");
    }


    public Resume get(String uuid) {

        for (int i = 0; i < storage.length; i++) {
            if (!Objects.isNull(storage[i].getUuid())) {
                return storage[i];
            }
        }
        System.out.println("Sorry! but resume whith uuid " + uuid + " isn't found!");
        return null;
    }



    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
*/