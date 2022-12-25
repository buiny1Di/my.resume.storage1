package storage;

import model.Resume;

import java.util.Objects;

public abstract class AbstractStorage {
    public static final int MAX_LENTH = 5;
    protected Resume[] storage = new Resume[MAX_LENTH];
    protected int size = 0;

    protected abstract int getIndex(String uuid);

    protected abstract void fillDeletedEl(int index);

    protected abstract void insertEl(Resume r, int index);

    protected boolean isOverflow(){
        if (size == MAX_LENTH){
            return true;
        }
        return false;
    }

    private boolean isExist(int index){
        if (index < 0){
            return false;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    public Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }



}
