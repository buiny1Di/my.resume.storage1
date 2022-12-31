package storage;

import exception.ExistStorageException;
import model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage{

    private List<Resume> list = new ArrayList<Resume>();


    protected Object getSearchKey(String uuid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUuid().equals(uuid)) {
                return i;
            }
        }
        return null;
    }

    protected void doUpdate(Resume r, Object searchKey) {
        list.set( (Integer) searchKey, r);

    }

    protected boolean isExist(Object searchKey) {
        return searchKey != null;
    }

    protected void doSave(Resume r, Object searchKey) {
        list.add(r);
    }

    protected Resume doGet(Object searchKey) {
        return list.get((Integer) searchKey);
    }

    protected void doDelete(Object searchKey) {
        list.remove(((Integer) searchKey).intValue());
    }

    protected List<Resume> doCopyAll() {
        List<Resume> copyOfList = new ArrayList<Resume>();
        copyOfList.addAll(list);
        return copyOfList;
    }



    public Resume[] getAll() {
        Resume[] array = new Resume[size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }




}
