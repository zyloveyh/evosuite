package com.examples.with.different.packagename;

public class TargetMethod {

    public boolean foo() {
        return true;
    }

    public boolean bar() {
        return true;
    }

    public boolean fooDefUse(int num) {
        if (num == 5) {
            num++;
        }
        return 6 == num;
    }

    public boolean barDefUse(int num) {
        if (num == 5) {
            num++;
        }
        return 6 == num;
    }

    public boolean fooTryCatch(int num) {
        try {
            if (num == 0)
                throw new NullPointerException();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return true;
    }

    public boolean barTryCatch(int num) {
        try {
            if (num == 0)
                throw new NullPointerException();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return true;
    }

    public boolean fooException() {
        throw new NullPointerException();
    }

    public boolean barException() {
        throw new NullPointerException();
    }
}
