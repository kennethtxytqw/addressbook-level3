package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub implements Storage {
    
    AddressBook addressBook;

    public StorageStub(String path) {
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return addressBook;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        this.addressBook = addressBook;
    }

}
