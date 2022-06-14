package za.ac.cput.factory;

import za.ac.cput.domain.StudentAddress;


public class StudentAddFactory {

    public static StudentAddress createStudentAddress(){
        return new StudentAddress.Builder().setStudentId(createStudentAddress().getAddress())
                                           .setAddress(createStudentAddress().getAddress())
                                           .build();

    }
}
