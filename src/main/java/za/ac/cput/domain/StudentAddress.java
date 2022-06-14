package za.ac.cput.domain;

public class StudentAddress {
    private String studentId;
    private String address;

    private StudentAddress(Builder builder) {
       this.studentId = builder.studentId;
       this.address = builder.address;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static class Builder{
        private String studentId;
        private String address;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder copy(StudentAddress studentAddress) {
            this.address = studentAddress.address;
            this.studentId = studentAddress.studentId;
            return this;
        }
        public StudentAddress build(){
            return new StudentAddress(this);

        }
    }

}
