// IAIDLInterface.aidl
package org.hrcy.ipctest;

// Declare any non-default types here with import statements
import org.hrcy.ipctest.Student;

interface IAIDLInterface {
    List<Student> getStudent();
    void setStudent(in Student student);
}
