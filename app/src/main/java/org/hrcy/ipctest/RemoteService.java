package org.hrcy.ipctest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class RemoteService extends Service {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    IAIDLInterface.Stub stub = new IAIDLInterface.Stub() {
        @Override
        public List<Student> getStudent() throws RemoteException {
            return studentList;
        }

        @Override
        public void setStudent(Student student) throws RemoteException {
            studentList.add(student);
        }
    };
}
