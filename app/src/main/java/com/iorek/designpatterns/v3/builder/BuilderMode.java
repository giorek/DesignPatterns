package com.iorek.designpatterns.v3.builder;

/***
 * build 类
 */
public class BuilderMode {
    private int age;
    private String name;
    private long phone;
    private String address;
    private long tel;
    private String email;

    private BuilderMode(Builder builder){
        this.age = builder.getAge();
        this.name = builder.getName();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
        this.tel = builder.getTel();
        this.email = builder.getEmail();
    }

    @Override
    public String toString() {
        return "BuilderMode{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * 内部静态构造类
     */
    public static class Builder{
        private int age;
        private String name;
        private long phone;
        private String address;
        private long tel;
        private String email;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public long getPhone() {
            return phone;
        }

        public Builder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public long getTel() {
            return tel;
        }

        public Builder setTel(long tel) {
            this.tel = tel;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public BuilderMode build(){
            return new BuilderMode(this);
        }
    }
}
